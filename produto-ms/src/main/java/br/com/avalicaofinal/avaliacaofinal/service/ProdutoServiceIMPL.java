package br.com.avalicaofinal.avaliacaofinal.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avalicaofinal.avaliacaofinal.compartilhado.ProdutoDto;
import br.com.avalicaofinal.avaliacaofinal.model.Produto;
import br.com.avalicaofinal.avaliacaofinal.repository.ProdutoRepository;

@Service
public class ProdutoServiceIMPL implements ProdutoService{
    @Autowired
    private ProdutoRepository repo;

    @Override
    public ProdutoDto criarProduto(ProdutoDto produto) {
        return salvarProduto(produto);
    }

    @Override
    public List<ProdutoDto> obterTodos() {
        List<Produto> produtos = repo.findAll();

        return produtos.stream()
            .map(animal -> new ModelMapper().map(animal, ProdutoDto.class))
            .collect(Collectors.toList());
    }

    @Override
    public void removerProduto(String id) {
        repo.deleteById(id);
    }

    @Override
    public ProdutoDto atualizarProduto(String id, ProdutoDto produto) {
        produto.setId(id);
        return salvarProduto(produto);
    }

    private ProdutoDto salvarProduto(ProdutoDto produto) {
        ModelMapper mapper = new ModelMapper();
        Produto produtoEntidade = mapper.map(produto, Produto.class);
        produtoEntidade = repo.save(produtoEntidade);

        return mapper.map(produtoEntidade, ProdutoDto.class);
    }
    
}

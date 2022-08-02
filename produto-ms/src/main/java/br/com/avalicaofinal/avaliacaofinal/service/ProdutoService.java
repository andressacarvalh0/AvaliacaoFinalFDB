package br.com.avalicaofinal.avaliacaofinal.service;

import java.util.List;
import br.com.avalicaofinal.avaliacaofinal.compartilhado.ProdutoDto;

public interface ProdutoService {

    ProdutoDto criarProduto(ProdutoDto produto);
    List<ProdutoDto> obterTodos();
    void removerProduto(String id);
    ProdutoDto atualizarProduto(String id, ProdutoDto produto);
    
}

package br.com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clienteHTTP.ProdutosFeignClient;
import br.com.compartilhado.VendaDTO;
import br.com.model.Venda;
import br.com.repository.VendaRepository;

@Service
public class VendaServiceIMPL implements VendaService{
    @Autowired
    private VendaRepository repo;

    @Autowired
    private ProdutosFeignClient ProdutosMSClient;

    @Override
    public VendaDTO lancarVenda(VendaDTO venda) {
        return salvarVenda (venda);
    }

    private VendaDTO salvarVenda(VendaDTO venda) {
        ModelMapper mapper = new ModelMapper();
        Venda vendaEntidade = mapper.map(venda, Venda.class);
        vendaEntidade = repo.save(vendaEntidade);

        return mapper.map(vendaEntidade, VendaDTO.class);
    }

    @Override
    public List<VendaDTO> obterTodos() {
        List<Venda> vendas = repo.findAll();

        return vendas.stream()
            .map(venda -> new ModelMapper().map(venda, VendaDTO.class))
            .collect(Collectors.toList());
    }

}

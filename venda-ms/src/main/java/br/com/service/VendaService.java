package br.com.service;

import java.util.List;

import br.com.compartilhado.VendaDTO;

public interface VendaService {
    VendaDTO lancarVenda(VendaDTO venda);
    List<VendaDTO> obterTodos();
}

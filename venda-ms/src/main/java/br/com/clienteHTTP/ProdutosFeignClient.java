package br.com.clienteHTTP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.compartilhado.Produto;

@FeignClient(name= "produto-ms", fallback = ProdutosFeignClientFallback.class)
public interface ProdutosFeignClient {

    @GetMapping(path = "/api/produtos/{codigo}/lista")
    List<Produto> obterProdutos(@PathVariable String dono);   
}

@Component
class ProdutosFeignClientFallback implements ProdutosFeignClient {

    @Override
    public List<Produto> obterProdutos(String produto) {
        return new ArrayList<>();
    }
    
}

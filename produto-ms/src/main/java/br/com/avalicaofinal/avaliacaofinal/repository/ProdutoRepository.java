package br.com.avalicaofinal.avaliacaofinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.avalicaofinal.avaliacaofinal.model.Produto;;

public interface ProdutoRepository extends MongoRepository<Produto, String>{
    
}

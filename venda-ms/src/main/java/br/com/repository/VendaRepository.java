package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.model.Venda;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String>{
    
}

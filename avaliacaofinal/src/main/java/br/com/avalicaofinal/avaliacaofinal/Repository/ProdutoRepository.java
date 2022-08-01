package br.com.avalicaofinal.avaliacaofinal.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.avalicaofinal.avaliacaofinal.Model.Produto;;

public interface ProdutoRepository extends MongoRepository<Produto, String>{
    
}

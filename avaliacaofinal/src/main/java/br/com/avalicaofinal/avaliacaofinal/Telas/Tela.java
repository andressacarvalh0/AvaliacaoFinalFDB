package br.com.avalicaofinal.avaliacaofinal.Telas;

import java.util.Scanner;
import org.springframework.data.repository.Repository;

public interface Tela <T, K> {
    void executar(Scanner entrada, Repository<T,K> repositorio);
    
}

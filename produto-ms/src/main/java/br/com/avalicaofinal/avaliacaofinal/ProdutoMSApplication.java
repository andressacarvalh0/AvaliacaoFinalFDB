package br.com.avalicaofinal.avaliacaofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProdutoMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoMSApplication.class, args);
	}

}

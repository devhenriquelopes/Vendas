package io.github.devhenriquelopes.Vendas;

import io.github.devhenriquelopes.Vendas.domain.entity.Cliente;
import io.github.devhenriquelopes.Vendas.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			// Salvando Clientes
			System.out.println("Salvando Clientes");
			clientes.save(new Cliente("Henrique"));
			clientes.save(new Cliente("Henrique Castello"));
			clientes.save(new Cliente("Outro Cliente"));

			List<Cliente> result = clientes.encontrarPorNome("Fulano");
			result.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}

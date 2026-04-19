package com.example.libro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner initData(LibroRepository repository) {
		return args -> {
			// Agregamos algunos datos iniciales automáticamente al iniciar
			if (repository.count() == 0) {
				repository.save(new Libro("Cien años de soledad", "Gabriel García Márquez"));
				repository.save(new Libro("El principito", "Antoine de Saint-Exupéry"));
				repository.save(new Libro("1984", "George Orwell"));
				System.out.println("Base de datos inicializada con libros de prueba.");
			}
		};
	}
}

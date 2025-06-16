package com.transportadora.apilogistica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que marca esta classe como ponto de entrada do Spring Boot.
// Ela ativa o escaneamento de componentes e outras configurações automáticas.
@SpringBootApplication
public class ApiLogisticaApplication {

    // Método principal que inicia a aplicação Spring Boot.
    public static void main(String[] args) {
        SpringApplication.run(ApiLogisticaApplication.class, args);
    }
}

package com.escolaGambarra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

    public static void main(String[] args) {
        // Inicializa o servidor web da Escola XYZ
        SpringApplication.run(Principal.class, args);
        System.out.println("\n>>> Aplicação da Escola Gambarra rodando em: http://localhost:8080 <<<\n");
    }
}
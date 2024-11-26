package com.example.hello_world.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

	@GetMapping
	 public String helloWorld() {
        return "Hello World!";
    }


	@GetMapping("/bsm")
	public List<String> listarBsm() {
		return List.of(
		"Persistência",
        "Responsabilidade Pessoal",
        "Mentalidade de Crescimento",
        "Orientação ao Futuro",
        "Comunicação",
        "Orientação ao Detalhe",
        "Proatividade",
        "Trabalho em Equipe"
    );
}

	
	@GetMapping("/objetivos")
    public List<String> listarObjetivos() {
        return List.of(
            "Revisar conceitos de Spring Boot",
            "Aprender a criar novos endpoints",
            "Praticar integração com Git e GitHub",
            "Aprofundar conhecimento em REST APIs"
        );
    }
}
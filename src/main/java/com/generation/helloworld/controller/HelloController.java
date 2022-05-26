package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloworld() {
		
		return "<b>Hello World!<b>";
	}
	
	@GetMapping ("bsm")
	public String bsm() {
		
		return "Mentalidade de Crescimento<br />"
				+ "Persistência<br />"
				+ "Responsabilidade Pessoal<br />"
				+ "Orientação ao Futuro<br />"
				+ "Comunicação<br />"
				+ "Orientação ao Detalhe<br />"
				+ "Proatividade<br />"
				+ "Trabalho em Equipe";
	}
	
	
	@GetMapping ("obijetivo")
	public String obijetivo() {
		
		return "Dominar Mysql <br />"
				+ "Dominar API <br />"
				+ "Aprender o Insomnia";
	}
}

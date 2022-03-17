package br.com.mercadolivre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadolivre.service.MorseService;

@RestController
public class MorseController {

	@Autowired
	private MorseService service;

	@GetMapping("from-morse")
	public String fraseToMorse(@RequestParam String frase) {
		return service.converteParaMorse(frase);
	}
	
	@GetMapping("to-morse")
	public String morseToFrase(@RequestParam String frase) {
		return service.traduzAlfabeto(frase);
	}

}

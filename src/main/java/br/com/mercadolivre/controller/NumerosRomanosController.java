package br.com.mercadolivre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadolivre.service.RomanosService;

@RestController
public class NumerosRomanosController {

	@Autowired
	private RomanosService service;

	@GetMapping
	public String converteRomano(@RequestParam Integer numero) {
		return service.converteNumero(numero);
	}

}

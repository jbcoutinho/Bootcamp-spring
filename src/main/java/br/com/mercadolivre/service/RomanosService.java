package br.com.mercadolivre.service;

import org.springframework.stereotype.Service;

import br.com.mercadolivre.model.NumerosRomanos;

@Service
public class RomanosService {

	public String converteNumero(Integer numero) {
		return NumerosRomanos.converterEmRomanos(numero);

	}

}

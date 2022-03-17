package br.com.mercadolivre.service;

import org.springframework.stereotype.Service;

import br.com.mercadolivre.model.Morse;

@Service
public class MorseService {

	public String traduzAlfabeto(String frase) {
		return Morse.traduzirAlfabeto(frase);
	}
	
	public String converteParaMorse(String frase) {
		return Morse.traduzirMorse(frase);
	}

}

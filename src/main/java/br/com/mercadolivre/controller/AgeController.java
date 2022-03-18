package br.com.mercadolivre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadolivre.service.AgeService;

@RestController
@RequestMapping("/age")
public class AgeController {

	@Autowired
	private AgeService service;

	@GetMapping("/{day}/{month}/{year}")
	public String getAge(@PathVariable("day") Integer day, @PathVariable("month") Integer month,
			@PathVariable("year") Integer year) {
		return service.getAge(day, month, year);
	}

}

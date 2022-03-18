package br.com.mercadolivre.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

@Service
public class AgeService {

	public String getAge(Integer day, Integer month, Integer year) {
		LocalDate birthDate = LocalDate.of(year, month, day);
		Period period = Period.between(birthDate, LocalDate.now());
		return Integer.toString(period.getYears());
	}

}

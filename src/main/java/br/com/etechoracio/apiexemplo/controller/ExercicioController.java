package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/exercicios")
@RestController
public class ExercicioController {

	@GetMapping("/dobro")
	public double dobro(@RequestParam ("num") int num) 
	{
			return num * 2;
	}
	@GetMapping("/{num1}/{num2}")
	public double potencia(@PathVariable ("num1") double num1, @PathVariable ("num2") double num2) 
	{
		return Math.pow(num1, num2);
	}
	@GetMapping("/sqr")
	public double raiz(@RequestParam ("num") double num) 
	{
		return Math.sqrt(num);
	}
	
	
}

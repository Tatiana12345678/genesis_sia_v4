package com.monolitico.monolitico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MonoliticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonoliticoApplication.class, args);
	}
	@GetMapping("Hungry")
	public static String holaMundo(){
		return "hola mundo";
	}


}
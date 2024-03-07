package com.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Parcial.models.Persona;
import com.Parcial.repository.IPersonaRepository;


@Controller
@RequestMapping("/persona")
public class personaController {
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	@GetMapping ("/registro")
	private String mostrarFormulario (Persona persona) {
		
		return"formulario";
	}
	
	@PostMapping ("/registro")
	private String formularioRegistro (Persona persona) {
		System.out.print("inicio de registro");
		personaRepository.save(persona);
		return"formulario";
	}

}

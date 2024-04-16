package com.evidenciarframework.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evidenciarframework.demo.interfaceservice.IAcudienteService;
import com.evidenciarframework.demo.modelo.Acudiente;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IAcudienteService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Acudiente>Acudientes=service.listar();
		//Enviar el objeto/lista al formulario:
		model.addAttribute("Acudientes",Acudientes);
		return "index";
	}
		
}

package com.evidenciarframework.demo.controler;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
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

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("acudiente",new Acudiente());
		return "AcudienteForm";
	}
	public String save(@Validated Acudiente p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
}

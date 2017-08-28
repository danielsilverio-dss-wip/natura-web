package br.com.omega.naturaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.service.ProjetoService;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;
	
	@GetMapping("/novo")
	private String novo(){
		return "projetos/novo";
	}
	
	@PostMapping("/save")
	private String save(Projeto projeto){
		service.save(projeto);
		return "index";
	}

}

package br.com.omega.naturaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.Ong;
import br.com.omega.naturaweb.service.OngService;

@Controller
@RequestMapping("/ongs")
public class OngController {
	
	private long ONG_ID = 1;
	
	@Autowired
	private OngService service;
	
	@Autowired
	private ProjetoController projetoController;
	
	@GetMapping("/login")
	public String login(){
		
		return "/ongs/login";
	}
	
	@PostMapping("/login")
	public ModelAndView login(String email, String senha){
		
		//Ong ong = service.login(email, senha);
		
		//return projetoController.listar(ong.getId());
		return projetoController.listar(ONG_ID);
	}
	
	@GetMapping("/cadastro")
	public String cadastro(){
		return "/ongs/cadastro";
	}
	
	@PostMapping("/cadastro")
	public ModelAndView cadastro(Ong ong){
		service.save(ong);
		//return projetoController.listar(ong.getId());
		return projetoController.loginRedirect(ONG_ID);
	}
	

}

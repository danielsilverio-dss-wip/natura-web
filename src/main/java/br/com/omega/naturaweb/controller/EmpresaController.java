package br.com.omega.naturaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.Empresa;
import br.com.omega.naturaweb.service.EmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
	
	private long ID_EMPRESA = 1;
	
	@Autowired
	private EmpresaService service;

	@Autowired
	private ProdutosController produtosController;
	
	@GetMapping("/login")
	public String login(){
		return "empresas/login";
	}
	
	@PostMapping("/login")
	public ModelAndView login(String email, String senha){
		//Empresa empresa = service.login(email, senha);
		return produtosController.redirectLogin(ID_EMPRESA);
	}
	
	@GetMapping("/cadastro")
	public String cadastro(){
		return "empresas/cadastro";
	}
	
	@PostMapping("/cadastro")
	public ModelAndView cadastro(Empresa empresa){
		service.save(empresa);
		
		return produtosController.listar(ID_EMPRESA);
	}

}

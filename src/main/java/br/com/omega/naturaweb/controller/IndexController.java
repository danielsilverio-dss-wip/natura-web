package br.com.omega.naturaweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private OngController ongController;
	
	@Autowired
	private EmpresaController empresaController;
	
	@GetMapping
	private String index(){
		return "index";
	}
	
	@GetMapping("ong/login")
	private String ongLogin(){
		return ongController.login();
	}
	
	@GetMapping("empresa/login")
	private String empresaLogin(){
		return empresaController.login();
	}

}

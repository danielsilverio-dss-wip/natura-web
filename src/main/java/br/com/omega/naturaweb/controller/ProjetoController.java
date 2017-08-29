package br.com.omega.naturaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.Ong;
import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.service.OngService;
import br.com.omega.naturaweb.service.ProjetoService;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;

	@Autowired
	private OngService ongService;
	
	@GetMapping("/novo")
	private ModelAndView novo(){
		ModelAndView mv = new ModelAndView("projetos/novo");
		List<Ong> ongs = ongService.findAll();
		mv.addObject("ongs",ongs);
		return mv;
	}
	
	@PostMapping("/save")
	private ModelAndView save(Projeto projeto){
		service.save(projeto);
		return listar();
	}
	
	@GetMapping("/lista")
	private ModelAndView listar(){
		ModelAndView mv = new ModelAndView("projetos/lista");
		mv.addObject("projetos", service.findAll());
		return mv;
	}

}

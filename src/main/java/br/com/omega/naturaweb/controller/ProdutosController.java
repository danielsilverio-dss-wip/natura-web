package br.com.omega.naturaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.Produto;
import br.com.omega.naturaweb.service.ProdutoService;

@Controller
@RequestMapping("/empresas/produtos")
public class ProdutosController {

	private long ID_EMPRESA = 1;

	@Autowired
	private ProdutoService service;

	@GetMapping("/lista")
	public ModelAndView listar(Long ID_EMPRESA) {
		ModelAndView mv = new ModelAndView("/produtos/lista");
		//mv.addObject("empresas", service.findByEmpresaId(ID_EMPRESA));
		return mv;
	}


	public ModelAndView redirectLogin(Long ID_EMPRESA) {
		ModelAndView mv = new ModelAndView("redirect:/empresas/produtos/lista");
		//mv.addObject("empresas", service.findByEmpresaId(ID_EMPRESA));
		return mv;
	}

	
	@GetMapping("/novo")
	public String novo(){
		//ModelAndView mv = new ModelAndView("produtos/novo");
		return "produtos/novo";
		
	}
	
	public ModelAndView save(Produto produto){
		service.save(produto);
		return listar(ID_EMPRESA);
	}
	

}

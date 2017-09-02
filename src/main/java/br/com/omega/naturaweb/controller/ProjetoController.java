package br.com.omega.naturaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.ProdutosPorProjeto;
import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.service.OngService;
import br.com.omega.naturaweb.service.ProdutoService;
import br.com.omega.naturaweb.service.ProdutosPorProjetoService;
import br.com.omega.naturaweb.service.ProjetoService;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;

	@Autowired
	private OngService ongService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutosPorProjetoService produtosPorProjetoService;
	
	@GetMapping("/novo")
	private ModelAndView novo(){
		ModelAndView mv = new ModelAndView("projetos/novo");
		mv.addObject("ongs", ongService.findAll());
		mv.addObject("produtos", produtoService.findAll());
		return mv;
	}
	
	@PostMapping("/save")
	private ModelAndView save(Projeto projeto){
		
		//System.out.println(projeto.getProdutosPorProjeto().getProduto().getId());
		/*
		System.out.println("ong: " + projeto.getOng().getId());
		List<ProdutosPorProjeto> produtos = projeto.getProdutosPorProjeto();
		
		System.out.println("---------------------------------------------------");
		
		for (ProdutosPorProjeto produto : produtos) {
			System.out.println("\tproduto: " + produto.getProduto().getId());
			produto.setQuantidadeFinal(50);
			produto.setQuantidadeFinal(45);
		}
		
		System.out.println("---------------------------------------------------");
		*/
		
		
		
		Projeto projetoPersistido = service.save(projeto);
		long idProjeto = projetoPersistido.getId();
		
		
		
		List<ProdutosPorProjeto> produtos = projeto.getProdutosPorProjeto();
		
		for (ProdutosPorProjeto produto : produtos) {
			
			System.out.println("idProjeto: " + idProjeto);
			
			Projeto p = new Projeto();
			p.setId(idProjeto);
			produto.setProjeto(p);
			
			System.out.println("p.getId()" + p.getId());
			System.out.println("produto.getProjeto().getId(): " + produto.getProjeto().getId());
			produtosPorProjetoService.save(produto);
		}
		
		
		
		
		return listar();
	}
	
	@GetMapping("/lista")
	private ModelAndView listar(){
		ModelAndView mv = new ModelAndView("projetos/lista");
		mv.addObject("projetos", service.findAll());
		return mv;
	}

}

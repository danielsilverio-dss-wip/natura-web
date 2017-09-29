package br.com.omega.naturaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
//@RequestMapping("ongs/{id}/projetos")
@RequestMapping("ongs/projetos")
public class ProjetoController {
	
	private long ID_ONG = 1;
	
	@Autowired
	private ProjetoService service;

	@Autowired
	private OngService ongService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutosPorProjetoService produtosPorProjetoService;
	
	@GetMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("projetos/novo");
		//mv.addObject("ongs", ongService.findAll());
		//mv.addObject("produtos", produtoService.findAll());
		return mv;
	}
	
	@PostMapping("/save")
	public ModelAndView save(@PathVariable Projeto projeto){
		
		System.out.println("imagem: " + projeto.getImagem());
		/*
		Projeto projetoPersistido = service.save(projeto);
		long idProjeto = projetoPersistido.getId();
		
		List<ProdutosPorProjeto> produtos = projeto.getProdutosPorProjeto();
		
		for (ProdutosPorProjeto produto : produtos) {
			
			System.out.println("idProjeto: " + idProjeto);
			
			Projeto p = new Projeto();
			p.setId(idProjeto);
			produto.setProjeto(p);
			
			//produtosPorProjetoService.save(produto);
		}
		*/
		return listar(ID_ONG);
	}
	
	public ModelAndView loginRedirect(Long id){
		ModelAndView mv = new ModelAndView("redirect:/ongs/projetos/lista");
		// mv.addObject("projetos", service.findByOngId(id));
		return mv;
	}
	
	@GetMapping("/lista")
	public ModelAndView listar(Long id){
		ModelAndView mv = new ModelAndView("projetos/lista");
		// mv.addObject("projetos", service.findByOngId(id));
		return mv;
	}

}

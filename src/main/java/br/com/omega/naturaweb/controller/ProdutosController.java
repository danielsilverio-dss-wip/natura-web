package br.com.omega.naturaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		
		List<Produto> listaTeste = new ArrayList<Produto>();
		
		listaTeste.add(new Produto("produto1", null, true));
		listaTeste.add(new Produto("produto2", null, false));
		listaTeste.add(new Produto("produto3", null, true));
		
		mv.addObject("produtos", listaTeste);
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
	
	@PostMapping("/save")
	public ModelAndView save(Produto produto){
		service.save(produto);
		return listar(ID_EMPRESA);
	}

	@PostMapping("/teste")
	public void teste(@RequestBody List<Produto> produtos){
		
		for (Produto produto : produtos) {
			System.out.println("id: " + produto.getId() + " fornecido: " + produto.isFornecido());
		}
		//service.save(produto);
		//return listar(ID_EMPRESA);
	}

}

package br.com.omega.naturaweb.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.service.OngService;
import br.com.omega.naturaweb.service.ProdutoService;
import br.com.omega.naturaweb.service.ProdutosPorProjetoService;
import br.com.omega.naturaweb.service.ProjetoService;
import br.com.omega.naturaweb.to.ProjetoTO;

@Controller
//@RequestMapping("ongs/{id}/projetos")
@RequestMapping("ongs/projetos")
public class ProjetoController {
	
	private long ID_ONG = 1;
	private static Projeto testeProjeto;
	
	public ProjetoController() {
		super();
		testeProjeto = new Projeto();
	}

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
		mv.addObject("ongs", ongService.findAll());
		mv.addObject("produtos", produtoService.findAll());
		return mv;
	}
	/*
	@PostMapping(value="/save", consumes=MediaType.APPLICATION_FORM_URLENCODED)
	public ModelAndView save(Projeto projeto){
	 */
	@PostMapping("/save")
	public ModelAndView save(@RequestBody ProjetoTO projeto){
		
		projeto.setImagem(testeProjeto.getImagem());
		
		System.out.println("nome:" + projeto.getNome());
		System.out.println("descricao:" + projeto.getDescricao());
		System.out.println("ong:" + projeto.getOng());
		System.out.println("img:" + projeto.getImagem());

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
	
	// @RequestMapping(method = RequestMethod.POST, value = "/upload")
	@PostMapping("/upload")
    @ResponseBody
    public void uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
		
		testeProjeto.setImagem(multipartFile.getBytes());
		/*
		byte[] bytes = multipartFile.getBytes();
		
		File file = new File("d:/sl/teste/teste.jpg");
		//multipartFile.transferTo(file);
		
		try ( FileOutputStream outputStream = new FileOutputStream(file); ) {
	        outputStream.write(multipartFile.getBytes()); 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		*/
		
		/*
		ModelAndView mv = new ModelAndView("redirect:/ongs/projetos/lista");
		mv.addObject("testeimagem", bytes)
		return mv;
		 */
		
    }
	
	/*
	@PostMapping("/teste")
	public ModelAndView teste(@RequestBody Projeto projeto){
		System.out.println("nome:" + projeto.getNome());
		System.out.println("desc:" + projeto.getDescricao());
		System.out.println("img:" + projeto.getImagem());
		return listar(ID_ONG);
	}
	*/
}

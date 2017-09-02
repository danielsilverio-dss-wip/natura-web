package br.com.omega.naturaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.ProdutosPorProjeto;
import br.com.omega.naturaweb.repository.ProdutosPorProjetoRepository;
import br.com.omega.naturaweb.service.ProdutosPorProjetoService;

@Component
public class ProdutosPorProjetoServiceImpl implements ProdutosPorProjetoService{

	@Autowired
	private ProdutosPorProjetoRepository repository; 
	
	@Override
	public void save(ProdutosPorProjeto produtosPorProjeto) {
		repository.save(produtosPorProjeto);
	}

	@Override
	public ProdutosPorProjeto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<ProdutosPorProjeto> findAll() {
		return repository.findAll();
	}

}

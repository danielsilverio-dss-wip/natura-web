package br.com.omega.naturaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Produto;
import br.com.omega.naturaweb.repository.ProdutoRepository;
import br.com.omega.naturaweb.service.ProdutoService;

@Component
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public void save(Produto produto) {
		repository.save(produto);
	}

	@Override
	public Produto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Produto> findAll() {
		return repository.findAll();
	}

}

package br.com.omega.naturaweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.naturaweb.entity.Produto;

@Service
public interface ProdutoService {
	
	public void save(Produto produto);
	public Produto findOne(long id);
	public List<Produto> findAll();

}

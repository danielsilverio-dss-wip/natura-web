package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Produto;

@Component
public interface ProdutoRepository{
	
	public void save(Produto produto);
	public Produto findOne(long id);
	public List<Produto> findAll();
	public List<Produto> findByEmpresaId(long id);
	
}

package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.ProdutosPorProjeto;

@Component
public interface ProdutosPorProjetoRepository {
	
	public void save(ProdutosPorProjeto produtosPorProjeto);
	public ProdutosPorProjeto findOne(long id);
	public List<ProdutosPorProjeto> findAll();

}

package br.com.omega.naturaweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.naturaweb.entity.ProdutosPorProjeto;

@Service
public interface ProdutosPorProjetoService {
	
	public void save(ProdutosPorProjeto produtosPorProjeto);
	public ProdutosPorProjeto findOne(long id);
	public List<ProdutosPorProjeto> findAll();

}

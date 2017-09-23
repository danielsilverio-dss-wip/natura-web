package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Projeto;

@Component
public interface ProjetoRepository {
	
	public Projeto save(Projeto projeto);
	public Projeto findOne(long id);
	public List<Projeto> findAll();
	public List<Projeto> findByOngId(long id);

}

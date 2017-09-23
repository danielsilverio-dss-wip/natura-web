package br.com.omega.naturaweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.naturaweb.entity.Projeto;

@Service
public interface ProjetoService {
	
	public Projeto save(Projeto projeto);
	public Projeto findOne(long id);
	public List<Projeto> findAll();
	public List<Projeto> findByOngId(long id);

}

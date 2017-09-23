package br.com.omega.naturaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.repository.ProjetoRepository;
import br.com.omega.naturaweb.service.ProjetoService;

@Component
public class ProjetoServiceImpl implements ProjetoService {

	@Autowired
	private ProjetoRepository repository;
	
	@Override
	public Projeto save(Projeto projeto) {
		return repository.save(projeto);
		
	}

	@Override
	public Projeto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Projeto> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Projeto> findByOngId(long id) {
		return repository.findByOngId(id);
	}

}

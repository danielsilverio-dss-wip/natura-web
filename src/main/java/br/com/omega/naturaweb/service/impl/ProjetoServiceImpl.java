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
	public void save(Projeto projeto) {
		repository.save(projeto);
		
	}

	@Override
	public Projeto findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Projeto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package br.com.omega.naturaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Empresa;
import br.com.omega.naturaweb.repository.EmpresaRepository;
import br.com.omega.naturaweb.service.EmpresaService;
import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public void save(Empresa empresa) {
		repository.save(empresa);
	}

	@Override
	public Empresa findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Empresa> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Empresa login(String email, String senha) {
		Empresa empresa = new Empresa();
		empresa.setId(1);
		return empresa;
	}

}

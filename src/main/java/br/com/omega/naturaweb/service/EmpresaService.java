package br.com.omega.naturaweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.naturaweb.entity.Empresa;

@Service
public interface EmpresaService {
	
	public void save(Empresa empresa);
	public Empresa findOne(long id);
	public List<Empresa> findAll();
	public Empresa login(String email, String senha);

}

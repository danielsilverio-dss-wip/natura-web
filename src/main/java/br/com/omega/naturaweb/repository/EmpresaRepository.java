package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Empresa;

@Component
public interface EmpresaRepository {

	public Empresa save(Empresa empresa);
	public Empresa findOne(long id);
	public List<Empresa> findAll();
	
}

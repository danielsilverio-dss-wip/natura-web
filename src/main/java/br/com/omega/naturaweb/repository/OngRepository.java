package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Ong;

@Component
public interface OngRepository {
	
	public void save(Ong ong);
	public Ong findOne(long id);
	public List<Ong> findAll();

}

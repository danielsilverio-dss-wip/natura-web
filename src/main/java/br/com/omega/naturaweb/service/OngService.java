package br.com.omega.naturaweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.naturaweb.entity.Ong;

@Service
public interface OngService {
	
	public void save(Ong ong);
	public Ong findOne(long id);
	public List<Ong> findAll();
	public Ong login(String email, String senha);

}

package br.com.omega.naturaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.naturaweb.entity.Ong;
import br.com.omega.naturaweb.repository.OngRepository;
import br.com.omega.naturaweb.service.OngService;

@Component
public class OngServiceImpl implements OngService{

	@Autowired
	private OngRepository repository;
	
	@Override
	public void save(Ong ong) {
		repository.save(ong);
	}

	@Override
	public Ong findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Ong> findAll() {
		return repository.findAll();
	}

	@Override
	public Ong login(String email, String senha) {
		Ong ong = new Ong();
		ong.setId(1);
		return ong;
	}

}

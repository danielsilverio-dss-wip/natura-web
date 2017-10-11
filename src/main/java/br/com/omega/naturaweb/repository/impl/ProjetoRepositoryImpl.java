package br.com.omega.naturaweb.repository.impl;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceException;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.omega.naturaweb.entity.Projeto;
import br.com.omega.naturaweb.repository.ProjetoRepository;

@Component
public class ProjetoRepositoryImpl implements ProjetoRepository{
	
	private static final String URL = Url.getUrl() + "/projeto/";
	//private static final String URL = "http://localhost:8081/projeto/";
	
	private Client client =  Client.create();
	
	@Override
	public List<Projeto> findAll()throws WebServiceException{
		WebResource resource = client.resource(URL);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
		
		Projeto[] array = response.getEntity(Projeto[].class);

		return Arrays.asList(array);
	}
				
	@Override
	public Projeto findOne(long id) throws WebServiceException{
		WebResource resource = client.resource(URL + id);
		
		ClientResponse response = resource
				.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(Projeto.class);
	}
	
	@Override
	public Projeto save(Projeto projeto) throws WebServiceException{
		WebResource resource = client.resource(URL);
		
		ClientResponse response = resource
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, projeto);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(Projeto.class);
	}

	@Override
	public List<Projeto> findByOngId(long id)throws WebServiceException{
		WebResource resource = client.resource(URL + "busca/" + id);
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
		
		Projeto[] array = response.getEntity(Projeto[].class);
		return Arrays.asList(array);
	}
	
	/*
	public void remover(int codigo) throws WebServiceException{
		WebResource resource = client.resource(URL + codigo);
		
		ClientResponse response = 
				resource.delete(ClientResponse.class);
		
		if (response.getStatus() != 204){
			throw new WebServiceException("HTTP Status: " +
					response.getStatus());
		}
	}
	*/

}

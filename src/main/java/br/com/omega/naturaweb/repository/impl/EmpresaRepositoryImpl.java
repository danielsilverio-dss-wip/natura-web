package br.com.omega.naturaweb.repository.impl;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceException;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.omega.naturaweb.entity.Empresa;
import br.com.omega.naturaweb.repository.EmpresaRepository;

@Component
public class EmpresaRepositoryImpl implements EmpresaRepository{

	private static final String URL = Url.getUrl() + "/empresa/";
	
	private Client client =  Client.create();
	
	@Override
	public List<Empresa> findAll() throws WebServiceException{
		WebResource resource = client.resource(URL);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
		
		Empresa[] array = response.getEntity(Empresa[].class);

		return Arrays.asList(array);
	}
				
	@Override
	public Empresa findOne(long id) throws WebServiceException{
		WebResource resource = client.resource(URL + id);
		
		ClientResponse response = resource
				.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(Empresa.class);
	}
	
	@Override
	public Empresa save(Empresa empresa) throws WebServiceException{
		WebResource resource = client.resource(URL);
		
		ClientResponse response = resource
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, empresa);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(Empresa.class);
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

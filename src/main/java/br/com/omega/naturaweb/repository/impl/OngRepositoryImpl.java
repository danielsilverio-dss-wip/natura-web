package br.com.omega.naturaweb.repository.impl;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceException;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.omega.naturaweb.entity.Ong;
import br.com.omega.naturaweb.repository.OngRepository;

@Component
public class OngRepositoryImpl implements OngRepository{

	
	private static final String URL = Url.getUrl() + "/ong/";
	//private static final String URL = "http://localhost:8081/projeto/";
	
	private Client client =  Client.create();
	
	@Override
	public List<Ong> findAll()throws WebServiceException{
		WebResource resource = client.resource(URL);
		
		//Chama Web service
		ClientResponse response = resource.accept(
				MediaType.APPLICATION_JSON)
					.get(ClientResponse.class);
			
			//Valida se deu certo a busca 
			if (response.getStatus() != 200){
				throw new WebServiceException("Http Status: " + 
						response.getStatus());
			}

			//Recupera a resposta do servidor
			Ong[] array = 
					response.getEntity(Ong[].class);
			return Arrays.asList(array);
		}
				
	@Override
	public Ong findOne(long codigo) throws WebServiceException{
		WebResource resource = client.resource(URL + codigo);
		
		ClientResponse response = resource
				.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(Ong.class);
	}
	
	@Override
	public void save(Ong ong) throws WebServiceException{
		WebResource resource = client.resource(URL);
		
		ClientResponse response = resource
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, ong);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
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

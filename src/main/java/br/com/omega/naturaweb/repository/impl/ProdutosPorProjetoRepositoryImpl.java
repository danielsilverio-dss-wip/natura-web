package br.com.omega.naturaweb.repository.impl;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceException;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.omega.naturaweb.entity.ProdutosPorProjeto;
import br.com.omega.naturaweb.repository.ProdutosPorProjetoRepository;

@Component
public class ProdutosPorProjetoRepositoryImpl implements ProdutosPorProjetoRepository{
	
	private static final String URL = Url.getUrl() + "/produtosPorProjeto/";
	//private static final String URL = "http://localhost:8081/projeto/";
	
	private Client client =  Client.create();
	
	@Override
	public List<ProdutosPorProjeto> findAll()throws WebServiceException{
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
			ProdutosPorProjeto[] array = 
					response.getEntity(ProdutosPorProjeto[].class);
			return Arrays.asList(array);
		}
				
	@Override
	public ProdutosPorProjeto findOne(long codigo) throws WebServiceException{
		WebResource resource = client.resource(URL + codigo);
		
		ClientResponse response = resource
				.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		
		if (response.getStatus() != 200){
			throw new WebServiceException("Http Status: " +
					response.getStatus());
		}
		return response.getEntity(ProdutosPorProjeto.class);
	}
	
	@Override
	public void save(ProdutosPorProjeto ProdutosPorProjeto) throws WebServiceException{
		WebResource resource = client.resource(URL);
		
		ClientResponse response = resource
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, ProdutosPorProjeto);
		
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

package br.com.omega.naturaweb.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Empresa {
	
	
	private long id;
	
	private String email;
	
	private String nome;
	
	private String cnpj;
	
	private String linkBusca;
	
	private List<Produto> produtos;
	
	public Empresa(){};
	
	public Empresa(long id, String email, String nome, String cnpj, String linkBusca) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.cnpj = cnpj;
		this.linkBusca = linkBusca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkBusca() {
		return linkBusca;
	}

	public void setLinkBusca(String linkBusca) {
		this.linkBusca = linkBusca;
	}
	
}
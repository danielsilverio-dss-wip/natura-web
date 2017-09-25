package br.com.omega.naturaweb.entity;

import java.util.List;

public class Produto{
	

	private long id;
	
	private String nome;
	
	private Categoria categoria;
	
	private boolean fornecido;

	private List<Empresa> empresas;
	
	public Produto(){}

	public Produto(long id, String nome, Categoria categoria, boolean fornecido) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.fornecido = fornecido;
	}
	
	public Produto(String nome, Categoria categoria, boolean fornecido) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.fornecido = fornecido;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public boolean isFornecido() {
		return fornecido;
	}

	public void setFornecido(boolean fornecido) {
		this.fornecido = fornecido;
	}
	
	
		
}
package br.com.omega.naturaweb.entity;

import java.util.List;

public class Categoria {
	

	private int id;

	private String nome;
	
	private List<Produto> produtos;
	
	public Categoria(){};
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
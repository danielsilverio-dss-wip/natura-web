package br.com.omega.naturaweb.entity;

public class Projeto {
	
	private long id;
	private String nome;
	private String descricao;
	//private Ong ong;
	//private List<ProdutosPorProjeto> produtosPorProjeto;
	//private List<Compra> compras;
	
	public Projeto(){}
	
	public Projeto(long id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}

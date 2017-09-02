package br.com.omega.naturaweb.entity;

public class ProdutosPorProjeto {
	
	private long id;
	
	private Produto produto;
	
	private Projeto projeto;
	
	private int quantidadeFinal;
	
	private int quantidadeArrecadada;

	public ProdutosPorProjeto(){}
	
	public ProdutosPorProjeto(long id, Produto produto, Projeto projeto, int quantidadeFinal, int quantidadeArrecadada) {
		super();
		this.id = id;
		this.produto = produto;
		this.projeto = projeto;
		this.quantidadeFinal = quantidadeFinal;
		this.quantidadeArrecadada = quantidadeArrecadada;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public int getQuantidadeFinal() {
		return quantidadeFinal;
	}

	public void setQuantidadeFinal(int quantidadeFinal) {
		this.quantidadeFinal = quantidadeFinal;
	}

	public int getQuantidadeArrecadada() {
		return quantidadeArrecadada;
	}

	public void setQuantidadeArrecadada(int quantidadeArrecadada) {
		this.quantidadeArrecadada = quantidadeArrecadada;
	}
	
	
	
}

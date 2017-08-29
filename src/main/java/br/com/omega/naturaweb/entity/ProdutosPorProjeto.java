package br.com.omega.naturaweb.entity;

public class ProdutosPorProjeto {
	
	private Produto produto;
	
	private Projeto projeto;
	
	private int quantidadeFinal;
	
	private int quantidadeArrecadada;

	public ProdutosPorProjeto(){}
	
	public ProdutosPorProjeto(Produto produto, Projeto projeto, int quantidadeFinal, int quantidadeArrecadada) {
		super();
		this.produto = produto;
		this.projeto = projeto;
		this.quantidadeFinal = quantidadeFinal;
		this.quantidadeArrecadada = quantidadeArrecadada;
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

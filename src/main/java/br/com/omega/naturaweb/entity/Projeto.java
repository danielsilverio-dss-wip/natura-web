package br.com.omega.naturaweb.entity;

import java.util.List;

public class Projeto {
	
	private long id;
	private String nome;
	private String descricao;
	private Ong ong;
	private byte[] imagem;
	private List<ProdutosPorProjeto> produtosPorProjeto;
	//private List<Compra> compras;
	
	public Projeto(){}
	
	public Projeto(long id, String nome, String descricao, Ong ong, byte[] imagem,
			List<ProdutosPorProjeto> produtosPorProjeto) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ong = ong;
		this.imagem = imagem;
		this.produtosPorProjeto = produtosPorProjeto;
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
	public Ong getOng() {
		return ong;
	}
	public void setOng(Ong ong) {
		this.ong = ong;
	}
	public List<ProdutosPorProjeto> getProdutosPorProjeto() {
		return produtosPorProjeto;
	}
	public void setProdutosPorProjeto(List<ProdutosPorProjeto> produtosPorProjeto) {
		this.produtosPorProjeto = produtosPorProjeto;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
}

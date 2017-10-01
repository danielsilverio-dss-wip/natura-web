package br.com.omega.naturaweb.to;

public class ProjetoTO {
	
	private long id;
	private String nome;
	private String descricao;
	private long ong;
	private byte[] imagem;
	private long[] produtosPorProjeto;
	
	public ProjetoTO(){}
	
	public ProjetoTO(long id, String nome, String descricao, long ong, byte[] imagem,
			long[] produtosPorProjeto) {
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
	public long getOng() {
		return ong;
	}
	public void setOng(long ong) {
		this.ong = ong;
	}
	public long[] getProdutosPorProjeto() {
		return produtosPorProjeto;
	}
	public void setProdutosPorProjeto(long[] produtosPorProjeto) {
		this.produtosPorProjeto = produtosPorProjeto;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	

}

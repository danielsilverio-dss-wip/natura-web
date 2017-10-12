package br.com.omega.naturaweb.to;

public class ProdutosPorProjetoTO {
	
	private long id;
	private int quantidade;
	
	public ProdutosPorProjetoTO() {}
	
	public ProdutosPorProjetoTO(long id, int quantidade) {
		super();
		this.id = id;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}

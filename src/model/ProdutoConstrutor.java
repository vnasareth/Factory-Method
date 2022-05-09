package model;

public class ProdutoConstrutor {
	  private Produto produto;

	  ProdutoConstrutor() {
	    this.produto = new Produto();
	  }

	  public static ProdutoConstrutor builder() {
	    return new ProdutoConstrutor();
	  }

	  public ProdutoConstrutor adicionaNome(String nome) {
	    produto.setNome(nome);
	    return this;
	  }


	  public ProdutoConstrutor adicionaCor(String cor) {
	    produto.setCor(cor);
	    return this;
	  }


	  public ProdutoConstrutor adicionaMarca(String marca) {
	    produto.setMarca(marca);
	    return this;
	  }


	  public ProdutoConstrutor adicionaFabricante(String fabricante) {
	    produto.setFabricante(fabricante);
	    return this;
	  }

	  public Produto get() {
	    return this.produto;
	  }
	}

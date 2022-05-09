package model;

public class Produto {

	  private String nome;
	  private String cor;
	  private String marca;
	  private String fabricante;


	  public String getNome() {
	    return this.nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getCor() {
	    return this.cor;
	  }

	  public void setCor(String cor) {
	    this.cor = cor;
	  }

	  public String getMarca() {
	    return this.marca;
	  }

	  public void setMarca(String marca) {
	    this.marca = marca;
	  }

	  public String getFabricante() {
	    return this.fabricante;
	  }

	  public void setFabricante(String fabricante) {
	    this.fabricante = fabricante;
	  }

	  @Override
	  public String toString() {
	    return "{" +
	        ", \"NOME PRODUTO\"='" + getNome() + "'" +
	        ", \"COR DO PRODUTO\"='" + getCor() + "'" +
	        ", \"MARCA DO PRODUTO\"='" + getMarca() + "'" +
	        ", \"FABRICANTE DO PRODUTO\"='" + getFabricante() + "'" +
	        "}";
	  }

	}
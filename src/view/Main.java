package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoConstrutor;

class Principal {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    Produto calcado1 = ProdutoConstrutor.builder()
        .adicionaCor("Rosa")
        .get();

    Produto calcado2 = ProdutoConstrutor.builder()
        .adicionaCor("Azul")
        .get();

    Produto calcado3 = ProdutoConstrutor.builder()
        .adicionaCor("Laranja")
        .get();

    Produto camiseta1 = ProdutoConstrutor.builder()
        .adicionaCor("Preto")
        .adicionaMarca("Adidas")
        .get();

    Produto camiseta2 = ProdutoConstrutor.builder()
        .adicionaCor("Amarela")
        .adicionaMarca("ABC")
        .get();

    Produto camiseta3 = ProdutoConstrutor.builder()
        .adicionaCor("Marrom")
        .adicionaMarca("DBC")
        .get();

    Produto jogo1 = ProdutoConstrutor.builder()
        .adicionaNome("Assasins Creed")
        .get();

    Produto jogo2 = ProdutoConstrutor.builder()
        .adicionaNome("Farcry 5")
        .get();

    Produto jogo3 = ProdutoConstrutor.builder()
        .adicionaNome("Fortnite")
        .get();

    Produto armazenamento1 = ProdutoConstrutor.builder()
        .adicionaFabricante("ABC")
        .get();

    Produto armazenamento2 = ProdutoConstrutor.builder()
        .adicionaFabricante("XXX")
        .get();

    Produto armazenamento3 = ProdutoConstrutor.builder()
        .adicionaFabricante("ZZZ")
        .get();

    produtos.add(calcado1);
    produtos.add(calcado2);
    produtos.add(calcado3);
    produtos.add(camiseta1);
    produtos.add(camiseta2);
    produtos.add(camiseta3);
    produtos.add(jogo1);
    produtos.add(jogo2);
    produtos.add(jogo3);
    produtos.add(armazenamento1);
    produtos.add(armazenamento2);
    produtos.add(armazenamento3);

    System.out.println(produtos.toString());
  }
}
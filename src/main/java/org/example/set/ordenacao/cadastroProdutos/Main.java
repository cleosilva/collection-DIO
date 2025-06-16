package org.example.set.ordenacao.cadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "Feijão", 5.33, 100);
        cadastroProdutos.adicionarProduto(124, "Arroz", 26.99, 500);
        cadastroProdutos.adicionarProduto(123, "Macarrão", 9.55, 1000);
        cadastroProdutos.adicionarProduto(126, "Macarrão Alegre", 9.55, 1000);


        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutosPorPreco();
    }
}

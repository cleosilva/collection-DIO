package org.example.set.ordenacao.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(cod, nome, preco, quantidade ));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        System.out.println("Lista Produtos por Nome:");
        for (Produto p: produtosPorNome){
            System.out.println(p);
        }
        return produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        System.out.println("Lista produtos por preço:");
        for(Produto p: produtosPorPreco){
            System.out.println(p);
        }
        return produtosPorPreco;
    }
}

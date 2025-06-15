package org.example.list.carrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemARemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for (Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemARemover.add(i);
                }
            }
            itemList.removeAll(itemARemover);
        } else {
            System.out.println("Carrinho está vazio!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item i : itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.printf("Total: R$%.2f%n", valorTotal);
        return valorTotal;
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("O carrinho está vazio");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
}

package org.example.list.carrinhoDeCompra;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Bola de gude", 1.55, 10);
        carrinhoDeCompras.adicionarItem("Caixa bombom", 25.99, 1);


        carrinhoDeCompras.removerItem("Bola de gude");
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.exibirItens();
    }

}

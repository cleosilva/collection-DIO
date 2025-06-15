package org.example.list.ordenacaoDeNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(0);

        System.out.println(ordenacaoNumeros.getListNumeros());

        ordenacaoNumeros.ordenarAscendente();
        System.out.println(ordenacaoNumeros.getListNumeros());
        ordenacaoNumeros.ordenarDescendente();
        System.out.println(ordenacaoNumeros.getListNumeros());

    }
}

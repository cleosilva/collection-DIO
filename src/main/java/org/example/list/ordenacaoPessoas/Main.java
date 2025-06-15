package org.example.list.ordenacaoPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Lucas", 23, 1.75);
        ordenacaoPessoas.adicionarPessoa("Maria", 16, 1.80);
        ordenacaoPessoas.adicionarPessoa("Manoel", 46, 1.80);
        ordenacaoPessoas.adicionarPessoa("Joaquim", 16, 2.00);

        ordenacaoPessoas.exibirPessoas();
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());


    }
}

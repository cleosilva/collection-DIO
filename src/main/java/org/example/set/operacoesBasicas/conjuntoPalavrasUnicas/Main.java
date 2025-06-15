package org.example.set.operacoesBasicas.conjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Samuka");
        palavrasUnicas.adicionarPalavra("Preta");
        palavrasUnicas.adicionarPalavra("Nina");
        palavrasUnicas.adicionarPalavra("Preta");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.verificarPalavra("Preta");
        palavrasUnicas.verificarPalavra("Luna");

        palavrasUnicas.removerPalavra("Samuka");

        palavrasUnicas.exibirPalavrasUnicas();

    }
}

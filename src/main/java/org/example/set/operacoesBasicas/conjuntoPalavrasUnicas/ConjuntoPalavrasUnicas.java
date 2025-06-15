package org.example.set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (palavrasUnicas.remove(palavra)) {
            System.out.println(palavra + " removida com sucesso.");
        } else {
            System.out.println(palavra + " não encontrada no conjunto.");
        }
    }

    public boolean verificarPalavra(String palavra){
        boolean encontrada = palavrasUnicas.contains(palavra);
        if (encontrada){
            System.out.println(palavra + " foi encontrada no conjunto.");
        } else {
            System.out.println(palavra + " não foi encontrada no conjunto.");
        }
        return encontrada;
    }

    public void exibirPalavrasUnicas(){
        System.out.println("Palavras únicas no conjunto: " + palavrasUnicas);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicas +
                '}';
    }
}

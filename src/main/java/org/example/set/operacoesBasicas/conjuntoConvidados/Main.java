package org.example.set.operacoesBasicas.conjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Preta", 123);
        conjuntoConvidados.adicionarConvidado("Samuka", 124);
        conjuntoConvidados.adicionarConvidado("Nina", 125);
        conjuntoConvidados.adicionarConvidado("Luna", 123);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(124);
        conjuntoConvidados.exibirConvidados();

        int total = conjuntoConvidados.contarConvidados();
        System.out.println(total);

    }
}

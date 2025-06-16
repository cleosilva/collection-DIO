package org.example.set.pesquisaSet;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Preta Maria", "11988554122");
        agenda.adicionarContato("Samuka", "12987744110");
        agenda.adicionarContato("Preta", "11977552200");
        agenda.adicionarContato("Preta", "11977552200");


        agenda.exibirContatos();

        System.out.println("Resultado da pesquisa por nome:");
        System.out.println(agenda.pesquisarPorNome("Preta"));

        agenda.atualizarNumeroContato("Preta", "35988552114");
        agenda.exibirContatos();

    }
}

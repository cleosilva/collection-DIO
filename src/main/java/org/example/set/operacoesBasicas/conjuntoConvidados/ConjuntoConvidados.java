package org.example.set.operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        boolean adicionado = convidados.add(new Convidado(nome, codigoConvite));
        if(!adicionado){
            System.out.println("Já existe um convidado com o código " + codigoConvite);
        }
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        boolean removido = convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);
        if (removido){
            System.out.println("Convidado com código " + codigoConvite + " removido.");
        } else {
            System.out.println("Nenhum convidado encontrado com código " + codigoConvite);
        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        if (convidados.isEmpty()){
            System.out.println("Nenhum convidado no conjunto.");
        } else {
            System.out.println("Lista de convidados:");
            for (Convidado c : convidados){
                System.out.println(c);
            }
        }
    }

}

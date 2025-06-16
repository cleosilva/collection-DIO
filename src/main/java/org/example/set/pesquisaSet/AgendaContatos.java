package org.example.set.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println("Lista de contatos:");
        for (Contato c : contatoSet){
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().toLowerCase().startsWith(nome.toLowerCase())){
                pesquisaPorNome.add(c);
            }
        }
        return pesquisaPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoParaAtualizar = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        if (contatoParaAtualizar != null){
            contatoSet.remove(contatoParaAtualizar);
            Contato atualizado = new Contato(nome, novoNumero);
            contatoSet.add(atualizado);
            return atualizado;
        }
        return null;
    }
}

package org.example.list.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(listNumeros);
    }

    public void ordenarDescendente(){
        Collections.sort(listNumeros,Collections.reverseOrder());
    }
    public List<Integer> getListNumeros(){
        return listNumeros;
    }
}

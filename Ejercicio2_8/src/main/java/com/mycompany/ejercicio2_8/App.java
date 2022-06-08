package com.mycompany.ejercicio2_8;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(4);
        lista.add(2);
        lista.add(7);
        lista.add(8);
        ListadoPares objetoQueSabeSumarPares = new ListadoPares();
        System.out.println("La suma calcualda es: " + objetoQueSabeSumarPares.calculaSumaParesIterativo(lista));
        System.out.println("La suma calcualda es: " + objetoQueSabeSumarPares.calculaSumaParesRecursiva(lista));
    }
}

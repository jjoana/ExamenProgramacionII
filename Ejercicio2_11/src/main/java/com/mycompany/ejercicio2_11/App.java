package com.mycompany.ejercicio2_11;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(4);
        lista1.add(2);

        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(4);
        lista2.add(2);

        
        calcularProductoEscalar objetoQueSabeSumarPares = new calcularProductoEscalar();
        System.out.println("El producto escalar es: "+ objetoQueSabeSumarPares.calculoIterativoProductoEscalar(lista1,lista2));
        System.out.println("El producto escalras es: " + objetoQueSabeSumarPares.calculoRecursivoProductoEscalar(lista1,lista2));
    }
}

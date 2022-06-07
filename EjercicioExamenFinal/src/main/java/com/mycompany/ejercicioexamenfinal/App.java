package com.mycompany.ejercicioexamenfinal;

import java.util.*;

public class App {
    
    public static void main(String[] args) {
        
        List<Integer> listaI = new ArrayList<>();
        listaI.add(8);
        listaI.add(7);
        listaI.add(6);
        
        List<Integer>lista2= new ArrayList<>();
        lista2.add(2);
        lista2.add(9);
        lista2.add(6);
        
        Interseccion2<Integer> objetoQueSabeCalcularInterseccion = new Interseccion2<>(listaI, lista2);
        List<Integer> listaInterseccion1 = objetoQueSabeCalcularInterseccion.calculoIterativoInterseccion(listaI,lista2);
        List<Integer> listaInterseccion2 = objetoQueSabeCalcularInterseccion.calculoRecursivoInterseccion(listaI,lista2);
        System.out.println(listaInterseccion1);
        System.out.println(listaInterseccion2);
                
    }
    
}

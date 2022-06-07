    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioexamenfinal;

import java.util.*;

/**
 *
 * @author jesus
 * @param <E>
 */
public class Interseccion<E> {

    private List<E> lista1Completa = new ArrayList<>();
    private List<E> lista2Completa = new ArrayList<>();
    private List<E> listaInterseccion = new ArrayList<>();

    public Interseccion(List<E> lista1, List<E> lista2) {
        lista1Completa = (ArrayList<E>) ((ArrayList<E>) lista1).clone();
        lista2Completa = (ArrayList<E>) ((ArrayList<E>) lista2).clone();
    }

    public List<E> calculoIterativoInterseccion(List<E> lista1, List<E> lista2) {
        List<E> ListaDevuelta = new ArrayList<>();
        if (!lista1.isEmpty()) {
            for (E elementoLista1 : lista1) {
                for (E elementoLista2 : lista2) {
                    if (elementoLista1 == elementoLista2) {
                        ListaDevuelta.add(elementoLista1);
                    }
                }
            }
        }
        return ListaDevuelta;
    }

    public List<E> calculoRecursivoInterseccion(List<E> listaI, List<E> lista2) {
        if (!listaI.isEmpty()) {
            if (!lista2.isEmpty()) {
                if (listaI.get(0) != lista2.get(0)) {
                    lista2.remove(0);
                    calculoRecursivoInterseccion(listaI, lista2);
                } else if (listaI.get(0) == lista2.get(0)) {
                    listaInterseccion.add(lista2.get(0));
                    lista2.remove(0);
                    calculoRecursivoInterseccion(listaI, lista2);
                }
            } else {
                listaI.remove(0);
                lista2 = (ArrayList<E>) ((ArrayList<E>) lista2Completa).clone();
                calculoRecursivoInterseccion(listaI, lista2);
            }
        }

        return listaInterseccion;
    }
}


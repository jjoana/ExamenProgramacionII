/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioexamenfinal;

import java.util.*;

/**
 *
 * @author jesus
 */
public class Interseccion2<E> {

    private List<E> lista1Completa = new ArrayList<>();
    private List<E> lista2Completa = new ArrayList<>();
    private List<E> listaInterseccion = new ArrayList<>();

    public Interseccion2(List<E> lista1, List<E> lista2) {
        lista1Completa = (ArrayList<E>) ((ArrayList<E>) lista1).clone();
        lista2Completa = (ArrayList<E>) ((ArrayList<E>) lista2).clone();
    }

    public List<E> calculoIterativoInterseccion(List<E> lista1, List<E> lista2) {
        List<E> ListaFinal = new ArrayList<>();
        if (!lista1.isEmpty()) {
            for (E elementosLista1 : lista1) {
                for (E elementosLista2 : lista2) {
                    if (elementosLista2 == elementosLista1) {
                        ListaFinal.add(elementosLista1);

                    }
                }

            }
        }
        return ListaFinal;

    }

    public List<E> calculoRecursivoInterseccion(List<E> lista1, List<E> lista2) {
        if (!lista1.isEmpty()) {
            if (!lista2.isEmpty()) {
                if (lista1.get(0) != lista2.get(0)) {
                    lista2.remove(0);
                    calculoRecursivoInterseccion(lista1, lista2);
                } else if (lista1.get(0) == lista2.get(0)) {
                    listaInterseccion.add(lista2.get(0));
                    lista1.remove(0);
                    lista2 = (ArrayList<E>) ((ArrayList<E>) lista2Completa).clone();
                    calculoRecursivoInterseccion(lista1, lista2);
                } else {
                    lista1.remove(0);
                    lista1 = (ArrayList<E>) ((ArrayList<E>) lista2Completa).clone();
                    calculoRecursivoInterseccion(lista1, lista2);
                }
            }
        }

        return listaInterseccion;
    }

}

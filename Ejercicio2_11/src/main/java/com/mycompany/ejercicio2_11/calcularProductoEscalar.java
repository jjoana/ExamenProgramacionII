/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_11;

import java.util.*;

/**
 *
 * @author jesus
 */
public class calcularProductoEscalar {

    private List<Integer> lista1Completa = new ArrayList<>();
    private List<Integer> lista2Completa = new ArrayList<>();

    public Integer calculoIterativoProductoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        int suma = 0;
        if (!lista1.isEmpty()) {
            if (!lista2.isEmpty()) {
                int tamano = lista1.size();
                for (int i = 0; i < tamano; i++) {
                    suma += lista1.get(i) * lista2.get(i);
                }

            }
        }
        return suma;
    }

    public Integer calculoRecursivoProductoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        int suma = 0;
        if (!lista1.isEmpty()) {
            if (!lista2.isEmpty()) {
                int a = lista1.get(0);
                int b = lista2.get(0);
                lista1.remove(0);
                lista2.remove(0);
                suma += a * b + calculoRecursivoProductoEscalar(lista1, lista2);
            }
        }
        return suma;
    }
}

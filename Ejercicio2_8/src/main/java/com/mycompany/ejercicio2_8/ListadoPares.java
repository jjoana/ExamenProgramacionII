/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_8;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class ListadoPares {

    public int calculaSumaParesRecursiva(ArrayList<Integer> lista) {
        int suma = 0;
        if(!lista.isEmpty()){
            if (lista.get(0) % 2 == 0){
                int valorLeido = lista.get(0);
                lista.remove(0);
                suma = valorLeido + calculaSumaParesRecursiva(lista);
            }else if( lista.get(0) % 2 != 0){
               lista.remove(0);
               suma = calculaSumaParesRecursiva(lista);
            }
        }
        return suma;
    }
    
    public int calculaSumaParesIterativo(ArrayList<Integer>lista){
        int suma = 0;
        for (Integer e : lista){
            if((e%2)== 0){
                suma += e;
            }
            
        }
        return suma;
    }
}

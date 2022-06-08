/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaarrayrecursividad;

import java.util.*;

/**
 *
 * @author jesus
 */
public class ComparaListas {

    private List<String> lista1Completa = new ArrayList<>();
    private List<String> lista2Completa = new ArrayList<>();
    private List<String> lista3Completa = new ArrayList<>();

    public ComparaListas(List<String> listaA, List<String> listaB) {
        lista1Completa = (ArrayList<String>) ((ArrayList<String>) listaA).clone();
        lista2Completa = (ArrayList<String>) ((ArrayList<String>) listaB).clone();
    }

    public List<String> comparoDosListasIterativo(List<String> listaA, List<String> listaB) {
        while (!listaA.isEmpty()) {
            while (!listaB.isEmpty()) {
                if (listaA.get(0).equalsIgnoreCase(listaB.get(0))) {
                    lista3Completa.add(listaA.get(0));
                }
                listaB.remove(0);
            }
            listaA.remove(0);
            listaB =(ArrayList<String>)((ArrayList<String>) lista2Completa).clone();
        }
        
        return lista3Completa;
    }
    
    public List <String> comparoDosListasRecursiva(List<String>listaA, List<String>listaB){
        if(!listaA.isEmpty()){
            if(listaB.isEmpty()){
                if(!listaA.get(0).equalsIgnoreCase(listaB.get(0))){
                listaB.remove(0);
                comparoDosListasRecursiva(listaA,listaB);
                }else if(listaA.get(0).equalsIgnoreCase(listaB.get(0))){
                    lista3Completa.add(listaB.get(0));
                    listaB.remove(0);
                    comparoDosListasRecursiva(listaA,listaB); 
                }
                
            }else{
                listaA.remove(0);
                listaB =(ArrayList<String>)((ArrayList<String>) lista2Completa).clone();
                comparoDosListasRecursiva(listaA,listaB);
            }
        }    
        return lista3Completa;
    }
}

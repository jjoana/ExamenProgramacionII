/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_12;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Fibonacci {
    
    ArrayList<Integer> serieFibonacci = new ArrayList<>();
    
    public int calculoRecursivoFibonacci(int n){
        
        int calculo;
        
        if(n>1){
            calculo = calculoRecursivoFibonacci(n-1)+ calculoRecursivoFibonacci(n-2);
        }else{
            if(n==1){
              calculo = 1;
            }else calculo = 0;
        }
        serieFibonacci.add(calculo);
        System.out.println("La serie calculada es: " + serieFibonacci);
        return calculo;
    }
}
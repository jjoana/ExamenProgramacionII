/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_1;

/**
 *
 * @author jesus
 */
public class SumarEnteros {
    
    public int sumaRecursiva(int n){
        if(n != 0){
            n += sumaRecursiva(n-1);
        }
        return n;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_2;

/**
 *
 * @author jesus
 * @param <E>
 */
public class FactorialRecursivo<E> {
    
    public int factorialEntero(int n) {

        try{
            if (n > 1) {
                n *= factorialEntero(n - 1);
            } else if (n == 0) {
                n = 1;
            }else{
                throw new ExcepcionFactorial("El numero introducido es menor que o");
            }         
        }catch(ExcepcionFactorial e){
            System.out.println(e);
        }
        return n;
    }
}

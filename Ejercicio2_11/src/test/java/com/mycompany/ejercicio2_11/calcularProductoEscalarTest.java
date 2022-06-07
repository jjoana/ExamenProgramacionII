/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio2_11;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class calcularProductoEscalarTest {
    calcularProductoEscalar objetoQueSabeSumarPares = new calcularProductoEscalar();
    

    
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Test of calculoIterativoProductoEscalar method, of class calcularProductoEscalar.
     */
    @Test
    public void testCalculoIterativoProductoEscalar() {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(4);
        lista1.add(2);

        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(4);
        lista2.add(2);
    }

    /**
     * Test of calculoRecursivoProductoEscalar method, of class calcularProductoEscalar.
     */
    @Test
    public void testCalculoRecursivoProductoEscalar() {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(0);
        lista1.add(2);
        lista1.add(8);

        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(2);
        lista2.add(3);
    }
    
}

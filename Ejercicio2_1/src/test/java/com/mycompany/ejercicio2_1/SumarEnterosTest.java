/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio2_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class SumarEnterosTest {
    
    SumarEnteros sumar = new SumarEnteros();

    /**
     * Test of sumaRecursiva method, of class SumarEnteros.
     */
    @Test
    public void testSumaRecursiva() {
        assertEquals(1,sumar.sumaRecursiva(1));
        assertEquals(3,sumar.sumaRecursiva(2));
        assertEquals(6,sumar.sumaRecursiva(3));
        assertEquals(10,sumar.sumaRecursiva(4));
        assertEquals(15,sumar.sumaRecursiva(5));
    }
    
}

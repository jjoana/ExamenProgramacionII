/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio2_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class FactorialRecursivoTest {
    
FactorialRecursivo factorial = new FactorialRecursivo();

    /**
     * Test of FactorialEntero method, of class FactorialRecursivo.
     */
    @Test
    public void testFactorialEntero() {
        assertEquals(1,factorial.factorialEntero(0));
        assertEquals(1,factorial.factorialEntero(1));
        assertEquals(2,factorial.factorialEntero(2));
        assertEquals(6,factorial.factorialEntero(3));
    }
    
}

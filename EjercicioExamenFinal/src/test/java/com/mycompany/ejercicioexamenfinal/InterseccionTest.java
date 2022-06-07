/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicioexamenfinal;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class InterseccionTest {

    public InterseccionTest() {
    }


    /**
     * Test of testCalculoIterativoInterseccion
     */
    @Test
    public void testCalculoIterativoInterseccion() {

        List<Integer> listaI = new ArrayList<>();
        listaI.add(1);
        listaI.add(2);
        listaI.add(3);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(4);

        List<Integer> listaInterseccion = new ArrayList<>();
        listaInterseccion.add(1);
        listaInterseccion.add(2);

        Interseccion it = new Interseccion(listaI, lista2);

        assertEquals(listaInterseccion, it.calculoIterativoInterseccion(listaI, lista2));
    }

    /**
     * Test of testCalculoRecursivoInterseccionListasVacias
     */
    @Test
    public void testCalculoRecursivoInterseccionListasVacias() {

        List<Integer> listaI = new ArrayList<>();
        listaI.add(1);
        listaI.add(2);
        listaI.add(3);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(4);

        List<Integer> listaInterseccion = new ArrayList<>();
        listaInterseccion.add(1);
        listaInterseccion.add(2);

        Interseccion it = new Interseccion(listaI, lista2);

        assertEquals(listaInterseccion, it.calculoRecursivoInterseccion(listaI, lista2));

    }
    
        /**
     * Test of testCalculoRecursivoInterseccionListaIVaciaLista2
     */
    @Test
    public void testCalculoRecursivoInterseccionListaIVaciaLista2() {

        List<Integer> listaI = new ArrayList<>();
        
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(4);

        List<Integer> listaInterseccion = new ArrayList<>();
        
        Interseccion it = new Interseccion(listaI, lista2);
        assertEquals(listaInterseccion, it.calculoRecursivoInterseccion(listaI, lista2));

    }
    
    
    /**
     * Test of testCalculoRecursivoInterseccionLista1IgualLista2
     */
    @Test
    public void testCalculoRecursivoInterseccionLista1IgualLista2() {

        List<Integer> listaI = new ArrayList<>();
        listaI.add(1);
        listaI.add(2);
        listaI.add(3);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);

        List<Integer> listaInterseccion = new ArrayList<>();
        listaInterseccion.add(1);
        listaInterseccion.add(2);
        listaInterseccion.add(3);

        Interseccion it = new Interseccion(listaI, lista2);

        assertEquals(listaInterseccion, it.calculoRecursivoInterseccion(listaI, lista2));
    }
}

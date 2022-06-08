/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio2_8;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class ListadoParesTest {
    ListadoPares objetoQueSabeSumarPares = new ListadoPares();
    
    /**
     * Test of calculaSumaParesRecursiva method, of class ListadoPares.
     */
    @Test
    public void testCalculaSumaParesRecursiva() {
        ArrayList<Integer> lista = new ArrayList<>();
        
        ArrayList<Integer> listaI = new ArrayList<>();
        listaI.add(2);
        listaI.add(6);
        listaI.add(4);
        listaI.add(8);
   
        ArrayList<Integer> listaII = new ArrayList<>();
        listaII.add(1);
        listaII.add(3);
        listaII.add(5);
        
        ArrayList<Integer> listaIII = new ArrayList<>();
        listaIII.add(1);
        listaIII.add(2);
        listaIII.add(3);
        listaIII.add(4);
    
        assertEquals(0,objetoQueSabeSumarPares.calculaSumaParesRecursiva(lista));
        assertEquals(20,objetoQueSabeSumarPares.calculaSumaParesRecursiva(listaI));
        assertEquals(0,objetoQueSabeSumarPares.calculaSumaParesRecursiva(listaII));
        assertEquals(6,objetoQueSabeSumarPares.calculaSumaParesRecursiva(listaIII));
    }

    /**
     * Test of calculaSumaParesIterativo method, of class ListadoPares.
     */
    @Test
    public void testCalculaSumaParesIterativo() {
        ArrayList<Integer> lista = new ArrayList<>();
        
        ArrayList<Integer> listaI = new ArrayList<>();
        listaI.add(2);
        listaI.add(6);
        listaI.add(4);
        listaI.add(8);
   
        ArrayList<Integer> listaII = new ArrayList<>();
        listaII.add(1);
        listaII.add(3);
        listaII.add(5);
        
        ArrayList<Integer> listaIII = new ArrayList<>();
        listaIII.add(1);
        listaIII.add(2);
        listaIII.add(3);
        listaIII.add(4);
    
        assertEquals(0,objetoQueSabeSumarPares.calculaSumaParesIterativo(lista));
        assertEquals(20,objetoQueSabeSumarPares.calculaSumaParesIterativo(listaI));
        assertEquals(0,objetoQueSabeSumarPares.calculaSumaParesIterativo(listaII));
        assertEquals(6,objetoQueSabeSumarPares.calculaSumaParesIterativo(listaIII));

        
    }
    
    
}

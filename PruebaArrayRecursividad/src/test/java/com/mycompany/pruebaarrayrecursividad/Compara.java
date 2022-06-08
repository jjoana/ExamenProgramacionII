package com.mycompany.pruebaarrayrecursividad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Compara {

    /**
     * Test of comparoDosListasIterativo method, of class ComparaListas.
     */
    @Test
    public void testComparoDosListasIterativo() {

        List<String> lista1 = new ArrayList<>();
        lista1.add("Jesus");
        lista1.add("Julio");
        lista1.add("Ana");

        List<String> lista2 = new ArrayList<>();
        lista2.add("Angel");
        lista2.add("Jesus");
        
        List<String>lista3 = new ArrayList<>();
        lista3.add("Jesus");
        
        ComparaListas comparacion = new ComparaListas(lista1,lista2);
        
        assertEquals(lista3,comparacion.comparoDosListasIterativo(lista1, lista2));
        assertEquals(lista3,comparacion.comparoDosListasRecursiva(lista1, lista2));
        
        
    }

}

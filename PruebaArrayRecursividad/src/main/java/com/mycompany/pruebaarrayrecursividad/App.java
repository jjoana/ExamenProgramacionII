package com.mycompany.pruebaarrayrecursividad;

import java.util.*;

public class App {

    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        boolean seguir1 = true;
        boolean seguir2 = true;
        while (seguir1) {
            System.out.print("Introduzca nombre de la persona : ");
            lista1.add(entrada.nextLine());
            System.out.println("¿Desea añadir a otra persona? (si/no): ");
            String out = entrada.nextLine();
            if (out.equalsIgnoreCase("no")) {
                seguir1 = false;
            }
        }

        while (seguir2) {
            System.out.print("Introduzca nombre de la persona : ");
            lista2.add(entrada.nextLine());
            System.out.println("¿Desea añadir a otra persona? (si/no): ");
            String out = entrada.nextLine();
            if (out.equalsIgnoreCase("no")) {
                seguir2 = false;

            }
        }

        ComparaListas objetosQueCompara = new ComparaListas(lista1, lista2);
        objetosQueCompara.comparoDosListasIterativo(lista1, lista2);
        System.out.println(objetosQueCompara.comparoDosListasIterativo(lista1, lista2));
        System.out.println(objetosQueCompara.comparoDosListasRecursiva(lista1, lista2));

    }
}

package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("tincho");
        nombres.add("ana");
        nombres.add("batman");
        nombres.add("guason");
        nombres.add("fanta");
        nombres.add("robocop");

        System.out.println("Lista inicial nombres:");
        mostrarNombres(nombres);

        nombres.add("lucia");
        System.out.println("Se agrega lucia:");
        mostrarNombres(nombres);

        nombres.add("peterpan");
        System.out.println("Se agrega peterpan:");
        mostrarNombres(nombres);

        nombres.remove("guason");
        System.out.println("Despues de eliminar guason:");
        mostrarNombres(nombres);

        Collections.sort(nombres);
        System.out.println("En orden alfabetico nombres:");
        mostrarNombres(nombres);
    }

    private static void mostrarNombres(ArrayList<String> nombres) {
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println(); // Salto de linea para separar las salidas
    }
}
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

        System.out.print("Lista inicial nombres " + nombres);
        mostrarNombres(nombres);

        nombres.add("lucia");
        System.out.print(" se agrega robin ");
        mostrarNombres(nombres);

        nombres.add("peterpan");
        System.out.print(" se agrega peterpam");
        mostrarNombres(nombres);

        nombres.remove("guason");
        System.out.print(" despues de eliminar guason");
        mostrarNombres(nombres);

        Collections.sort(nombres);
        System.out.print(" En orden alfabetico nombres ");
        mostrarNombres(nombres);

    }

        private static void mostrarNombres(ArrayList<String> nombres) {
        for(String nombre : nombres){
            System.out.print(nombre);
        }
    }
}
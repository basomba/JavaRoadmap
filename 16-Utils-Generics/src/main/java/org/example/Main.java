package org.example;

public class Main {
    public static void main(String[] args) {

        class Utils{
            public static <t> void imprimir(t datos) {
                System.out.println(datos);

            }
        }

        Utils.imprimir(10);
        Utils.imprimir("hola");
 }
}
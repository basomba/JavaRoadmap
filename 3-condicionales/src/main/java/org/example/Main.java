package org.example;


import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //condicionales simples
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = scanner.nextInt();

        if (numero > 0 ){
            System.out.println("El numero es prositivo ");
        }

        scanner.close();
    }
}


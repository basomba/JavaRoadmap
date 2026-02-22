package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //condicionales multiples
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("El numero es positivo");
        }else if (numero < 0){
            System.out.println("El nuemero es negativo");
        }else {
            System.out.println("El numero ingresado es cero");
        }
        scanner.close();
    }
}
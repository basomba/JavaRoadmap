package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //vectores
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];
        System.out.println("ingrese 5 numeros");

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los numeros ingresados son " + ": ");
        for (int i = 0; i < numeros.length; i++){
          System.out.println("Numeros " + (i+1));
        }
        scanner.close();
    }
}
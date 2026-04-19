package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero ");

        try{
        int numero = scanner.nextInt();
        System.out.print("El numero es: " + numero);
        }catch (InputMismatchException e){
            System.out.print("Error ingrese dato valido");

        }finally {
            scanner.close();
        }
    }
}
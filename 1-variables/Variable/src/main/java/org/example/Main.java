package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //calcular area de rectangulo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de la altura ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el numero de la base ");
        double base = scanner.nextDouble();

        double area = base * altura;

        System.out.println("El area del rectangulo es " +  area);
    }
}
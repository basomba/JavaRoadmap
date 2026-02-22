package org.example;

class persona{
    String nombre;
    int edad;

    void mostrarpersona(){
    System.out.print("nombre " + nombre);
    System.out.print(" edad " + edad);
    }
}

public class Main{
    public static void main(String[]args){
        persona p1 = new persona();
        p1.nombre = "tincho";
        p1.edad = 36;
        p1.mostrarpersona();
    }
}
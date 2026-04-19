package org.example;


class Animal{
    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public void hacerruido(){
        System.out.println("El animal hace ruido ");
    }

    public String getNombre(){
        return nombre;
    }

    public static class Perro extends Animal{
        public Perro(String nombre){
            super(nombre);
        }

        @Override
        public void hacerruido(){
            System.out.println("El perro hace ruido ");
        }
    }

    public static class Gato extends Animal{
        public Gato(String nombre){
            super(nombre);
        }

        @Override
        public void hacerruido(){
            System.out.println("El gato hace ruido ");
        }
    }
}


public class Main{
    public static void main(String[]args){
        Animal.Perro perro = new Animal.Perro("alf");
        Animal.Gato gato = new Animal.Gato("suertudo");

        perro.hacerruido();
        gato.hacerruido();
    }
}
package org.example;

abstract class Animal{

    private String nombre;

    public Animal (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract void hacerruido();

}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerruido() {
        System.out.print(getNombre() + "guau ");
    }
}
    class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }

        @Override
        public void hacerruido() {
            System.out.print(getNombre() + "miau ");
        }
    }

public class Main{
        public static void main(String[]args){

             Perro perro= new Perro("dinamita ");
             Gato gato = new Gato("suertudo ");

             perro.hacerruido();
             gato.hacerruido();


        }
}




















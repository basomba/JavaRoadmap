package org.example;

class vehiculo{
    String modelo;
    int precio;
    int año;

    public vehiculo(String modelo, int precio, int año){
        this.modelo = modelo;
        this.precio = precio;
        this.año = año;
    }

    public void mostrarvehiculo(){
        System.out.print(" El modelo del vehiculo es " + modelo );
        System.out.print(" El precio del vehiculo es " + precio );
        System.out.print(" El año del vehiculo es " + año );

    }
}

  public class Main{
      public static void main (String[]args){
          vehiculo vehiculo1 = new vehiculo("Toyota" , 15000 , 98);
          vehiculo1.mostrarvehiculo();
      }
  }
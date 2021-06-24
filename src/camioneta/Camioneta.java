package src.camioneta;

import src.vehiculo.*;


public class Camioneta extends Vehiculo implements trasportarPersonas, Girar {

    public Camioneta(String nombre, String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {

        super(nombre, tipoCombustible, cantidadCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

   // @Override

    public void trasportar() {
        System.out.println("Estoy implementando trasportar personas a varios lugares");
    }

    
   // @Overrid
    
    public String getInfo() {
        return "Este vehiculo puede trasportar personas";
    }

   // @Override

    public void girarDerecha() {
        System.out.println("Puedo girar a la derecha en la carretera");
    }

    //@Override

    public void girarIzquierda() {
        System.out.println("Puedo girar a la izquierda en la carretera");
    }

}

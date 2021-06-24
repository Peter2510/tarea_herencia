package src.camioneta;

import src.vehiculo.*;


public class Camioneta extends Vehiculo implements trasportarPersonas {

    public Camioneta(String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {

        super(tipoCombustible, cantidadCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public String getInfo() {

        return "Tipo de combustible: " + getTipoCombustible() + " Cantidad de galones: " + getCantidadCombustible() + " Cantidad de pasajeros: " + getCantidadPasajeros();
    }

    @Override
    public void trasportar() {
        System.out.println("Trasporto personas a varios lugares");
    }

}
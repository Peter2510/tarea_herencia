package src.carga;

import src.vehiculo.Girar;
import src.vehiculo.Vehiculo;

public class Carga extends Vehiculo implements trasportarMaterial, Girar {

    public Carga(String nombre, String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(nombre, tipoCombustible, cantidadCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public String getInfo() {
        return "Este vehiculo puede trasportar material";
    }

    @Override
    public void trasportarMaterial() {
        System.out.println("Estoy implementando trasportar material");
    }

    @Override
    public void girarDerecha() {
        System.out.println("Puedo girar a la derecha para llevar la carga de material");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Puedo girar a la izquierda para llevar la carga de material");
    }

}

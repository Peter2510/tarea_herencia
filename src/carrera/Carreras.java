package src.carrera;

import src.vehiculo.Girar;
import src.vehiculo.Vehiculo;

public class Carreras extends Vehiculo implements Turbo, Girar {

    private double aceleracionTiple;

    public Carreras(String nombre, String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {

        super(nombre, tipoCombustible, cantidadCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public String getInfo() {
        return "Este vehiculo puede correr carreras";
    }

    @Override
    public void turbo(double aceleracionBase) {
        System.out.println("Estoy implementando triplicar mi aceleracion base");
        System.out.println("Aceleracion base inicial: " + getAceleracionBase());
        System.out.println("Triplicando aceleracion...");
        aceleracionTiple = aceleracionBase * 3;
        setAceleracionBase(aceleracionTiple);
        System.out.println("Aceleracion base triplicada:" + getAceleracionBase());
    }

    public double getAceleracionTriple() {
        return aceleracionTiple;
    }

    @Override
    public void girarDerecha() {
        System.out.println("Puedo girar a la derecha en la pista de carreras");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Puedo girar a la izquierda en la pista de carreras");
    }

}

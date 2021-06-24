
package src.carrera;



import src.vehiculo.*;


public class Carreras extends Vehiculo implements Turbo {
    
     private double aceleracionTiple;

    public Carreras(String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {

        super(tipoCombustible, cantidadCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public String getInfo() {

        return "Tipo de combustible: " + getTipoCombustible() + " Cantidad de galones: " + getCantidadCombustible() + " Cantidad de pasajeros: " + getCantidadPasajeros() + "Aceleracion base: " + getAceleracionBase();
    }

    public void trasportarPersonas() {

    }

    

    @Override
    public void turbo(double aceleracionBase) {
       aceleracionTiple = aceleracionBase *3 ;
        setAceleracionBase(aceleracionTiple);
    }
    
    public double getAceleracionTriple(){
        return aceleracionTiple;
    }

}
package src.vehiculo;

public abstract class Vehiculo {
    private String nombre;
    private String tipoCombustible;
    private int cantidadCombustible;
    private int cantidadPasajeros;
    private int velocidadMaxima;
    private double aceleracionBase;

    public Vehiculo(String nombre, String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        this.nombre =  nombre;
        this.tipoCombustible = tipoCombustible;
        this.cantidadCombustible = cantidadCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;

    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getCantidadCombustible() {
        return cantidadCombustible;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    @Override
    public String toString() {
        return"TipoCombustible = " + tipoCombustible + ", cantidadCombustible = " + cantidadCombustible + ", cantidadPasajeros = " + cantidadPasajeros + ", velocidadMaxima = " + velocidadMaxima + ", aceleracionBase = " + aceleracionBase ;
    }
    
    public void getTipoVehiculo(){
        System.out.println("Tipo de vehiculo: " + getNombre());
    }
    
    public abstract String getInfo();

}

package src.vehiculo;

public abstract class Vehiculo{

	private String tipoCombustible;
	private int cantidadCombustible;
	private int cantidadPasajeros;
	private int velocidadMaxima;
	private double aceleracionBase;


	public Vehiculo(String tipoCombustible, int cantidadCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase){
		
		this.tipoCombustible = tipoCombustible;
		this.cantidadCombustible = cantidadCombustible;
		this.cantidadPasajeros = cantidadPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.aceleracionBase = aceleracionBase;

	}

	public String getTipoCombustible(){
		return tipoCombustible;
	}

	public int getCantidadCombustible(){
		return cantidadCombustible;
	}


	public int getCantidadPasajeros(){
		return cantidadPasajeros;
	}

	public int getVelocidadMaxima(){
		return velocidadMaxima;
	}

	public double getAceleracionBase(){
		return aceleracionBase;
	}

	public abstract String getInfo();

}
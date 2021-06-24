package src.principal;

import src.camioneta.*;
import src.carrera.*;


public class Principal{

	public static void main(String[] args) {
		
                Camioneta camioneta1 = new Camioneta("Diesel", 120, 80, 120, 12.5);

		System.out.println(camioneta1.getInfo());
                System.out.println(camioneta1.toString());
                camioneta1.trasportar();
                System.out.println("\n\n");
                
                Carreras carrera1 = new Carreras("Gasolina", 90, 2, 270, 32.8);
                
                System.out.println("Aceleracion base inicial: " + carrera1.getAceleracionBase());
                carrera1.turbo(32.8);
		System.out.println(carrera1.getInfo());
                System.out.println(carrera1.toString());
                
	}


}
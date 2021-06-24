package src.logica;

import src.camioneta.Camioneta;
import src.carga.Carga;
import src.carrera.Carreras;

public class Array {

    private Camioneta ac[] = new Camioneta[5];
    private Carreras aca[] = new Carreras[5];
    private Carga cc[] = new Carga[5];
    private int numeroAleatorio;
    private double numeroAleatorioDouble;

    public Array() {

        for (int i = 0; i < 4; i++) {
            
            generarNumAleatorio();
            generarNumAleatorioDouble();

            ac[i] = new Camioneta("Camiodneta", "Diesel", numeroAleatorio, numeroAleatorio, numeroAleatorio, numeroAleatorioDouble);
           
        }
            
        for (int i = 0; i < 4; i++) {
            generarNumAleatorio();
            generarNumAleatorioDouble();
            aca[i] = new Carreras("Carro de Carreras", "Gasolina", numeroAleatorio, numeroAleatorio, numeroAleatorio, numeroAleatorioDouble);
            
        }
          
             for (int i = 0; i < 4; i++) {
            generarNumAleatorio();
            generarNumAleatorioDouble();
            cc[i] = new Carga("Vehiculo de carga", "Diesel", numeroAleatorio, numeroAleatorio, numeroAleatorio, numeroAleatorioDouble);

        }
       

           for (int i = 0; i < 4; i++) {
               tipoVehiculo(ac[i]);
               tipoVehiculo(aca[i]);
               tipoVehiculo(cc[i]);
            
        }
            
        

    }

    public void tipoVehiculo(Object objeto) {

        for (int i = 0; i < 1; i++) {

            if (objeto instanceof Camioneta) {

                ac[i].getTipoVehiculo();
                System.out.println(ac[i].getInfo());
                ac[i].trasportar();
                ac[i].girarDerecha();
                ac[i].girarIzquierda();
                System.out.println(ac[i].toString());
                System.out.println("\n\n");
            }

            if (objeto instanceof Carreras) {

                aca[i].getTipoVehiculo();
                System.out.println(aca[i].getInfo());
                aca[i].turbo(32.8);
                aca[i].girarDerecha();
                aca[i].girarIzquierda();
                System.out.println(aca[i].toString());
                System.out.println("\n\n");

            }

            if (objeto instanceof Carga) {

                cc[i].getTipoVehiculo();
                System.out.println(cc[i].getInfo());
                cc[i].trasportarMaterial();
                cc[i].girarDerecha();
                cc[i].girarIzquierda();

                System.out.println(cc[i].toString());
                System.out.println("\n\n");

            }

        }

    }
    
    public void generarNumAleatorio(){
        numeroAleatorio = (int)(Math.random()*200+40);
    }
    
      public void generarNumAleatorioDouble(){
        numeroAleatorioDouble = (Math.random()*20+5);
    }

}

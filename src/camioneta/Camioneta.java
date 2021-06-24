package src.camioneta;
import src.vehiculo.*;

public class Camioneta extends Vehiculo{

	
	public Camioneta(String tipoCombustible){
		
		super(tipoCombustible, 95, 45, 120,5.4);
	}

	@Override
	public String getInfo(){

		return	"d";
}

}
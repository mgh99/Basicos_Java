package patrones.Facade_Movil;

public class ServicioGPS implements ServicioMovil{
	
	@Override
	public void start() {
		System.out.println("Servicio de GPS encendido");
	}
	
	@Override
	public void close() {
		System.out.println("Servicio de GPS apagado");
	}

}

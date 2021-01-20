package patrones.Facade_Movil;

public class ServicioWifi implements ServicioMovil{
	
	@Override
	public void start() {
		System.out.println("Servicio wifi encendido");
	}
	
	@Override
	public void close() {
		System.out.println("Servicio wifi apagado");
	}

}

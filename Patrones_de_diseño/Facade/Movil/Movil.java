package patrones.Facade_Movil;

import java.util.List;

public class Movil {
	
	private final Bateria bateria;
	private final CPU cpu;
	private final List<ServicioMovil> servicioMoviles;
	
	public Movil(Bateria bateria, CPU cpu, List<ServicioMovil> servicioMoviles) {
		
		this.bateria = bateria;
		this.cpu = cpu;
		this.servicioMoviles = servicioMoviles;	
	}
	
	public CPU getCpu() {
		return cpu;
	}
	
	public Bateria getBateria() {
		return bateria;
	}
	
	public List<ServicioMovil> getServicioMovil() {
		return servicioMoviles;
	}

}

package patrones.Facade_Movil;

import java.util.Arrays;
import java.util.List;

public class MovilFacade {
	
	public Movil on() {
		
		Bateria bateria = new Bateria();
		bateria.on();
		
		CPU cpu = new CPU();
		cpu.puntoArranque();
		
		ServicioMovil gps = new ServicioGPS();
		gps.start();
		
		ServicioMovil wifi = new ServicioWifi();
		wifi.start();
		
		List<ServicioMovil> servicioMoviles = Arrays.asList(gps, wifi);
		Movil movil = new Movil(bateria, cpu, servicioMoviles);
		
		return movil;
	}
	
	public void off(Movil movil) {
		
		for(ServicioMovil servicio : movil.getServicioMovil()) {
			servicio.close();
		}
		
		movil.getCpu().apagar();
		movil.getBateria().off();
	}

}

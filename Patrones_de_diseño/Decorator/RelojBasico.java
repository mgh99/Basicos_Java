package patrones.decorator_Tiempos;

public class RelojBasico implements Reloj{

	@Override
	public void crearFuncionalidad() {
		System.out.println("Reloj básico con: ");
		this.añadirTiempo();
	}
	
	private void añadirTiempo() {
		System.out.println(" Tiempo");
	}
}

package patrones.decorator_Tiempos;

public class RelojDecorator implements Reloj{
	
	private final Reloj reloj;
	
	public RelojDecorator(Reloj reloj) {
		this.reloj = reloj;
	}
	
	@Override
	public void crearFuncionalidad() {
		this.reloj.crearFuncionalidad();
	}

}

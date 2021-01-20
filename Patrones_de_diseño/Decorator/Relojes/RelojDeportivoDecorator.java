package patrones.decorator_Tiempos;

public class RelojDeportivoDecorator extends RelojDecorator{
	
	public RelojDeportivoDecorator(Reloj reloj) {
		super(reloj);
	}
	
	@Override
	public void crearFuncionalidad() {
		
		super.crearFuncionalidad();
		
		System.out.println(" y más funciones (Reloj deportivo");
		
		this.addPodometro();
		this.addModoDormir();
	}
	
	private void addPodometro() {
		System.out.print(" Podómetro");
	}
	
	private void addModoDormir() {
		System.out.print(" Modo dormir");
	}

}

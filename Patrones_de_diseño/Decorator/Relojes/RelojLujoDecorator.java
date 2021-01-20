package patrones.decorator_Tiempos;

public class RelojLujoDecorator extends RelojDecorator{

	public RelojLujoDecorator(Reloj reloj) {
		super(reloj);
	}
	
	@Override
	public void crearFuncionalidad() {
		super.crearFuncionalidad();
		
		System.out.print(" y más funciones (Reloj de lujo): ");
		
		this.addCargaRapida();
		this.addImpermeabilidad();
		this.addNFC();
	}
	
	private void addCargaRapida() {
		System.out.print(" Carga rápida");
	}
	
	private void addImpermeabilidad() {
		System.out.print(" Impermeable");
	}
	
	private void addNFC() {
		System.out.print(" NFC");
	}
	
}

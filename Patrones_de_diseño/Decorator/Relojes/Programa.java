package patrones.decorator_Tiempos;

public class Programa {

	public static void main(String[] args) {
		
		Reloj relojBasico = new RelojBasico();
		relojBasico.crearFuncionalidad();
		System.out.println("\n--------------");
		
		Reloj relojDeportivo = new RelojDeportivoDecorator(new RelojBasico());
		relojDeportivo.crearFuncionalidad();
		System.out.println("\n--------------");
		
		Reloj relojLujoDeportivo = new RelojLujoDecorator(new RelojDeportivoDecorator(new RelojBasico()));
		relojLujoDeportivo.crearFuncionalidad();

	}

}

package patrones.Strategy_Ventas;

public class Programa {

	public static void main(String[] args) {
		
		EstrategiaComision estrategiaComision = getEstrategia(1000d);
		Contenido contenido = new Contenido(estrategiaComision);
		System.out.println("Comisión por 1000d = " + contenido.ejecutarEstrategia(1000d));
		
		estrategiaComision = getEstrategia(500d);
		contenido = new Contenido(estrategiaComision);
		System.out.println("Comisión por 500d = " + contenido.ejecutarEstrategia(500d));
		
		estrategiaComision = getEstrategia(100d);
		contenido = new Contenido(estrategiaComision);
		System.out.println("Comisión por 100d = " + contenido.ejecutarEstrategia(100d));

	}
	
	private static EstrategiaComision getEstrategia(double cantidad) {
		
		EstrategiaComision estrategia;
		
		if(cantidad >= 1000d) {
			estrategia = new FullComision();
		}else if(cantidad >= 500d && cantidad <= 999d) {
			estrategia = new ComisionNormal();
		}else {
			estrategia = new ComisionRegular();
		}
		
		return estrategia;
	}

}

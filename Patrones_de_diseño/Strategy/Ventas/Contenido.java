package patrones.Strategy_Ventas;

public class Contenido {
	
	private EstrategiaComision estrategiaComision;
	
	public Contenido(EstrategiaComision estrategiaComision) {
		this.estrategiaComision = estrategiaComision;
	}
	
	public double ejecutarEstrategia(double cantidad) {
		return estrategiaComision.aplicarComision(cantidad);
	}

}

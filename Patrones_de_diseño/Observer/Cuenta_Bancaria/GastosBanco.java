package patrones.Observer_Banco;

import java.util.Observable;
import java.util.Observer;

public class GastosBanco implements Observer{
	
	private String tipo;
	private Double totalCalculado = new Double(0D);
	private final Double ratioCoeficiente;
	
	public GastosBanco(String tipo, Double ratioCoeficiente) {
		this.tipo = tipo;
		this.ratioCoeficiente = ratioCoeficiente;
	}
	
	public void update(Observable o, Object value) {
		this.totalCalculado = ((Double) value) * ratioCoeficiente;
	}
	
	public Double getTotalCalculado() {
		return totalCalculado;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Gastos del banco {" + "tipo = '" + tipo + "\'" + ", Coeficiente de ratio = " + ratioCoeficiente +
				", total calculado = " +totalCalculado + '}';
	}


}

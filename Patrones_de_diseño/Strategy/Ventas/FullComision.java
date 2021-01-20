package patrones.Strategy_Ventas;

public class FullComision implements EstrategiaComision{
	
	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.50d;
	}

}

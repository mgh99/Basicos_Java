package patrones.Strategy_Ventas;

public class ComisionRegular implements EstrategiaComision{
	
	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.10;
	}

}

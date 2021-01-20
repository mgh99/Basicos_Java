package patrones.Strategy_Ventas;

public class ComisionNormal implements EstrategiaComision{
	
	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.30;
	}

}

package patrones.Adapter_ServicioBanco;

public class ServicioBanco {
	
	public DataBanco encontrarNumeroCuenta(int numeroCuenta) {
		
		if(numeroCuenta == 1) {
			return new DataBanco (numeroCuenta, "Juan", 1000.0);
		}else if(numeroCuenta == 3) {
			return new DataBanco(numeroCuenta, "Sara", 200.0);
		}else {
			return null;
		}
	}

}

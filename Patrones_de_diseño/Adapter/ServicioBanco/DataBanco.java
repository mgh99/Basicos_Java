package patrones.Adapter_ServicioBanco;

public class DataBanco {
	
	private int cuenta;
	private String nombre;
	private double balance;
	
	public DataBanco(int cuenta, String nombre, double balance) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.balance = balance;
	}

	public int getCuenta() {
		return cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public double getBalance() {
		return balance;
	}

}

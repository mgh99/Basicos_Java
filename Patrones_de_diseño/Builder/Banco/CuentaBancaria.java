package patrones.Builder_Banco;

public class CuentaBancaria {
	
	private long numeroCuenta;
	private String dueño;
	private TipoCuentaBanco tipo;
	private double balance;
	private double ratio;
	
	public CuentaBancaria() {
		
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public TipoCuentaBanco getTipo() {
		return tipo;
	}

	public void setTipo(TipoCuentaBanco tipo) {
		this.tipo = tipo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

}

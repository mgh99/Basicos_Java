package patrones.Builder_Banco;

public class CuentaBancariaBuilder implements IBuilder{
	
	private long numeroCuenta; 
	private String dueño;
	private TipoCuentaBanco tipo;
	private double balance;
	private double ratio;
	
	public CuentaBancariaBuilder (long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public CuentaBancariaBuilder conDueño (String dueño) {
		this.dueño = dueño;
		return this; //devuleve el buider cada vez
	}
	
	public CuentaBancariaBuilder conTipo (TipoCuentaBanco tipo) {
		this.tipo = tipo;	
		return this;
	}
	
	public CuentaBancariaBuilder conBalance (double balance) {
		this.balance = balance;
		return this;
	}
	
	public CuentaBancariaBuilder conRatio (double ratio) {
		this.ratio = ratio;
		return this;
	}
	
	@Override
	public CuentaBancaria build() {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		cuenta.setNumeroCuenta(this.numeroCuenta);
		cuenta.setDueño(this.dueño);
		cuenta.setTipo(this.tipo);
		cuenta.setBalance(this.balance);
		cuenta.setRatio(this.ratio);
		
		return cuenta;
		
	}

}

public abstract class Cuenta {
	
	private String numero;
	private String nif;
	protected float saldo;
	
	public Cuenta(String numero, String nif) {
		
		this.numero = numero;
		this.nif = nif;
		this.saldo = 0.0f;
		
	}
	
	public Cuenta(String numero, float saldo, String nif) {
		
		this.numero = numero;
		this.saldo = saldo;
		this.nif = nif;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getNIF() {
		return this.nif;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	abstract public void ingreso(float cantidad);
	
	public void retiro(float cantidad) {
		this.saldo = this.saldo - cantidad;
	}
	
	public String getDatos() {
		return this.numero + "\tSaldo: " + this.saldo + "\t" + this.nif;
	}
}

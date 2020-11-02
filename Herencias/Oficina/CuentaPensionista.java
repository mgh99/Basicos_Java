public class CuentaPensionista extends Cuenta {

	public CuentaPensionista(String numero, String nif) {
		super(numero, nif);
	}

	public CuentaPensionista(String numero, float saldo, String nif) {
		super(numero, saldo, nif);
	}

	public void ingreso(float cantidad) {
		this.saldo = this.saldo + cantidad + 0.0075f * cantidad;
	}

	public String getDatos() {
		return "Cuenta pensionista       " + super.getDatos();
	}

}

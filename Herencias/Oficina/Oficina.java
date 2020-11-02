public class Oficina {

	private String numero;
	private String domicilio;
	
	public Oficina(String numero, String domicilio) {
		
		this.numero = numero;
		this.domicilio = domicilio;
		
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getDatos() {
		return this.numero + " " + this.domicilio;
	}
}

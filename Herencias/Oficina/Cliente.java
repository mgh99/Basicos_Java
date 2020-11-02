public class Cliente {
	
	private String nif;
	private String nombre;
	private String apellidos;
	private String telefono;
	
	public Cliente(String nif, String nombre, String apellidos, String telefono) {
		
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		
	}
	
	public String getNIF() {
		return this.nif;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDatos() {
		
		return this.nif + " " + this. apellidos + ", " + this.nombre + "\t" + this.telefono;
		
	}
}

public class Profesor extends Persona {
	
	//atributos de la clase profesor
	
	private int añoTitulacion;
	
	public Profesor (String dni, String nombre, String apellidos, int diaNacimiento, 
			int mesNacimiento, int añoNacimiento, String telefono, int añoTitulacion) {
		
		super (dni, nombre, apellidos, diaNacimiento, mesNacimiento, añoNacimiento, telefono);
		this.añoTitulacion = añoTitulacion;
		
	}

	public int getAñoTitulacion() {
		return this.añoTitulacion;
	}
	
	//el método getDatos() sobreescribe el método de la superclase Persona
	
	public String getDatos() {
		
		return super.getDatos() + "\t" + this.añoTitulacion;
	}
	

}

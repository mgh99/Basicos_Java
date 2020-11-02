public class Alumno extends Persona{
	
	//atributos de la clase alumno
	
	private String grado;
	
	public String getGrado() {
		return grado;
	}

	public Alumno(String dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento,
				int añoNacimiento, String telefono, String grado) {
		
		super (dni, nombre, apellidos, diaNacimiento, mesNacimiento, añoNacimiento, telefono);
		this.grado = grado;
		
	}
	
	//el método getDatos() sobreescribe el método de la superclase Persona
	
	public String getDatos() {
		return super.getDatos() + "\t" + this.grado;
	}

}

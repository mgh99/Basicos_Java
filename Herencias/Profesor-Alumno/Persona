import java.util.Calendar;

public abstract class Persona {

	// atributos de la clase Persona, declarada como clase abstract
	// la clase Persona no se puede instanciar

	private String dni;
	private String nombre;
	private String apellidos;
	private int diaNacimiento;
	private int mesNacimiento;
	private int añoNacimiento;
	private String telefono;

	// el método constructor de la clase Persona está sobrecargado

	public Persona(String dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento,
			int añoNacimiento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.añoNacimiento = añoNacimiento;
		this.telefono = "";
	}
	
	public Persona(String dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento,
			int añoNacimiento, String telefono) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.añoNacimiento = añoNacimiento;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	// metodos 'get' para extraer los datos de los objetos

	
	public int getEdad() {

		return calculaEdad(this.diaNacimiento, this.mesNacimiento, this.añoNacimiento);

	}

	// getDatos() devuelve todos los datos del objeto
	public String getDatos() {

		return this.dni + " " + this.nombre + " " + this.apellidos + "\t" + this.telefono + "\t" + 
				this.getEdad() + " años" + "\t";

	}

	// metodos 'set' para modificar los datos de los objetos
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static int calculaEdad(int diaNacimiento, int mesNacimiento, int añoNacimiento) {

		int diaHoy, mesHoy, añoHoy, edad;

		diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1;
		añoHoy = Calendar.getInstance().get(Calendar.YEAR);

		if ((mesHoy > mesNacimiento) ||
				((mesHoy == mesNacimiento) && (diaHoy >= diaNacimiento)))
			edad = añoHoy - añoNacimiento;
		else
			edad = añoHoy - añoNacimiento - 1;
		return edad;
	}

}

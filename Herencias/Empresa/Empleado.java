import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class Empleado {
	
	private String nif;
	private String nombre;
	private String apellidos;
	
	private LocalDate fechaContratacion;
	
	private double sueldo;
	
	public Empleado(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo) {
		
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContratacion = fechaContratacion;
		this.sueldo = sueldo;
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
	
	public int getAñoContratacion() {
		
		// devuelve el año de contratación del empleado
		return this.fechaContratacion.getYear();
	}

	public int getAntigüedad() {
		
		// devuelve la antigüedad del empleado, se calcula restando
		// el año de contratación al año en curso
		return (LocalDate.now().getYear() - this.fechaContratacion.getYear());
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	// el método getSubidaSalarial es abstracto y se implementa
	// en las subclases Auxiliar, Ingeniero y Tecnico
	abstract public double getSubidaSalarial();
	
	public String getDatos() {
		// devuelve una cadena con los datos del empleado
		// utilice la clase DecimalFormat para dar formato al
		// sueldo y mostrar solo 2 decimales
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		return this.nif + "  " + this.apellidos + ", " + this.nombre + "\t" + this.getAntigüedad() + " años \t" + 
		this.sueldo + "€. " + Double.valueOf(df.format(this.getSubidaSalarial())) + "\t" + this.getClass().getSimpleName();
	}
}

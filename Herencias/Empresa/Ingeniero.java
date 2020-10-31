
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Ingeniero extends Empleado {
	
 boolean bilingüe;
 
 public Ingeniero(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo,
 boolean bilingüe) {
	 
	 super (nif, nombre, apellidos, fechaContratacion, sueldo);
 }
 
 public boolean getBilingüe() {
	 return this.bilingüe;
 }
 
 public double getSubidaSalarial() {
	 
 // calcula la subida salarial de los empleados
 // de la categoria Ingeniero
	 
	 double factor = 0.025 + ((super.getAntigüedad() >= 3) ? 0.01: 0.0);
	 return (super.getSueldo() * factor);
 }
 
 public String getDatos() {
	 
 // devuelve una cadena con los datos del empleado, indicando
 // si el empleado es bilingüe
	 
	 DecimalFormat df = new DecimalFormat("#.##");
	 
	 return this.getNIF() + "  " + this.getApellidos() + ", " + this.getNombre() + " \t" + this.getAntigüedad() + " años \t" + 
	 	this.getSueldo() + "€. " + Double.valueOf(df.format(this.getSubidaSalarial()));
 }
}

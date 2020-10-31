import java.time.LocalDate;

public class Auxiliar extends Empleado {
	
 public Auxiliar(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo) {
	 
	 super(nif, nombre, apellidos, fechaContratacion, sueldo);
	 
 }
 
 public double getSubidaSalarial() {
	 
 // calcula la subida salarial de los empleados
 // de la categoria Auxiliar
	 
	 double factor = 0.035 + ((super.getAntigüedad() >= 3) ? 0.01: 0.0); 
	 return (super.getSueldo() * factor);
 }
}


import java.time.LocalDate;

public class Tecnico extends Empleado {
	
 public Tecnico(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo) {
	 
	 super(nif, nombre, apellidos, fechaContratacion, sueldo);
 }
 
 public double getSubidaSalarial() {
	 
 // calcula la subida salarial de los empleados
 // de la categoria Tecnico
	 
	 double factor = 0.015 + ((super.getAntigüedad() >= 5) ? 0.05: 0.0);
	 return (super.getSueldo() * factor);
 }
}

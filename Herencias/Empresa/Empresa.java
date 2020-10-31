
import java.util.Vector;

public class Empresa {

	private String web;
	private Vector<Empleado> empleados;

	public Empresa(String web) {
		
		this.web = web;
		this.empleados = new Vector<Empleado>();

	}

	public String getWeb() {
		
		return this.web;

	}

	public void altaEmpleado(Empleado e) {

		this.empleados.add(e);
	}

	public String consultaEmpleados() {
		
		String s = this.getWeb() + "\t\t\t Empleados \n";
		
		for(Empleado e: this.empleados) {
			
			s = s + "\n"  + e.getDatos();
		}
		
		s = s + "\n";
		
		return s;

		// devuelve una cadena con todos los empleados de la empresa
	}

	public String consultaEmpleados(double sueldoMinimo, double sueldoMaximo) {
		
		String s = this.getWeb() + "\t\t Empleados con sueldo entre " + sueldoMinimo + " y " +
		sueldoMaximo;
		
		for(Empleado e: this.empleados) {
			if(e.getSueldo() >= sueldoMinimo && e.getSueldo() <= sueldoMaximo) {
				s = s + "\n" + e.getDatos();
			}
		}
		
		s = s + "\n";
		return s;

		// devuelve una cadena con los empleados cuyo sueldo
		// está en el rango especificado
	}

	public String consultaEmpleados(String categoria) {
		
		String s = this.getWeb() + "\t\t Empleados de la categoria " + categoria + "\n";
		
		for(Empleado e: this.empleados) {
			if(e.getClass().getSimpleName().equals(categoria)) {
				s = s + "\n" + e.getDatos();
			}
		}
		
		s = s + "\n";
		
		return s;

		// devuelve una cadena con los empleados de una
		// categoría específica
	}

}

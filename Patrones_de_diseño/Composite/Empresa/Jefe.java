package patrones.Composite_Empresa;

import java.util.List;
import java.util.Random;

public class Jefe implements Empleado{
	
	String nombre;
	
	public Jefe(String nombre) {
		this.nombre = nombre;
	}
	
	@Override 
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public void add(Empleado e) {
		//Nada que implementar
	}
	
	@Override
	public void borrar(Empleado e) {
		//Nada que implementar
	}
	
	@Override
	public List <Empleado> getEmpleados() {
		return null;
	}
	
	@Override
	public int calculaPuntos() {
		return new Random().nextInt(24);
	}
	
	@Override
	public String toString() {
		return "Me llamo " + getNombre() + ", Jefe";
	}
	

}

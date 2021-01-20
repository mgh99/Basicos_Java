package patrones.Composite_Empresa;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Empleado{
	
	private List<Empleado> empleados = new ArrayList();
	private String nombre;
	
	public Manager(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public List <Empleado> getEmpleados() {
		return this.empleados;
	}
	
	@Override
	public void add(Empleado e) {
		if(e != null) {
			this.empleados.add(e);
		}
	}
	
	@Override
	public void borrar(Empleado e) {
		if(e != null) {
			this.empleados.remove(e);
		}
	}
	
	@Override
	public int calculaPuntos() {
		
		if(this.empleados.isEmpty()) {
			return 0;
		}
		
		//stream sirve para utiliza Map
		return Math.round(this.empleados.stream().mapToInt(e -> {
			System.out.println(e);
			return e.calculaPuntos();
		}).sum());
		
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}
	

}

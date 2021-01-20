package patrones.Composite_Empresa;

import java.util.List;

public interface Empleado {
	
	public String getNombre();
	public void add(Empleado e);
	public void borrar(Empleado e);
	public List<Empleado> getEmpleados();
	public int calculaPuntos();

}

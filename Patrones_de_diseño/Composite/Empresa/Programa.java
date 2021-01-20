package patrones.Composite_Empresa;

public class Programa {

	public static void main(String[] args) {
		
		Empleado m1 = new Manager("Carlos");
		
		Empleado j1 = new Jefe("Maria");
		Empleado j2 = new Jefe("Ana");
		Empleado j3 = new Jefe("Nati");
		
		m1.add(j1);
		m1.add(j2);
		m1.add(j3);
		
		Empleado m2 = new Manager("Susana");
		
		Empleado j4 = new Jefe("Jaime");
		Empleado j5 = new Jefe("Michael");
		
		m2.add(j4);
		m2.add(j5);

	}

}

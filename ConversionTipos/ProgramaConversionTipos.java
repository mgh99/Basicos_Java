public class ProgramaConversionTipos {

	public static void main(String[] args) {

		// conversion ascendente de tipos (upcasting)
		Alumno alumno = new Alumno("51927663H", "Belen", "Llano Gamez", 5, 10, 2000, "605125559", "INF");
		
		Alumno persona1 = alumno;
		System.out.println(persona1.getDatos());
		
		
		// conversión descendente de tipos (downcasting)
		// es necesario hacer casting explícito
		Persona persona2 = new Profesor("45318921V", "Juan", "Martin Lopez", 2, 5, 1972, "654025366", 2000);
		
		Profesor profesor = (Profesor) persona2;
		System.out.println(profesor.getDatos());

	}

}

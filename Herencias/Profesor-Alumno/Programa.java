import java.util.Vector;

public class TestPersonas {

	public static void main(String[] args) {
		
		 Vector<Persona> personas = new Vector<Persona>();
		 
		 System.out.println ("   DNI \t" + "  Nombre y apellidos \t" + " telefono \t" + " edad \t" + "         año ");
		 System.out.println (" ");
		 
		 personas.add(new Profesor("45318921V", "Juan", "Martin Lopez", 2, 5, 1972, "654025366", 2000));
		 personas.add(new Profesor("45289177M", "Mario", "Lara Gomez", 10, 11, 1977, "600030483", 1999));
		 personas.add(new Profesor("46291264X", "Laura", "Rios Valle", 5, 3, 1978, "615045753", 2008));
		 
		 personas.add(new Alumno("51927663H", "Belen", "Llano Gamez", 5, 10, 2000, "605125559", "INF"));
		 personas.add(new Alumno("52879130M", "Jesus", "Perez Lopez", 12, 9, 2001, "675029788", "IND"));
		 personas.add(new Alumno("52189335N", "Luisa", "Salas Rojo", 14, 4, 2001, "655157659", "INF"));
		 
		 // personas almacenadas en el vector, en orden ascendente

		 for (int i=0; i<personas.size(); i++) {

			 System.out.println(personas.get(i).getDatos());
			 System.out.println("");

		 }
		 // personas almacenadas en el vector, en orden descendente

		 for (int i=personas.size()-1; i>=0; i--) {

			 System.out.println(personas.get(i).getDatos());
			 System.out.println("");

		 }

		 // personas almacenadas en el vector, con un for para todo en orden ascendente

		 for (Persona p : personas) {

			 System.out.println(p.getDatos());
			 System.out.println("");

		 }

		 // personas con menos de 20 o entre 40 y 45

		 for (Persona p : personas) {

			 if (p.getEdad() < 20 || p.getEdad() >= 40 && p.getEdad() <= 45) {

				 System.out.println(p.getDatos());
				 System.out.println("");

			 }
		 }
	}
}



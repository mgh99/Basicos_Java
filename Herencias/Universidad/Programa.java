public class Programa {
	public static void main(String[] args) {
		
		Universidad nebrija = new Universidad("nebrija.com");
		
		nebrija.altaPersona(new Profesor("45318921V", "Juan", "Martin Lopez", 2, 5, 1972, "654025366", 2000));
		nebrija.altaPersona(new Profesor("45289177M", "Mario", "Lara Gomez", 10, 11, 1977, "600030483", 1999));
		nebrija.altaPersona(new Profesor("46291264X", "Laura", "Rios Valle", 5, 3, 1978, "615045753", 2008));
		nebrija.altaPersona(new Alumno("51927663H", "Belen", "Llano Gamez", 5, 10, 2000, "605125559", "INF"));
		nebrija.altaPersona(new Alumno("52879130M", "Jesus", "Perez Lopez", 12, 9, 2001, "675029788", "IND"));
		nebrija.altaPersona(new Alumno("52189335N", "Luisa", "Salas Rojo", 14, 4, 2001, "655157659", "INF"));
		
		System.out.println(nebrija.consultaPersonas());
		System.out.println(nebrija.consultaPersonas("Alumno"));
		System.out.println(nebrija.consultaPersonas("Profesor"));
	}
}

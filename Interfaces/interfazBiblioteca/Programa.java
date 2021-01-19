package interfaces.biblioteca;

public class Programa {

	public static void main(String[] args) {
		
		Libro libro = new Libro("El país de las Maravillas", 2012, "1245A", false );
		Libro libro2 = new Libro("Asesino de Brujas", 2021, "2145A", true );
		Libro libro3 = new Libro("Reina Roja", 2018, "1845A", true );
		
		Revista revista = new Revista("Revista del corazón", 2010, "1052B", 20);
		
		System.out.println(libro2.toString()); //esta prestado
		libro2.devolver(); // se devuelve
		System.out.println(libro2.toString());
		
		System.out.println(" ");
		System.out.println(libro.toString()); // no esta pretado
		libro.prestar(); // se presta el libro
		System.out.println(libro.toString());
		
		System.out.println(" ");
		System.out.println(libro3.toString()); // esta prestado
		libro3.prestado(); // se mira si esta o no prestado
		System.out.println(libro3.toString());
		
		System.out.println("\n\n");
		System.out.println(revista.toString());
	}
}

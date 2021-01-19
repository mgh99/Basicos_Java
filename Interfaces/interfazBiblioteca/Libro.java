/*
 * BIBLIOTECA QUE CONTIENE LIBROS Y REVISTAS
 * */

package interfaces.biblioteca;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;
	
	public Libro(String titulo, int añoPublicacion, String codigo, boolean prestado) {
		
		super(titulo, añoPublicacion, codigo);
		this.prestado = prestado;
	}
	
	public void prestar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	}
	
	public boolean prestado() {
		return prestado;
	}
	
	public String toString() {
		return super.toString() + "Libro[prestado=" + prestado + "]";
	}

}

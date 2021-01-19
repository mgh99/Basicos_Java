package interfaces.biblioteca;

public class Revista extends Publicacion{
	
	private int numero;
	
	public Revista(String titulo, int añoPublicacion, String codigo, int numero) {
		
		super(titulo, añoPublicacion, codigo);	
		this.numero = numero;
	}
	
	public String toString() {
		return super.toString() + "Numero: " + numero;
	}

}

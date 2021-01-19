package interfaces.biblioteca;

public class Publicacion {

	private String titulo;
	private int añoPublicacion;
	private String codigo;
	
	public Publicacion(String titulo, int añoPublicacion, String codigo) {
		
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.codigo = codigo;		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return "Publicación [codigo = " + codigo + ", titulo: " +
	titulo + ", año: " + añoPublicacion + "]";
	}
}

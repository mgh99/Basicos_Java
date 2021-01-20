package patrones.Adapter_ServicioBanco;

public class Usuario {
	
	private int id;
	private String nombre;
	private double totalDisponible;
	
	public Usuario(int id, String nombre, double totalDisponible) {
		this.id = id;
		this.nombre = nombre;
		this.totalDisponible = totalDisponible;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTotalDisponible() {
		return totalDisponible;
	}
	
	

}

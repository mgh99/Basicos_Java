package interfaces1;

public class BusquedaSimple implements IBusqueda{
	
	private String [] nombres;
	private Object [] claves;
	
	public BusquedaSimple(String[] nombres, Object[] claves) {
		this.nombres = nombres;
		this.claves = claves;
	}
	
	@Override
	public Object existe(String nombre) {
		//hace una busqueda secuencial en el array de nombres, si es el nombre indicado existe, 
		//devuelve la clave asociada
		
		for(int i =0; i < nombres.length; i++) {
			if(nombres[i].equals(nombre)) {
				return claves[i];
			}
		}		
		return null;	
	}

}

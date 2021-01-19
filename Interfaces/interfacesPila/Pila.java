package interfaces.pila;

public class Pila implements ColeccionInterfaz{
	
	private Object[] array;
	private int contador;
	
	public Pila(int tamañoMaximo) {
		this.array = new Object[tamañoMaximo];
		this.contador = 0;
	}
	
	public boolean estaVacia() {
		//devuelve true si la coleccion esta vacia y false si no
		return contador == 0;
	}
	
	public Object extraer() {
		//devuelve y elimina el primer elemento de la coleccion
		if(estaVacia()) {
			System.out.println("Esta vacia ");
		}else {
			return array [-contador];
		}
		return array [-contador];
	}
	
	public Object primero() {
		//devuelve el 1 elemento de la coleccion
		if(estaVacia()) {
			System.out.println("Está vacia ");
		}else {
			return array [-contador];
		}
		return array [-contador];
	}
	
	public boolean añadir(Object objeto) {
		//añade un objeto por el extremo que corresponda
		//devuleve true si ha añadido y false en contrario
		if(contador == array.length) {
			return false;
		}else {
			array[contador] = objeto;
			contador++;
			return true;
		}
	}
	
	public String toString() {
		
		String s = "[";
		for(int i = contador - 1; i >= 0; i--) {
			s += array[i].toString() + ", ";
		}
		
		if(!estaVacia()) {
			//SE ELIMINA LA ULTIMA COMA (,)
			return s.substring(0, s.length() - 1) + "]";
		}else {
			return s +"]";
		}
	}

}

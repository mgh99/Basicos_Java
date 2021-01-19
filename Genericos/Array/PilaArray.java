package genericos.array;

public class PilaArray<E> {
	
	private E[] arrayGenerico;//Array de tipo generico
	private int contador;
	
	public PilaArray(int capacidadMaxima) {
		arrayGenerico = (E[]) new Object[capacidadMaxima];
		contador = 0;
	}
	
	public boolean estaVacia() {
		return contador == 0;
	}
	
	public boolean añadir(E objeto) {
		if(contador == arrayGenerico.length) {
			return false;
		}else {
			arrayGenerico[contador] = objeto;
			contador++;
			return true;
		}
	}
	
	public E primero() {
		
		if(estaVacia() ) {
			System.out.println("Esta vacía ");
		}else {
			return arrayGenerico[-contador];
		}
		return arrayGenerico[-contador];
	}
	
	public String toString() {
		return arrayGenerico.toString();
	}
 
}

package patrones.Iterator_vocales;

import java.util.ListIterator;
import java.util.Vector;

public class Programa {
	
	public static void main(String[] args) {
		
		Vector<String> vocales = new Vector<String>();
		
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		ListIterator<String> iterator = vocales.listIterator();
		
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		
		System.out.println("");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
	}

}

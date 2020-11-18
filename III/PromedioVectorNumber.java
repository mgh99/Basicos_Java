import java.util.Vector;

public class TestPromedioVectorNumber {
	
	private static double promedio(Vector<Number> vector) {
		
		double s = 0.0;
		
		for (Number n : vector) {
			s = s + n.doubleValue();
		}
			
		return (s/vector.size());
	}
	
	public static void main(String[] args) {
		
		// vector de números enteros
		Vector<Number> enteros = new Vector<Number>();
		
		for (int i=1; i<=5; i++) {
			enteros.add(i);
		}
			
		System.out.println("Vector de números enteros " + enteros.toString() + ", el promedio es " + promedio(enteros));
		
		// vector de números reales
		Vector<Number> reales = new Vector<Number>();
		for (int i=1; i<=5; i++) {
			reales.add(1.0*i);
		}
			
		System.out.println("Vector de números reales " + reales.toString() + ", el promedio es " + promedio(reales));
	}
}

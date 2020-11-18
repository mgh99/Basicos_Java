import java.util.Vector;

public class TestPromedioVectorIntegerDouble {
	
	private static double promedio(Vector<? extends Number> vector) {
		double s = 0.0;
		
		for (Number n : vector) {
			s = s + n.doubleValue();
		}
			
		return (s/vector.size());
	}
	
	public static void main(String[] args) {
		
		// vector de números enteros
		Vector<Integer> enteros = new Vector<Integer>();
		
		for (int i=1; i<=5; i++) {
			enteros.add(i);
		}
			
		System.out.println("Vector de números enteros " + enteros.toString() + ", el promedio es " + promedio(enteros));
		
		// vector de números reales
		Vector<Double> reales = new Vector<Double>();
		for (int i=1; i<=5; i++) {
			reales.add(1.0*i);
		}
			
		System.out.println("Vector de números reales " + reales.toString() + ", el promedio es " + promedio(reales));
		
		//vector de números enteros y reales
		Vector<Number> numeros = new Vector<Number>();
		for (int i=1; i<=5; i++) {
			
			if (i % 2 == 0) {
				numeros.add(i);
			}else {
				numeros.add(1.0*i);
			}
				
		}
			
		System.out.println("Vector de números enteros y reales " + numeros.toString() + ", el promedio es " + promedio(numeros));
	}
}

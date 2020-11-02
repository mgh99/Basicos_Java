public class NumerosParesContinue {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {

			if (i % 2 != 0) {
				continue; // si el número es impar finaliza la iteración
			}
			System.out.println("Números pares: " + i);
		}
	}


}

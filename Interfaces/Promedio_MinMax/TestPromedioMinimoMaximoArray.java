package PromMinMax;

public class TestPromedioMinimoMaximoArray {

	public static void main(String[] args) {
		
		int [] datos = {8, 5, 9, 10, 4, 3, 7, 11, 12, 3, 11, 2, 4};
		
		PromdioMinimoMaximoArray p = new PromdioMinimoMaximoArray(datos);
		
		System.out.println("Promedio de minimo y maximo " + p.promedioMinimoMaximo());

	}

}

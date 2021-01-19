package PromMinMax;

public class PromdioMinimoMaximoArray {
	
	private int[] datos;
	
	public PromdioMinimoMaximoArray(int [] datos) {
		this.datos = datos;
	}
	
	public double promedioMinimoMaximo() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int n: this.datos) {
			if(min > n) {
				min = n;
			}
			
			if(max < n) {
				max = n;
			}
		}
		
		return (min + max) / 2.0;
	}

}

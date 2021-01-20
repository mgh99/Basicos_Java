package patrones.Factory_FigurasGeometricas;

public class Programa {

	public static void main(String[] args) {
		
		Programa ejemploFactory = new Programa();
		ejemploFactory.printForma("RECTANGULO");

	}
	
	//SIN EL PATRON FACTORY
	public void printForma(String tipoForma) {
		Forma forma = null;
		
		switch(tipoForma) {
		case "CIRCULO":
			forma = new Circulo();
			break;
		case "CUADRADO":
			forma = new Cuadrado();
			break;
		case "RECTANGULO":
			forma = new Rectangulo();
			break;
			default:
				System.out.println("ERROR, no se ha encontrado " + tipoForma);
		}
		
		forma.dibujar();
	}

}

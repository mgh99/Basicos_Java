package patrones.Facade_Movil;

public class Programa {

	public static void main(String[] args) {
		
		MovilFacade facade = new MovilFacade();
		Movil movil = facade.on();
		
		System.out.println("---------------------");
		facade.off(movil);

	}

}

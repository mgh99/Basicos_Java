package patrones.Singleton_Clientes;

public class EjemploSingleton {
	
	private static EjemploSingleton instancia = new EjemploSingleton();
	
	private EjemploSingleton() {
		
	}
	
	private static EjemploSingleton getInstancia() {
		return instancia;
	}

}

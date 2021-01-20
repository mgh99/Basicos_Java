package patrones.Singleton_Clientes;

public class EjemploSingleton2 {
	
	private static EjemploSingleton2 instancia;
	
	private EjemploSingleton2() {
		
	}
	
	private static EjemploSingleton2 getInstance() {
		if(instancia == null) {
			synchronized (EjemploSingleton2.class) {
				if(instancia == null) {
					instancia = new EjemploSingleton2();
				}
			}
		}
		
		return instancia;
	}

}


//NOTA: synchronized: solamente un subproceso puede acceder a dicho método a la vez

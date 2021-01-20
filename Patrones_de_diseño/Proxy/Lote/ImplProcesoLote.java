package patrones.Proxy_Cliente;

public class ImplProcesoLote implements ProcesoLote{
	
	private final String nombreArchivo;
	
	public ImplProcesoLote(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
		cargarDisco(nombreArchivo);
	}
	
	@Override
	public void proceso() {
		System.out.println("Archivo en proceso " + nombreArchivo);
	}

	private void cargarDisco(String nombreArchivo) {

		System.out.println("Proceso duro y caro...");

		for(int i = 0; i < 10; i++) {
			System.out.println("Cargando " + nombreArchivo + " " + i * 10 + "%");

			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {

			}
		}

		System.out.println("Caegado " + nombreArchivo);
	}
}
		
	

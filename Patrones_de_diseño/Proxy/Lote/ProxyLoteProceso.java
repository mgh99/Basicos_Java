package patrones.Proxy_Cliente;

public class ProxyLoteProceso implements ProcesoLote{
	
	private ImplProcesoLote procesoLote;
	private String nombreArhivo;
	
	public ProxyLoteProceso(String nombreArchivo) {
		this.nombreArhivo = nombreArchivo;
	}
	
	@Override
	public void proceso() {
		if(procesoLote == null) {
			procesoLote = new ImplProcesoLote(nombreArhivo);
		}
		
		procesoLote.proceso();
	}

}

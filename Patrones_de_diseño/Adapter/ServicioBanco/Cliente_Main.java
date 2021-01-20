package patrones.Adapter_ServicioBanco;

public class Cliente_Main {
	
	public static void main(String[] args) {
		
		ImplUsuarioAdapter adapter = new ImplUsuarioAdapter();
		adapter.getUsuario(1);
	}

}

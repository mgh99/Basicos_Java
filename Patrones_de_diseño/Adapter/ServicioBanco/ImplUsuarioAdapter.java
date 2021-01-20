package patrones.Adapter_ServicioBanco;

public class ImplUsuarioAdapter implements UsuarioAdapter{ 
	
	private ServicioBanco servicio = new ServicioBanco();
	
	@Override
	public Usuario getUsuario (int numeroCuenta) {
		
		DataBanco dataBanco = servicio.encontrarNumeroCuenta(numeroCuenta);
		Usuario usuario = new Usuario(dataBanco.getCuenta(), 
				dataBanco.getNombre(), dataBanco.getBalance());
		
		return usuario;
	}

}

import java.util.Vector;

public class Banco {

	private String web;
	private String entidad;
	private String nombre;

	private Vector<Cliente> clientes;
	private Vector<Cuenta> cuentas;

	public Banco(String web, String entidad, String nombre) {

		this.web = web;
		this.entidad = entidad;
		this.nombre = nombre;
		this.clientes = new Vector<Cliente>();
		this.cuentas = new Vector<Cuenta>();
		
	}

	public String getWeb() {
		return this.web;
	}

	public String getEntidad() {
		return this.entidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void altaCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

	public void altaCliente(Cliente c) {
		this.clientes.add(c);
	}

	public void ingresoCuenta(String numero, float cantidad) {

		// busca el número de cuenta en el vector de cuentas
		// corrientes, si lo encuentra, realiza el ingreso
		// de la cantidad indicada

		for(Cuenta c: this.cuentas) {
			if(c.getNumero().equals(numero)) {
				c.retiro(cantidad);
			}
		}

	}

	public void retiroCuenta(String numero, float cantidad) {

		// busca el número de cuenta en el vector de cuentas
		// corrientes, si lo encuentra, realiza el retiro
		// de la cantidad indicada

		for(Cuenta c: this.cuentas) {
			if(c.getNumero().equals(numero)) {
				c.retiro(cantidad);
			}
		}

	}

	public String consultaCuentas() {

		// muestra toda la información registrada de las cuentas
		// corrientes del banco
		
		String s = this.web + "\t\t\t Cuentas \n";
		
		for(Cuenta c: this.cuentas) {
			
			s = s + "\n" + c.getDatos();
		}
		
		s = s + "\n";
		return s;


	}
	
	public String consultaClientes() {
		
		String s = this.web + "\t\t\t Clientes \n";
		
		for(Cliente c: this.clientes) {
			
			s= s + "\n" + c.getDatos();
		}
		
		s = s +"\n";
		return s;
	}


}

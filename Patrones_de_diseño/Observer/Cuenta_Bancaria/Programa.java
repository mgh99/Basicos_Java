package patrones.Observer_Banco;

public class Programa {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		
		GastosBanco gastosBanco1 = new GastosBanco("comisión", 0.11d);
		GastosBanco gastosBanco2 = new GastosBanco("gastos", 0.11d);
		GastosBanco gastosBanco3 = new GastosBanco("compensación", 0.33d);
		
		cuentaBancaria.addObserver(gastosBanco1);
		cuentaBancaria.addObserver(gastosBanco2);
		cuentaBancaria.addObserver(gastosBanco3);
		
		cuentaBancaria.addCantidad(1000d);
		
		System.out.println(gastosBanco1.toString());
		System.out.println(gastosBanco2.toString());
		System.out.println(gastosBanco3.toString());

	}

}

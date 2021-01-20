package patrones.Builder_Banco;

public class Programa {

	public static void main(String[] args) {
		
		CuentaBancariaBuilder builder = new CuentaBancariaBuilder(12345l);
		
		CuentaBancaria cuentaBanco = builder.conBalance(1000.20)
				.conDueño("María")
				.conRatio(10.15)
				.conTipo(TipoCuentaBanco.PLATINUM).build();
		
		System.out.println(cuentaBanco);

	}

}

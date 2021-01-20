package patrones.Observer_Banco;

import java.util.Observable;

public class CuentaBancaria extends Observable{
	
	private double balance;
	
	public void addCantidad (Double cantidad) {
		this.balance += cantidad;
		setChanged();
		notifyObservers(balance);
	}
	
	public Double getBalance() {
		return balance;
	}

}

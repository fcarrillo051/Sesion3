package pkg;

public class Cuenta {

	private double saldo;
	
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo() + i);
	}

	public Cuenta(long saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

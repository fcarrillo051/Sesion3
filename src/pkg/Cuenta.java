package pkg;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo() + i);
	}

	public Cuenta(long saldo, String numero, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void retirar(int i) {
		this.setSaldo(this.getSaldo() - i);
		
	}

}

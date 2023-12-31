package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
    private List<Movimiento> movimientos;

	
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo() + i);
	}

	public Cuenta(double saldo, String numero, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
		this.movimientos = new ArrayList<Movimiento>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void retirar(double i) {
		this.setSaldo(this.getSaldo() - i);
		
	}

	public void realizarMovimiento(Movimiento movimiento) {
        if (movimiento.getSigno() == Movimiento.Signo.INGRESO) {
            saldo += movimiento.getImporte();
        } else if (movimiento.getSigno() == Movimiento.Signo.REINTEGRO) {
            if (saldo - movimiento.getImporte() >= -500) {
                saldo -= movimiento.getImporte();
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        }
        movimientos.add(movimiento);
    }
	
}

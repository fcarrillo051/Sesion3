package pkg;

public class Movimiento {
	
	private Double importe;
	private Signo signo;
	
	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}

	public enum Signo {
        INGRESO, REINTEGRO
    }
	
	public Movimiento(Double importe, Signo signo) {
		super();
		this.importe = importe;
		this.signo = signo;
	}

	
	
}

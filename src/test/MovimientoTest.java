package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;

class MovimientoTest {

	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345 = new Cuenta(50, "12345", null);
		cuenta67890 = new Cuenta(0, "67890", null);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Test0014() {
		cuenta12345.realizarMovimiento(new Movimiento((double)200, Movimiento.Signo.REINTEGRO));
        cuenta67890.realizarMovimiento(new Movimiento((double) 350, Movimiento.Signo.REINTEGRO));
        cuenta12345.realizarMovimiento(new Movimiento((double) 100, Movimiento.Signo.INGRESO));
        cuenta67890.realizarMovimiento(new Movimiento((double) 200, Movimiento.Signo.REINTEGRO));
        cuenta67890.realizarMovimiento(new Movimiento((double) 150, Movimiento.Signo.REINTEGRO));
        cuenta12345.realizarMovimiento(new Movimiento((double)200, Movimiento.Signo.REINTEGRO));
        cuenta67890.realizarMovimiento(new Movimiento((double) 50, Movimiento.Signo.INGRESO));
        cuenta67890.realizarMovimiento(new Movimiento((double) 100, Movimiento.Signo.REINTEGRO));

        assertEquals(-250, cuenta12345.getSaldo());
        assertEquals(-450, cuenta67890.getSaldo());
	}

}

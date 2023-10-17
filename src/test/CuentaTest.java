package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta((double)0, null, null);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(3000);
		assertEquals(3000, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.retirar(3000);
		assertEquals(-3000, cuenta.getSaldo());
	}
}

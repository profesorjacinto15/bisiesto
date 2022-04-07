package bisiesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bisiestoTest {

	@Test
	void testNo4No100() {
		int an=2011;
		boolean esperado = false;
		boolean resu = bisiesto.esBisiesto(an);
		assertEquals(esperado, resu);
		//fail("Not yet implemented");
	}

	@Test
	void testSi4No100() {
		int an= 2016;
		boolean esperado = true;
		boolean resu = bisiesto.esBisiesto(an);
		assertEquals(esperado, resu);
	}
	
	@Test
	void testSi4Si100() {
		int an = 1700;
		boolean esperado = false;
		boolean resu = bisiesto.esBisiesto(an);
		assertEquals(esperado, resu);
	}
	
	@Test
	void testSi100Si400() {
		int an = 1600;
		boolean esperado = true;
		boolean resul = bisiesto.esBisiesto(an);
		assertEquals(esperado, resul);
	}
	
	@Test
	void test2008() {
		assertEquals(true, bisiesto.esBisiesto(2008));
	}
	
}

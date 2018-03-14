package org.gradle;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionesDerivadasTest {

	private OperacionesDerivadas operacionesDerivadas;

	@Before
	public void setup() {
		operacionesDerivadas = new OperacionesDerivadas();
	}
	
	@Test
	public void ingresoArreglo3y5yObtengoMultiplicar15() {
		// arrange definicion de la variables
		int nro1 = 3;
		int nro2 = 5;
		
		// act- accion
		
		int resultado = operacionesDerivadas.Multiplicar(nro1, nro2);

		// assert
		assertEquals(15, resultado);
	}
	
	@Test
	public void ingresoArreg2y3yObtengoPotencia8() {
		// arrange definicion de la variables
		int nro1 = 2;
		int nro2 = 3;
		
		// act- accion
		
		int resultado = operacionesDerivadas.Potencia(nro1, nro2);

		// assert
		assertEquals(8, resultado);
	}

	@Test
	public void ingresoArreg3yObtengoFactorial6() {
		// arrange definicion de la variables
		int nro1 = 3;
		
		
		// act- accion
		
		int resultado = operacionesDerivadas.Factorial(nro1);

		// assert
		assertEquals(6, resultado);
	}
}

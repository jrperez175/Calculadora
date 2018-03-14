package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OperacionesBaseTest {
	
	private OperacionesBase operacionesBase;

	@Before
	public void setup() {
		operacionesBase = new OperacionesBase();
	}

	@Test
	public void ingresoo3y5yObtengoSumatoria8() {
		// arrange definicion de la variables
		int nro1 = 3;
		int nro2 = 5;

		// act- accion

		int resultado = operacionesBase.Suma(nro1,nro2);

		// assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void ingreso5y2yObtengoResta3() {
		// arrange definicion de la variables
		int nro1 = 5;
		int nro2 = 2;

		// act- accion

		int resultado = operacionesBase.Resta(nro1,nro2);

		// assert
		assertEquals(3, resultado);
	}
}

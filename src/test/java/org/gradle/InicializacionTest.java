package org.gradle;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class InicializacionTest {

	private Inicializacion inicializacion;

	@Before
	public void setup() {
		inicializacion = new Inicializacion();
	}

	@Test
	public void ingresoArreglo3y5yObtengoSumatoria8() {
		// arrange definicion de la variables
		int num[] = { 3, 5 };
		
		// act- accion
		//Suma = 1
		int resultado = inicializacion.Operaciones(num, 1);

		// assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void ingresoArreglo5y2yObtengoResta3() {
		// arrange definicion de la variables
		int num[] = { 5, 2 };
		
		// act- accion
		//Resta = 2
		int resultado = inicializacion.Operaciones(num, 2);

		// assert
		assertEquals(3, resultado);
	}
	
	@Test
	public void ingresoArreglo3y5yObtengoMultiplicar15() {
		// arrange definicion de la variables
		int num[] = { 3, 5 };
		
		// act- accion
		//Multiplicar = 3
		int resultado = inicializacion.Operaciones(num, 3);

		// assert
		assertEquals(15, resultado);
	}
	
	@Test
	public void ingresoArreglo2y3yObtengoPotencia8() {
		// arrange definicion de la variables
		int num[] = { 2, 3 };
		
		// act- accion
		//Potencia = 4
		int resultado = inicializacion.Operaciones(num, 4);

		// assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void ingresoArreglo3yObtengoFactorial6() {
		// arrange definicion de la variables
		int num[] = { 3 };
		
		// act- accion
		//Factorial = 5
		int resultado = inicializacion.Operaciones(num, 5);

		// assert
		assertEquals(6, resultado);
	}
}

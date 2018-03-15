package org.gradle;

public class Inicializacion {

	private OperacionesBase operacionesBase = new OperacionesBase();;
	private OperacionesDerivadas operacionesDerivadas = new OperacionesDerivadas();;

	public int Operaciones(int[] num, int operacion) {
		

		switch (operacion) {
		case 1:
			return operacionesBase.Suma(num[0], num[1]);
		case 2:
			return operacionesBase.Resta(num[0], num[1]);

		case 3:
			return operacionesDerivadas.Multiplicar(num[0], num[1]);

		case 4:
			return operacionesDerivadas.Potencia(num[0], num[1]);

		case 5:
			return operacionesDerivadas.Factorial(num[0]);
		default:
			return 0;
		}

	}

}

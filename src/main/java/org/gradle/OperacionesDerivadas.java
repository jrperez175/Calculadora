package org.gradle;

public class OperacionesDerivadas {

	public int Multiplicar(int nro1, int nro2) {
		int resultado = 0;
		
		for (int i = 0; i < nro2; i++) {
			resultado = resultado + nro1;
		}
		return resultado;
	}

	public int Potencia(int nro1, int nro2) {
		int contador = 0;
		int resultado = nro1;
		
		while (contador < nro2 - 1) {
			resultado = Multiplicar(resultado, nro1);
			contador++;
		}

		return resultado;
	}

	public int Factorial(int nro1) {
		if (nro1 != 1) {
			return Multiplicar(nro1,Factorial(nro1 - 1));
		} else {
			return 1;
		}
	}

}

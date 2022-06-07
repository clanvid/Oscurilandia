package oscurilandia;

import java.util.Scanner;

// Clase Validador : contiene método que verifica que lo ingresado por consola sea un número.

public class Validador {

	public static int validarOpcion(Scanner opcion) {

		boolean esNumerico = false;
		int numero = 0;

		do {

			try {
				numero = opcion.nextInt();

				esNumerico = true;

			}
			/*
			 * Se captura la excepción en el caso de que el usuario ingrese una opción que
			 * no sea un número.
			 */
			catch (Exception e) {
				System.err.println("Lo que ingresó no es un número.");
				System.out.println("Por favor digite una número.");
				// Para continuar se ejecuta un salto de línea.
				opcion.next();
			}

			/*
			 * El ciclo se realiza mientras la condición sea falsa, es verdadera cuando el
			 * usuario ingresa un número de tipo entero.
			 * 
			 */
		} while (!esNumerico);

		return numero;
	}

}

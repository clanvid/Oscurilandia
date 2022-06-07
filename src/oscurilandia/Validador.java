package oscurilandia;

import java.util.Scanner;

// Clase Validador : contiene m�todo que verifica que lo ingresado por consola sea un n�mero.

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
			 * Se captura la excepci�n en el caso de que el usuario ingrese una opci�n que
			 * no sea un n�mero.
			 */
			catch (Exception e) {
				System.err.println("Lo que ingres� no es un n�mero.");
				System.out.println("Por favor digite una n�mero.");
				// Para continuar se ejecuta un salto de l�nea.
				opcion.next();
			}

			/*
			 * El ciclo se realiza mientras la condici�n sea falsa, es verdadera cuando el
			 * usuario ingresa un n�mero de tipo entero.
			 * 
			 */
		} while (!esNumerico);

		return numero;
	}

}

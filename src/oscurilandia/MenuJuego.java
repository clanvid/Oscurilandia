package oscurilandia;

/*
 * Clase MenuJuego que muestra el men� del juego mediante el m�todo mostrarMenuJuego y la 
 * informaci�n correspondiente al juego mediante el m�todo mostrarInformacion Juego.
 */

public class MenuJuego {
	
	public static void mostrarMenuJuego() {
		System.out.println("       Bienvenido/a a Invasi�n a la C�mara Secreta       ");
        System.out.println("");
		System.out.println("    Elige alguna de las opciones.");
		System.out.println("");
		System.out.println("    -1. Jugar.");
		System.out.println("    -2. Ver puntaje de juegos anteriores.");
		System.out.println("    -3. Salir del juego.");
		System.out.println("    -4. Informaci�n del juego.");
		System.out.println("");
		System.out.print("      -Opci�n : ");

	}
	
	public static void mostrarInformacionJuego() {
		System.out.println("          Informaci�n sobre el juego Invasi�n a la C�mara Secreta           ");
		System.out.println("");
		System.out.println(" Ayuda a la FistLine a invadir la C�mara Secreta.");
		System.out.println(" Lanza un proyectil y da con los carros policiales que se encuentran ocultos.");
		System.out.println(" Observaci�n : Cada vez que se acierta con un proyectil a un carro se descubrir� en el ");
		System.out.println(" tablero la posici�n : se visualizar� K si corresponde a una Kromi, C si el carro es un ");
		System.out.println(" Caguano y T si es una Trupalla. Cuando el huevo lanzado no alcanza un carro se ");
		System.out.println(" dibujar� en el tablero una 'H' indicando el lanzamiento de un  huevo.");
	}

}

package oscurilandia;

/*
 * Clase MenuJuego que muestra el menú del juego mediante el método mostrarMenuJuego y la 
 * información correspondiente al juego mediante el método mostrarInformacion Juego.
 */

public class MenuJuego {
	
	public static void mostrarMenuJuego() {
		System.out.println("       Bienvenido/a a Invasión a la Cámara Secreta       ");
        System.out.println("");
		System.out.println("    Elige alguna de las opciones.");
		System.out.println("");
		System.out.println("    -1. Jugar.");
		System.out.println("    -2. Ver puntaje de juegos anteriores.");
		System.out.println("    -3. Salir del juego.");
		System.out.println("    -4. Información del juego.");
		System.out.println("");
		System.out.print("      -Opción : ");

	}
	
	public static void mostrarInformacionJuego() {
		System.out.println("          Información sobre el juego Invasión a la Cámara Secreta           ");
		System.out.println("");
		System.out.println(" Ayuda a la FistLine a invadir la Cámara Secreta.");
		System.out.println(" Lanza un proyectil y da con los carros policiales que se encuentran ocultos.");
		System.out.println(" Observación : Cada vez que se acierta con un proyectil a un carro se descubrirá en el ");
		System.out.println(" tablero la posición : se visualizará K si corresponde a una Kromi, C si el carro es un ");
		System.out.println(" Caguano y T si es una Trupalla. Cuando el huevo lanzado no alcanza un carro se ");
		System.out.println(" dibujará en el tablero una 'H' indicando el lanzamiento de un  huevo.");
	}

}

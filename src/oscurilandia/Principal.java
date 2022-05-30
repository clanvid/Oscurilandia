package oscurilandia;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

	/* Secuencia aplicación.
	 * 1. Crear Tablero Matriz 15x15.
	 * 2. Insertar 3 Kromis.
	 * 3. Insertar 5 Caguanos.
	 * 4. Insertar 10 Trupallas.
	 * 5. Desplegar en consola, Matríz creada con carros, y un menú aplicación.
	 * 
	 * Menú aplicación.
	 * 1. Insertar coordenadas para lanzar un Huevo.
	 * 2. Ver puntajes.
	 * 3. Salir del programa.
	 */

		Tablero tablero = new Tablero(); //Creación del Tablero de juego (objeto).
		Random aleatorio = new Random();

		//Creación de las Kromis:
		// Cantidad de objetos:		3
		// Dimensión en tablero:	3 celdas concecutivas.
		// Disposición en tablero:	Vertical fijo.
		// Ubicacion en tablero:	aleatoria.
		// Simbolo en tablero:		K 
		//int min = 0;
		//int max = 14;
		for(int i = 0; i <= 2; i++) {	//A crear 3 Kromis.
			int fila = 0;
			int filaInicio = 0;
			int columna = 0;
			boolean checkKromi1;
			boolean checkKromi2;
			boolean checkKromi3;
			do {
				fila = aleatorio.nextInt(15);
				filaInicio = fila;
				columna = aleatorio.nextInt(15);
				checkKromi1 = tablero.verificarCeldaVacia(fila,columna);
				checkKromi2 = tablero.verificarCeldaVacia(++fila,columna);
				checkKromi3 = tablero.verificarCeldaVacia(++fila,columna);
			} while(checkKromi1 || checkKromi2 || checkKromi3);
			
			Kromi kromi1 = new Kromi(filaInicio,columna);
			Kromi kromi2 = new Kromi(++filaInicio,columna);
			Kromi kromi3 = new Kromi(++filaInicio,columna);
			tablero.crearCarro(kromi1);
			tablero.crearCarro(kromi2);
			tablero.crearCarro(kromi3);
		}
		
		//Creación de los Caguanos:
		// Cantidad de objetos:		5
		// Dimensión en tablero:	2 celdas concecutivas.
		// Disposición en tablero:	Horizontal fijo.
		// Ubicacion en tablero:	aleatoria.
		// Simbolo en tablero:		C
		for(int i = 0; i <= 4; i++) {	//A crear 5 Caguanos.
			int fila = 0;
			int columna = 0;
			int columnaInicio = 0;
			boolean checkCaguano1;
			boolean checkCaguano2;
			do {
				fila = aleatorio.nextInt(15);
				columna = aleatorio.nextInt(15);
				columnaInicio = columna;
				checkCaguano1 = tablero.verificarCeldaVacia(fila,columna);
				checkCaguano2 = tablero.verificarCeldaVacia(fila,++columna);
			} while(checkCaguano1 || checkCaguano2);
			
			Caguano caguano1 = new Caguano(fila,columnaInicio);
			Caguano caguano2 = new Caguano(fila,++columnaInicio);
			tablero.crearCarro(caguano1);
			tablero.crearCarro(caguano2);
		}

		//Creación de las Trupallas.
		// Cantidad de objetos:		10
		// Dimensión en tablero:		1 celdas concecutivas.
		// Disposición en tablero:	-
		// Ubicacion en tablero:		aleatoria.
		// Simbolo en tablero:		T
		for(int i = 0; i <= 9; i++) {	//A crear 10 Trupallas.
			int fila = 0;
			int columna = 0;
			boolean checkTrupalla;
			do {
				fila = aleatorio.nextInt(15);
				columna = aleatorio.nextInt(15);
				checkTrupalla = tablero.verificarCeldaVacia(fila,columna);
			} while(checkTrupalla);
			
			Trupalla trupalla = new Trupalla(fila,columna);
			tablero.crearCarro(trupalla);
		}
		
		tablero.mostrarMatriz();
		
		Scanner leer = new Scanner(System.in);
		boolean seguirAtaque;
		int fila;
		int columna;
		do {
			System.out.println("-> Ingrese Fila y Columna, para lanzar un huevo:");
			System.out.println("Fila? : ");
			fila = leer.nextInt();
			System.out.println("Columna? :");
			columna = leer.nextInt();
			int puntajeIndividual = tablero.calcularPuntajeIndividual(fila,columna);
			Huevo huevo = new Huevo(fila,columna,puntajeIndividual);
			tablero.lanzarHuevo(huevo);
//			String resp = "-";
			System.out.println("Puntaje obenido: " + puntajeIndividual + " punto(s).");
			System.out.println("¿Quieres continuar jugando? true/false: ");
//			while(!(resp = "Si" || resp = "No")) {
//				resp = leer.nextLine();
//				Switch resp:
//					case "Si"
//			}
			seguirAtaque = leer.nextBoolean();
		} while(seguirAtaque);

		tablero.mostrarMatriz();
	}
}

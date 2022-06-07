package oscurilandia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Principal {


	public static void main(String[] args) {
		

		String salir = "NO";
		
		// Declaraci�n de men� juego.

		MenuJuego.mostrarMenuJuego();
		
		// Se declara una lista que almacena los puntajes de juegos anteriores.
		
		List<Integer> puntajesJuegosAnteriores = new ArrayList<Integer>();
		
		// Se formatea la fecha con formato d�a/mes/a�o 
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		// Se almacena tanto el puntaje del juego anterior como la fecha y hora del juego.
		
		HashMap<Integer, LocalDateTime> juegosAnteriores = new HashMap<Integer, LocalDateTime>();
		

		do {

			/*
			 * Secuencia aplicaci�n. 1. Crear Tablero Matriz 15x15. 2. Insertar 3 Kromis. 3.
			 * Insertar 5 Caguanos. 4. Insertar 10 Trupallas. 5. Desplegar en consola,
			 * Matriz creada con carros, y un men� aplicaci�n.
			 * 
			 */
			
			Scanner leerEntrada = new Scanner(System.in);
			
			// Se valida opci�n ingresada por consola sea de tipo num�rico.

			int opcionValidada = Validador.validarOpcion(leerEntrada);
			
			// Se crea objeto de clase Tablero con el constructor vac�o.
			Tablero tablero = new Tablero(); 
			// Se crea una instancia de la clase Random para establecer las posiciones aleatorias de los carros.
			
			Random aleatorio = new Random(); 
			
			// Creaci�n de las Kromis:
			// Cantidad de objetos: 3
			// Dimensi�n en tablero: 3 celdas consecutivas.
			// Disposici�n en tablero: Vertical fijo.
			// Ubicacion en tablero: aleatoria.
			// Simbolo en tablero: K
			// int min = 0;
			// int max = 14;
			
			for (int i = 0; i <= 2; i++) { // A crear 3 Kromis.
				
				int fila = 0;
				
				int filaInicio = 0;
				
				int columna = 0;
				
				boolean checkKromi1;
				boolean checkKromi2;
				boolean checkKromi3;
				
				do {
					
					/*
					 * Ya que es un carro de tipo Kromi el n�mero aleatorio tendr� un l�mite de 11
					 * para no desbordar la dimensi�n de la matriz.
					 */
					fila = aleatorio.nextInt(11);
					
					filaInicio = fila;
					
					columna = aleatorio.nextInt(11);
					
					// Verifica que la celda dada aleatoriamente est� vac�a para asignar posici�n del carro.
					
					checkKromi1 = tablero.verificarCeldaVacia(fila, columna);
					checkKromi2 = tablero.verificarCeldaVacia(++fila, columna);
					checkKromi3 = tablero.verificarCeldaVacia(++fila, columna);
					
				} while (checkKromi1 || checkKromi2 || checkKromi3);

				Kromi kromi1 = new Kromi(filaInicio, columna);
				Kromi kromi2 = new Kromi(++filaInicio, columna);
				Kromi kromi3 = new Kromi(++filaInicio, columna);
				
				tablero.crearCarro(kromi1);
				tablero.crearCarro(kromi2);
				tablero.crearCarro(kromi3);
			}

			// Creaci�n de los Caguanos:
			// Cantidad de objetos: 5
			// Dimensi�n en tablero: 2 celdas concecutivas.
			// Disposici�n en tablero: Horizontal fijo.
			// Ubicacion en tablero: aleatoria.
			// Simbolo en tablero: C
			
			for (int i = 0; i <= 4; i++) { // A crear 5 Caguanos.
				
				int fila = 0;
				
				int columna = 0;
				
				int columnaInicio = 0;
				
				boolean checkCaguano1;
				boolean checkCaguano2;
				
				do {
					fila = aleatorio.nextInt(12);
					columna = aleatorio.nextInt(12);
					columnaInicio = columna;
					checkCaguano1 = tablero.verificarCeldaVacia(fila, columna);
					checkCaguano2 = tablero.verificarCeldaVacia(fila, ++columna);
				} while (checkCaguano1 || checkCaguano2);

				Caguano caguano1 = new Caguano(fila, columnaInicio);
				Caguano caguano2 = new Caguano(fila, ++columnaInicio);
				
				tablero.crearCarro(caguano1);
				tablero.crearCarro(caguano2);
			}

			// Creaci�n de las Trupallas.
			// Cantidad de objetos: 10
			// Dimensi�n en tablero: 1 celdas concecutivas.
			// Disposici�n en tablero: -
			// Ubicacion en tablero: aleatoria.
			// Simbolo en tablero: T
			
			for (int i = 0; i <= 9; i++) { // A crear 10 Trupallas.
				
				int fila = 0;
				
				int columna = 0;
				
				boolean checkTrupalla;
				
				do {
					
					fila = aleatorio.nextInt(14);
					
					columna = aleatorio.nextInt(14);
					
					checkTrupalla = tablero.verificarCeldaVacia(fila, columna);
					
				} while (checkTrupalla);

				Trupalla trupalla = new Trupalla(fila, columna);
				tablero.crearCarro(trupalla);
			}

			// Se crea una matriz con las posiciones iniciales de los carros antes del ataque.
			
			char [][] tableroInicial = tablero.posicionarCarrosTablero();
		
			switch (opcionValidada) {

			case 1:
				System.out.println("");
				System.out.println("------------------------Bienvenido a Invasi�n a la C�mara Secreta----------------");
				System.out.println("");
				System.out.println("");
				
				tablero.mostrarTableroInicial();
				
				String seguirAtaque = "true";
				
				int fila;
				int columna;
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("");
				Scanner opcionElegida = new Scanner(System.in);
				
				int entradaValida; 
				
				do { 
					
				 System.out.println("-Ingrese fila y columna, para lanzar un huevo:");
				 System.out.println("Fila : "); 
		
				 fila = Validador.validarOpcion(entrada);
				 
				 System.out.println("Columna :"); 
				 
				 columna = Validador.validarOpcion(entrada);
				 
				 // Calcula puntaje individual obtenido en el lanzamiento.
				 
				 int puntajeIndividual = tablero.calcularPuntajeIndividual(fila,columna); 
				 
				 Huevo huevo = new Huevo(fila,columna,puntajeIndividual);
				 
				 tablero.lanzarHuevo(huevo); 
				 
				 System.out.println("Puntaje obtenido: " + puntajeIndividual + " punto(s).");
				 System.out.println("");
				 tablero.mostrarTablero(tablero.getTableroJuego());
				 System.out.println("");
				 System.out.println("�Quieres continuar jugando? (1 : S� / 2 :  No): "); 
				 
				 
				entradaValida = Validador.validarOpcion(opcionElegida);
				 
				switch(entradaValida) {
				case 1 : 
					    seguirAtaque = "true";
					    break;
					    
				case 2 :
					    seguirAtaque = "false";
					    
					    System.out.println("");
					    
					    System.out.println("Soluci�n revelada :");
					    
						tablero.mostrarTablero(tableroInicial);
						System.out.println("");
						System.out.println("EL tablero en base a tus lanzamientos : ");
						System.out.println("");
						tablero.mostrarTablero(tablero.posicionarCarrosHuevosTablero(tableroInicial));
						System.out.println("");
						System.out.println("Informaci�n sobre carros posicionados y huevos lanzados.");
						tablero.mostrarMatriz();
						
						System.out.println("");
						System.out.println("Lista de lanzamientos realizados : ");
						System.out.println("");
						
						int puntajeJuego = tablero.calcularPuntajeTotalJuego();
						puntajesJuegosAnteriores.add(puntajeJuego);
						juegosAnteriores.put(puntajeJuego,LocalDateTime.now());
						
						System.out.println("Puntaje total obtenido: " + puntajeJuego + " punto(s).");
						System.out.println("");
					    MenuJuego.mostrarMenuJuego();
					    break;
					    
				default:
					System.out.println("La opci�n ingresada debe ser del 1 al 2.");
					seguirAtaque = "false";
					MenuJuego.mostrarMenuJuego();
					
					break;
					    
				}
				
				}while(seguirAtaque == "true");
				
				break;


			case 2:
				 System.out.println("");
				 System.out.println("   ----------------Puntaje obtenido en el �ltimo juego----------------  ");
				 System.out.println("");
				 for(Integer puntaje : puntajesJuegosAnteriores) {
					 System.out.println("Puntaje total obtenido: " + puntaje + " punto(s). Fecha : " + dtf.format(juegosAnteriores.get(puntaje)));
				 }
				 System.out.println("  Ingrese una opci�n disponible(1 a 3) : ");
				 
				 break;

			case 3:
				System.out.println("�Hasta pronto!");
				salir = "S�";
				break;
			case 4:
				System.out.println("");
				MenuJuego.mostrarInformacionJuego();
				System.out.println("");
				System.out.print("Ingrese nuevamente la opci�n :");
				break;

			default:
				System.out.println("La opci�n ingresada debe ser del 1 al 3.");
				System.out.print("  Ingrese nuevamente la opci�n :");
				break;

			}

		} while (salir == "NO");
	
}
	
}

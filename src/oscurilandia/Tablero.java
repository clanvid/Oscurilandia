package oscurilandia;

import java.util.ArrayList;
import java.util.List;
//import java.util.Random;

/*
 * Clase Tablero.
 */

public class Tablero {
	private List<Carro> listaCarros = new ArrayList<Carro>();
										//Máximo 18 elementos, 3 Kromis +
										//5 Caguanos + 10 Trupallas.
	private List<Huevo> listaHuevos = new ArrayList<Huevo>(); //Sin límite de elementos.

	//-- Constructor(es). ------------------------------------------------------
		//
		public Tablero() {
			//super();
		}
		
//		public Tablero(List<Carro> listaCarros, List<Huevo> listaHuevos) {
//			//super();
//			this.listaCarros = listaCarros;
//			this.listaHuevos = listaHuevos;
//		}
	//-- Setters y Getters. ----------------------------------------------------
		public List<Carro> getListaCarros() {
			return this.listaCarros;
		}

		public void setListaCarros(List<Carro> listaCarros) {
			this.listaCarros = listaCarros;
		}

		public List<Huevo> getListaHuevos() {
			return this.listaHuevos;
		}

		public void setListaHuevos(List<Huevo> listaHuevos) {
			this.listaHuevos = listaHuevos;
		}

	//-- toString. -------------------------------------------------------------
		@Override
		public String toString() {
			return "Tablero [listaCarros=" + listaCarros + 
					", listaHuevos=" + listaHuevos + "]";
		}
	
	//-- Métodos. --------------------------------------------------------------
//	public static void crearTablero() {
//		char[][] tablero = new char[15][15];
//		tablero = inicializarTablero(tablero);
//		mostrarTablero(tablero);
//	}
//
//	public static char[][] inicializarTablero(char[][] matriz) {
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				matriz[i][j] = '.';
//			}
//		}
//		return matriz;
//	}
//	
//	public static void mostrarTablero(char[][] matriz) {
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				System.out.print(" "+matriz[i][j]);
//			}
//			System.out.println("");
//		}
//	}
//	
//	public static void insertarTresKromis() {

	
	public void crearCarro(Carro carro) {
		this.listaCarros.add(carro);
	}
	
	public void lanzarHuevo(Huevo huevolanzado) {
		this.listaHuevos.add(huevolanzado);
		
	}
	
	//Método mostrarMatriz: despliegue en forma de Matriz, de cada uno de los
	//carros existentes, y lanzamientos de hevos registrado. 
	public void mostrarMatriz() {
		 System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n");
		int puntajeTotal = 0;
		for (Carro car : this.listaCarros) {
			if(car instanceof Kromi) {
				System.out.println("Kromi: " + car.toString());
			} else if(car instanceof Caguano) {
				System.out.println("Caguano: " + car.toString());
			} else {
				System.out.println("Trupalla: " + car.toString());
			}
		}
		for (Huevo egg : this.listaHuevos) {
			System.out.println(egg.toString());
			puntajeTotal = puntajeTotal + egg.getPuntaje();
		}
		System.out.println("Puntaje total obtenido: " + puntajeTotal + " punto(s).");
	}
	
	public int calcularPuntajeIndividual(int fila, int columna) {
		int puntaje = 0;
		for (Carro car : this.listaCarros) {
			if ((car.getFila() == fila) && (car.getColumna() == columna)) {
				if(car instanceof Kromi) {
					puntaje = validarKromis(fila,columna) ? 10 : 3; //Ternario (if)
				} else if(car instanceof Caguano) {
					puntaje = validarCaguanos(fila,columna) ? 7 : 2; //Ternario (if)
				} else {
					puntaje = 1;
				}
				this.listaCarros.remove(car);
				break;
			}
		}
		return puntaje;
	}
	
	//Método "validarKromis" permite verificar, si quedan partes del objeto
	//Kromi en el tablero (comuesto por tres partes K de forma vertical).
	private boolean validarKromis(int fila, int columna) {
		int abajo = fila;
		int arriba = fila;
		boolean eliminadaKromis = true;
		//Se verificarà en 2 ciclos si hay elementos arriba o abajo de la
		//referencia (fila, columna) del huevo caído.
		for(int contador = 1 ; contador <= 2 ; contador++) {
			++abajo;
			--arriba;
			System.out.println("Abajo " + abajo);
			System.out.println("Arriba " + arriba);
			if(verificarCeldaVacia(abajo,columna) || verificarCeldaVacia(arriba,columna)) {
				eliminadaKromis = false;
				break;
			}
		}
		return eliminadaKromis;
	}
	
	//Método "validarCaguanos" permite verificar, si quedan partes del objeto
	//Caguano en el tablero (comuesto por dos partes C de forma horizontal).
	private boolean validarCaguanos(int fila, int columna) {
		boolean eliminadaCaguanos = true;
		//Se verificarà si hay elementos a la derecha o a la izquierda de la
		//referencia (fila, columna) del huevo caído.
		int derecha = columna + 1;
		int izquierda = columna - 1;
		if(verificarCeldaVacia(fila,derecha) || verificarCeldaVacia(fila,izquierda)) {
			eliminadaCaguanos = false;
		}
		return eliminadaCaguanos;
	}
	
//	private static double calcularPuntaje() {
//		return 0;
//	}
	
//	public boolean verificarCeldaVacia(int i, int j) {
//		boolean celdaOcupada = false;
//		if (tablero[i][j] == '.') {
//		}
//		return false;
//	}

	//Método "verificarCeldaVacia", verifica si la celda en cuestión está
	//ocupada o no.
	public boolean verificarCeldaVacia(int fila, int columna) {
		boolean existe = false;
		for (Carro car : this.listaCarros) {
			if((car.getFila() == fila) && (car.getColumna() == columna)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
}

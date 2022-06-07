package oscurilandia;

import java.time.LocalDate;

/*
 *SubClase Caguano
 *Cantidad de objetos:		5
 *Dimensión en tablero:		2 celdas consecutivas.
 *Disposición en tablero:	Horizontal fijo.
 *Ubicación en tablero:		aleatoria.
 *Símbolo en tablero:		C
 * 
 */

// Clase que extiende clase Carro (clase hija de clase Carro).

public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;

	// Constructor(es).

	// Constructor que recibe como parámetros los atributos fila y columna de la
	// clase padre.

	public Caguano(int fila, int columna) {

		super(fila, columna);
	}

	// Constructor que recibe como parámetros la totalidad de atributos de la clase
	// padre.

	public Caguano(int cantidadOcupantes, LocalDate fechaIngreso, int fila, int columna) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
	}

	// Constructor que recibe como parámetros la totalidad de atributos tanto de la
	// clase padre como la hija.

	public Caguano(int cantidadOcupantes, LocalDate fechaIngreso, int fila, int columna, int alcanceTiro,
			String colorConfeti) {

		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	// Métodos setters, getters.

	public int getAlcanceTiro() {
		return this.alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return this.colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	// Método toString sobreescrito apropiado de acuerdo a la lógica del juego.
	@Override
	public String toString() {
		return "Fila = " + getFila() + " , Columna = " + getColumna();
	}

}

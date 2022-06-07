package oscurilandia;

import java.time.LocalDate;

//Definiendo Clase padre (SuperClase) Carro.

public abstract class Carro {

	// Atributos de la clase Carro.

	private int cantidadOcupantes;
	private LocalDate fechaIngreso;
	private int fila;
	private int columna;
	
	
	// M�todos que se requer�an seg�n el enunciado.

	public void mostrarDatosCarro() {
		System.out.println("Cantidad de ocupantes : "+ this.cantidadOcupantes + " ; " +
	    " fecha de ingreso : " + this.fechaIngreso + " ; " + "coordenada X : " + this.columna +
	    "coordenada Y  : " + this.fila);

	}

	public void mostrarCoordenadasEnTablero() {
		
		System.out.println("El carro tiene como coordenadas " + this.columna + " en el eje x  y " 
		+ this.fila + " en el eje y.");

	}

	// Constructor(es).
	// Constructor vac�o

	public Carro() {
		super();
	}

	// Constructor que recibe como par�metros atributos fila y columna.

	public Carro(int fila, int columna) {
		// super();
		this.fila = fila;
		this.columna = columna;
	}

	// Constructor que recibe como par�metros la totalidad de atributos.

	public Carro(int cantidadOcupantes, LocalDate fechaIngreso, int fila, int columna) {
		// super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
	}

	// M�todos setters, getters.
	public int getCantidadOcupantes() {
		return this.cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso( LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getFila() {
		return this.fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return this.columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	// M�todo toString sobreescrito.

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}

}

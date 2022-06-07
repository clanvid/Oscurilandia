package oscurilandia;


import java.time.LocalDate;


/*
 *SubClase Kromi
 *Cantidad de objetos:		3
 *Dimensión en tablero:		3 celdas consecutivas.
 *Disposición en tablero:	Vertical fijo.
 *Ubicación en tablero:		aleatoria.
 *Símbolo en tablero:		K 
 * 
 */

// Clase que extiende de Carro (clase hija).

public class Kromi extends Carro {
	
	// Atributos clase Kromi.
	
	private int		anioFabricacion;
	private String	marca;

	//-- Constructor(es). ------------------------------------------------------
	
	// Constructor que recibe como parámetros los atributos fila y columna.

	public Kromi(int fila, int columna) {
		
		super(fila, columna);
	}

	// Constructor que recibe como parámetros los atributos del padre y los propios.
	
    public Kromi(int cantidadOcupantes, LocalDate fechaIngreso, int fila, int columna, int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
 	    this.anioFabricacion = anioFabricacion;
	    this.marca = marca;
     }
	
	//-- Métodos setters y getters. ----------------------------------------------------
    
	public int getAnioFabricacion() {
		return this.anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	// 
	/*
	 * Se sobreescribe el método toString de esta manera ya que se utilizará el constructor que utiliza como
	 * parámetros los atributos del padre.
	 */
	
	@Override
	public String toString() {
		return "Fila = " + getFila() + " , Columna = " + getColumna();
	}
	

}

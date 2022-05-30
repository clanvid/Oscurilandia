package oscurilandia;

//import java.util.Date;

/*
 *SubClase Kromi
 *Cantidad de objetos:		3
 *Dimensión en tablero:		3 celdas concecutivas.
 *Disposición en tablero:	Vertical fijo.
 *Ubicacion en tablero:		aleatoria.
 *Simbolo en tablero:		K 
 * 
 */

public class Kromi extends Carro {
	private int		anioFabricacion;
	private String	marca;

	//-- Constructor(es). ------------------------------------------------------
//	public Kromi(int coordX, int coordY) {
//		super(coordX, coordY);
//	}
	
	public Kromi(int fila, int columna) {
		super(fila, columna);
	}

//	public Kromi(int cantidadOcupantes, Date fechaIngreso, int coordX, int coordY, int anioFabricacion, String marca) {
//		super(cantidadOcupantes, fechaIngreso, coordX, coordY);
//		this.anioFabricacion = anioFabricacion;
//		this.marca = marca;
//	}
	
	//-- Setters y Getters. ----------------------------------------------------
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


	
	//-- toString. -------------------------------------------------------------
//	@Override
//	public String toString() {
//		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + ", getCantidadOcupantes()="
//				+ getCantidadOcupantes() + ", getFechaIngreso()=" + getFechaIngreso() + ", getCoordX()=" + getCoordX()
//				+ ", getCoordY()=" + getCoordY() + "]";
//	}
	
	@Override
	public String toString() {
		return "Fila = " + getFila() + " , Columna = " + getColumna();
	}
	

}

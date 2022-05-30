package oscurilandia;

//import java.util.Date;

/*
 *SubClase Trupalla
 *Cantidad de objetos:		10
 *Dimensión en tablero:		1 celdas concecutivas.
 *Disposición en tablero:	-
 *Ubicacion en tablero:		aleatoria.
 *Simbolo en tablero:		T
 * 
 */

public class Trupalla extends Carro {
	private String	nombreConductor;
	private int		nivelArmadura;		//Entero entre 1 y 5.

	//Constructor(es).
	public Trupalla(int fila, int columna) {
		super(fila, columna);
	}
	
	
//	public Trupalla(int cantidadOcupantes, Date fechaIngreso, int fila, int columna) {
//		super(cantidadOcupantes, fechaIngreso, fila, columna);
//	}
//
//	public Trupalla(int cantidadOcupantes, Date fechaIngreso, int fila, int columna, String nombreConductor,
//			int nivelArmadura) {
//		super(cantidadOcupantes, fechaIngreso, fila, columna);
//		this.nombreConductor = nombreConductor;
//		this.nivelArmadura = nivelArmadura;
//	}

	//Métodos setters, getters.
	public String getNombreConductor() {
		return this.nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public int getNivelArmadura() {
		return this.nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	//Método toString.
//	@Override
//	public String toString() {
//		return "Trupalla [nombreConductor=" + nombreConductor + ", nivelArmadura=" + nivelArmadura + ", Columna X ="
//				+ getCoordX() + ", Fila Y =" + getCoordY() + "]";
//	}
	
	@Override
	public String toString() {
		return "Fila = " + getFila() + " , Columna = " + getColumna();
	}
	
	
}

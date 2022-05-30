package oscurilandia;

//import java.util.Date;

/*
 *SubClase Caguano
 *Cantidad de objetos:		5
 *Dimensi�n en tablero:		2 celdas concecutivas.
 *Disposici�n en tablero:	Horizontal fijo.
 *Ubicacion en tablero:		aleatoria.
 *Simbolo en tablero:		C
 * 
 */

public class Caguano extends Carro {
	private int 	alcanceTiro;
	private String	colorConfeti;
	
	//Constructor(es).
	public Caguano(int fila, int columna) {
		super(fila, columna);
	}

//	public Caguano(int cantidadOcupantes, Date fechaIngreso, int fila, int columna) {
//		super(cantidadOcupantes, fechaIngreso, fila, columna);
//	}

//	public Caguano(int cantidadOcupantes, Date fechaIngreso, int fila, int columna, int alcanceTiro,
//			String colorConfeti) {
//		super(cantidadOcupantes, fechaIngreso, fila, columna);
//		this.alcanceTiro = alcanceTiro;
//		this.colorConfeti = colorConfeti;
//	}
	
	//M�todos setters, getters.
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

	//M�todo toString.
//	@Override
//	public String toString() {
//		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + ", getCantidadOcupantes()="
//				+ getCantidadOcupantes() + ", getFechaIngreso()=" + getFechaIngreso() + ", getCoordX()=" + getCoordX()
//				+ ", getCoordY()=" + getCoordY() + "]";
//	}
	
	@Override
	public String toString() {
		return "Fila = " + getFila() + " , Columna = " + getColumna();
	}

}

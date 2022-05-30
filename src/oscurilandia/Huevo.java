package oscurilandia;

/*
 * Clase Huevo.
 */

public class Huevo {
	private int filProyectil;
	private int colProyectil;
	private int puntaje;
	
	//Constructor(es).
//	public Huevo() {
//		super();
//	}
	
	public Huevo(int filProyectil, int colProyectil, int puntaje) {
		//super();
		this.filProyectil = filProyectil;
		this.colProyectil = colProyectil;
		this.puntaje = puntaje;
	}	
	
	//M�todos setters, getters.
	public int getFilProyectil() {
		return this.filProyectil;
	}

	public void setFilProyectil(int filProyectil) {
		this.filProyectil = filProyectil;
	}

	public int getColProyectil() {
		return this.colProyectil;
	}

	public void setColProyectil(int colProyectil) {
		this.colProyectil = colProyectil;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	//M�todo toString.
	@Override
	public String toString() {
		return "Huevo [ N�mero de Fila del Proyectil = " + filProyectil + 
				", N�mero de Columna del Proyectil = " + colProyectil + 
				", Puntaje = " + puntaje + " ]";
	}
	
	

}

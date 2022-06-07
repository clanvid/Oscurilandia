package oscurilandia;

/*
 * Clase Huevo.
 */

public class Huevo {

	// Atributos de la clase Huevo.

	private int filaProyectil;
	private int columnaProyectil;
	private int puntaje;

	// Constructor que recibe par�metros los atributos correspondientes.

	public Huevo(int filaProyectil, int columnaProyectil, int puntaje) {
		// super();
		this.filaProyectil = filaProyectil;
		this.columnaProyectil = columnaProyectil;
		this.puntaje = puntaje;
	}

	// M�todos setters, getters.

	public int getFilaProyectil() {
		return this.filaProyectil;
	}

	public void setFilProyectil(int filaProyectil) {
		this.filaProyectil = filaProyectil;
	}

	public int getColumnaProyectil() {
		return this.columnaProyectil;
	}

	public void setColProyectil(int columnaProyectil) {
		this.columnaProyectil = columnaProyectil;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	// M�todo toString sobreescrito.

	@Override
	public String toString() {
		return "Huevo [ N�mero de Fila del Proyectil = " + filaProyectil + ", N�mero de Columna del Proyectil = "
				+ columnaProyectil + ", Puntaje = " + puntaje + " ]";
	}

}

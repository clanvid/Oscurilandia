package oscurilandia;

import java.util.Date;

//Definiendo Clase padre (SuperClase) Carro.
public abstract class Carro {
	private int		cantidadOcupantes;
	private Date	fechaIngreso;
	private int		fila;
	private int		columna;
	
	public void mostrarDatos() {
		
	}

	public void mostrarCoordenadas() {
		
	}

	//Constructor(es).
	public Carro() {
		super();
	}

	public Carro(int fila, int columna) {
		//super();
		this.fila = fila;
		this.columna = columna;
	}

	public Carro(int cantidadOcupantes, Date fechaIngreso, int fila, int columna) {
		//super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
	}

	//Métodos setters, getters.
	public int getCantidadOcupantes() {
		return this.cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
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

	//Método toString.
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + 
				", fechaIngreso=" + fechaIngreso + 
				", fila=" + fila + ", columna=" + columna + "]";
	}
	
}

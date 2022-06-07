package oscurilandia;

import java.util.ArrayList;
import java.util.List;


/*
 * Clase Tablero.
 */

/*
 * Clase Tablero implementará mediante interfaces los métodos que no le son propios
 * como clase.
 */

public class Tablero implements PosicionesTablero, PuntajePartida, PuntajeJuego{
	
	// Se inicializan los atributos para efectos de la lógica del juego.
	
	private List<Carro> listaCarros = new ArrayList<Carro>();
	
										//Máximo 18 elementos, 3 Kromis +
										//5 Caguanos + 10 Trupallas.
	
	private List<Carro> listaCarrosProyectados = new ArrayList<Carro>();
	
	private List<Huevo> listaHuevos = new ArrayList<Huevo>(); // Sin límite de elementos.
	
	/*
	 * Se añade atributo tableroJuego para visualizar las posiciones de los carros y el 
	 * alcance del huevo lanzado.
	 */
	private char [][] tableroJuego = new char[15][15];
	

	//-- Constructor(es). ------------------------------------------------------
	// Constructor vacío.
	
		public Tablero() {
			//super();
		}
		
		/*
		 * Constructor que recibe como parámetros una lista de objetos de clase Carro y una lista de objetos
		 * de clase Huevo.
		 */
		
        public Tablero(List<Carro> listaCarros, List<Huevo> listaHuevos) {
     		//super();
      		this.listaCarros = listaCarros;
     		this.listaHuevos = listaHuevos;
        }
		
	//-- Métodos Setters y Getters. ----------------------------------------------------
		
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
		
		

	    public char[][] getTableroJuego() {
			return tableroJuego;
		}

		public void setTableroJuego(char[][] tableroJuego) {
			this.tableroJuego = tableroJuego;
		}

		
	//-- Métodos declarados en el enunciado.
		
	// Método crear carro : añade un objeto de clase Carro a la lista de objetos de clase Carro.
	
	public void crearCarro(Carro carro) {
		this.listaCarros.add(carro);
	}
	

	//Método mostrarMatriz: despliegue en forma de Matriz, de cada uno de los
	//carros existentes, y lanzamientos de huevos registrado. 
	
	public void mostrarMatriz() {
		 System.out.println("\n");
		 System.out.println("Información de carros : ");
	     System.out.println("");
		for (Carro car : this.listaCarros) {
			if(car instanceof Kromi) {
				System.out.println("Kromi: " + car.toString());
			} else if(car instanceof Caguano) {
				System.out.println("Caguano: " + car.toString());
			} else {
				System.out.println("Trupalla: " + car.toString());
			}
		}
		System.out.println("");
		System.out.println("Información de huevos lanzados : ");
		System.out.println("");
		for (Huevo egg : this.listaHuevos) {
			System.out.println(egg.toString());
		}
		
	}
	
	
	// Método creado para mostrar visualmente por consola el tablero inicial con símbolo de incógnita.
	
	public void mostrarTableroInicial() {

        for (int i = 0; i < this.tableroJuego.length; i++) {
        	 
            for (int j = 0; j < this.tableroJuego[i].length; j++) {
                this.tableroJuego[i][j]= '?';
            }
        }
             
        System.out.println("      0     1     2     3     4     5     6     7     8     9     10    11    12    13    14");
        for (int i = 0; i < this.tableroJuego.length; i++) {
        	// System.out.println("  __   __   __  __  __  __  __  __  __  __  __  __  __  __  __"); 
            for (int j = 0; j < this.tableroJuego[i].length; j++) {
            	if (j == 0 && i < 10) {
            		System.out.print( i + "  |  " + this.tableroJuego[i][j] + " ");
            	}else if (j == 0 && i >= 10){
            		 System.out.print(i + " |  " + this.tableroJuego[i][j] + " ");
            	}else if (j != 0) {
            		System.out.print(" |  " + this.tableroJuego[i][j] + " ");
            	}
               
              
            }
          
            System.out.println(" |");
        }
          
	}
	
	// Método que muestra el tablero con los lanzamientos de los huevos y los aciertos.
	
    public void mostrarTablero(char [][] tablero) {
    	
             
        System.out.println("      0     1     2     3     4     5     6     7     8     9     10    11    12    13    14");
        for (int i = 0; i <tablero.length; i++) {
        	// System.out.println("  __   __   __  __  __  __  __  __  __  __  __  __  __  __  __"); 
            for (int j = 0; j < tablero[i].length; j++) {
            	if (j == 0 && i < 10) {
            		System.out.print( i + "  |  " + tablero[i][j] + " ");
            	}else if (j == 0 && i >= 10){
            		 System.out.print(i + " |  " + tablero[i][j] + " ");
            	}else if (j != 0) {
            		System.out.print(" |  " + tablero[i][j] + " ");
            	}
               
              
            }
          
            System.out.println(" |");
        }
          
		}
    
    
    // Configura el tablero con los carros originalmente posicionados de forma aleatoria.
		
      public char [][] posicionarCarrosTablero() {
    	  
    	  char [][] tableroConCarros = new char [15][15];
    	  
    	  for (Carro car : this.listaCarros) {
  			if(car instanceof Kromi) {
  				tableroConCarros[car.getFila()][car.getColumna()]='K';
  			} else if(car instanceof Caguano) {
  				tableroConCarros[car.getFila()][car.getColumna()]='C';
  			} else {
  				
  				tableroConCarros[car.getFila()][car.getColumna()]='T';
  			}
  		}
    	  
    	  return tableroConCarros;
    	  
      }
    
      // Configura tablero con carros posicionados junto con lanzamientos realizados.
      
      public char[][] posicionarCarrosHuevosTablero(char [][] tableroConCarros){
    	  
    	  char [][] tableroConCarrosHuevosLanzados = tableroConCarros;
    	  
    	  for (Huevo egg : this.listaHuevos) {
  			tableroConCarros[egg.getFilaProyectil()][egg.getColumnaProyectil()] = 'H';
  		  }
    	  
    	  return tableroConCarrosHuevosLanzados;
    	  
      }
      
  	
  	//Método "validarKromis" permite verificar, si quedan partes del objeto
  	//Kromi en el tablero (compuesto por tres partes K de forma vertical).
  	
  	private boolean validarKromis(int fila, int columna) {
  		int abajo = fila;
  		int arriba = fila;
  		boolean eliminadaKromis = true;
  		//Se verificará en 2 ciclos si hay elementos arriba o abajo de la
  		//referencia (fila, columna) del huevo caído.
  		for(int contador = 1 ; contador <= 2 ; contador++) {
  			++abajo;
  			--arriba;
  			//System.out.println("Abajo " + abajo);
  		   //System.out.println("Arriba " + arriba);
  			
  			if(verificarCeldaVacia(abajo,columna) || verificarCeldaVacia(arriba,columna)) {
  				eliminadaKromis = false;
  				break;
  			}
  		}
  		return eliminadaKromis;
  	}
  	


  	//Método "validarCaguanos" permite verificar, si quedan partes del objeto
  	//Caguano en el tablero (compuesto por dos partes C de forma horizontal).
  	
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

	
	// Método de la interfaz implementada 
	@Override
	public int calcularPuntajeIndividual(int fila, int columna) {
		boolean esCarroProyectado = false;
		int puntaje = 0;
		for (Carro car : this.listaCarrosProyectados) {
			if((car.getFila() == fila) && (car.getColumna() == columna)) {
				puntaje = 0;
				esCarroProyectado = true;
				System.out.println("");
				System.out.println("Proyectaste un huevo en la misma posición en la que acertaste un carro.");
			}
		}
		for (Carro car : this.listaCarros) {
			if ((car.getFila() == fila) && (car.getColumna() == columna)) {
				if(car instanceof Kromi) {
					/*
					 * Son 13 puntos ya que se considera 3 puntos por la posición en que
					 * está la Kromi y 10 adicionales si la inutiliza completamente,
					 */
					puntaje = validarKromis(fila,columna) ? 13 : 3; //Ternario (if)
					this.tableroJuego[fila][columna] = 'K';
					
				} else if(car instanceof Caguano) {
					/*
					 * Son 9 puntos ya que se considera 2 puntos por la posición en que
					 * está un Caguano y 7 adicionales si lo inutiliza completamente,
					 */
					puntaje = validarCaguanos(fila,columna) ? 9 : 2; //Ternario (if)
					this.tableroJuego[fila][columna] = 'C';
				} else {
					puntaje = 1;
					this.tableroJuego[fila][columna] = 'T';
				}
				this.listaCarros.remove(car);
				this.listaCarrosProyectados.add(car);
				break;
			}else {
				/*
				 * Para identificar que el usuario ha dado sobre un carro se conservará
				 * el símbolo correspondiente al carro. Si el lanzamiento no da a un carro
				 * se coloca en la posición correspondiente una "H" alusiva al huevo lanzado.
				 */
				if(!esCarroProyectado) {
					this.tableroJuego[fila][columna] = 'H';
				}
				
				
			}
		}
		
		if(puntaje == 0 && !esCarroProyectado) {
			System.out.println("");
			System.out.println("Vaya, no has acertado. Vuelve a intentarlo.");
		}else if ( puntaje != 0 && !esCarroProyectado){
			 System.out.println("¡Acertaste, sigue así!");
		}
		return puntaje;
	}
	
	
	// Se implementa método de la interfaz PosicionesTablero.
		// Método lanzarHuevo :  Añade un objeto de clase Huevo a la lista de objetos de clase Huevo.
		
		@Override
		public void lanzarHuevo(Huevo huevoParaLanzar) {
			this.listaHuevos.add(huevoParaLanzar);
		}
	
	/* Para mayor orden se decide implementar una interfaz que contiene el método calcularPuntajeTotalJuego
	 * obteniendo el puntaje de cada objeto de la clase Huevo.
	 */
	
	@Override
	public int calcularPuntajeTotalJuego() {
		int puntajeTotal = 0;
		for (Huevo egg : this.listaHuevos) {
			System.out.println(egg.toString());
			puntajeTotal = puntajeTotal + egg.getPuntaje();
		}
		return puntajeTotal;
		
	}
	
	//Método toString apropiado a la lógica de juego.
	
			@Override
			public String toString() {
				return "Tablero [listaCarros=" + listaCarros + 
						", listaHuevos=" + listaHuevos + "]";
			}
		

	}
	
	
	
	
	
	


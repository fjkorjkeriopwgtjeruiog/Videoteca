package control;
import utils.Entrada;
import model.Juego;

import model.Juego;
import utils.Entrada;

/**
 * ColeccionJuegos 
 * @author  Ivan
 * @version 1.0
 * 09-11-2022
 */

public class ColeccionJuegos {
	control.CSV csv;
	services.ColeccionJuegos coleccionServices;
	public ColeccionJuegos(){
		csv=new control.CSV();
		coleccionServices=new services.ColeccionJuegos();
	}
	
	/**
	 * ColeccionJuegos / Saca el menu principal
	 * @author  Ivan
	 * @version 1.0
	 * 09-11-2022
	 */
	public void menu () {
		boolean continuar = false; //posibilidad de salir del loop
		do {	
		boolean opcion1activa= false;
	    System.out.println("Esto es el mensaje incial no corresponde a este spring");
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			//Hola, soy Martin. He cambiado el funcionamiento del CSV por recomendacion de Antonio 
			//y por tanto esto tambien tiene que cambiar.
			//Hay que tener un objeto de tipo CSV, y el metodo cargaInicialDeDatos lo que hace
			//es devolver el HashMap<Integer,Juego> que habrá que añadir luego a ColeccionJuegos cuando se pueda
			
			cargarDatosIniciales();
			
			opcion1activa= true;
		}
		
		//otras opciones
			
		} while (continuar);
	}

	/**
	 * ColeccionJuegos / llama al metodo en servicios
	 * @author  Ivan
	 * @version 1.0
	 * 09-11-2022
	 */
	public boolean addJuego(Juego juego) {
		try {
			return coleccionServices.CrearJuego(juego);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//Le pide al CSV que cargue los datos iniciales
	public boolean cargarDatosIniciales() {
		return coleccionServices.addLista( csv.cargaInicialdeDatos() );
	}
	


}

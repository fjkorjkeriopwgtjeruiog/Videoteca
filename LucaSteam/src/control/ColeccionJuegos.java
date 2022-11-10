package control;
import utils.Entrada;

import java.util.List;

import model.Juego;

import model.Juego;
import utils.Entrada;

/**
 * ColeccionJuegos 
 * @author  Ivan
 * @version 1.0
 * 09-11-2022
 */

/**
 * addLista / Coge una lista de juegos y los añade todos. Devuelve false o true según si se produjo un error o no.
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
 */

public class ColeccionJuegos {

	/**
	 * ColeccionJuegos / Saca el menu principal
	 * @author  Ivan
	 * @version 1.0
	 * 09-11-2022
	 */
	public static void menu () {
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
			
			//control.CSV.cargaInicialdeDatos();
			
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
	public static void nuevojuego(Juego juego) {
		services.ColeccionJuegos.CrearJuego(juego);
	}


	public boolean addLista(List<Juego> lista){
    	int l=coleccion.size()+1;
    	for(Juego j: lista) {
    		try{
				CrearJuego(l,j);
			}catch (Exception e){
				return false;
			}
    	}
    	return true;
    }
}

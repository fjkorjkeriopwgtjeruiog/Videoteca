package control;
import utils.Entrada;

import java.util.List;

import model.Juego;


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

	
	public static void menu () 
	{
		boolean continuar = false; //posibilidad de salir del loop
		do {	
		boolean opcion1activa= false;
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			opcion1();
			//Hola, soy Martin. He cambiado el funcionamiento del CSV por recomendacion de Antonio 
			//y por tanto esto tambien tiene que cambiar.
			//Hay que tener un objeto de tipo CSV, y el metodo cargaInicialDeDatos lo que hace
			//es devolver el HashMap<Integer,Juego> que habrá que añadir luego a ColeccionJuegos cuando se pueda
			
		   
		}
		
		//otras opciones
			
		} while (continuar);
	}

	
	public static void nuevojuego(Juego juego) 
	{
		services.ColeccionJuegos.CrearJuego(juego);
	}

	
	 public static void opcion1() 
	 {
		cargaInicialdeDatos(){};

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

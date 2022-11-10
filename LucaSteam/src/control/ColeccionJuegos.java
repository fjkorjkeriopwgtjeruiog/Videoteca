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
	control.CSV csv;
	services.ColeccionJuegos coleccionServices;
	public ColeccionJuegos(){
		csv=new control.CSV();
		coleccionServices=new services.ColeccionJuegos();
	}
	
	public void menu () {
		boolean continuar = false; //posibilidad de salir del loop
		do {	
		boolean opcion1activa= false;
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			opcion1();
			opcion1activa= true;
		}
		
		//otras opciones
			
		} while (continuar);
	}


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
	

	
	 public void opcion1() {
		cargarDatosIniciales();
	 }

	public boolean addLista(List<Juego> lista){
    	return coleccionServices.addLista(lista);
    }
}

package control;
import utils.Entrada;

import java.util.List;
import java.util.Map;

import model.Juego;


/**
 * ColeccionJuegos 
 * @author  Ivan
 * @version 1.0
 * 09-11-2022
 */

/**
 * Control.ColeccionJuegos / Clase que contiene el menu
 * @author  Daniel e Ivan
 * @version 2.0
 * 10-11-2022
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
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		System.out.println("Presiona 2 para hacer añadir un juego");
		System.out.println("Presiona 3 para listar una coleccion");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			opcion1();	
		}
		if (opcion==2) {
			opcion2();
		}
		if (opcion==3) {
	    System.out.print(opcion3(coleccionServices.getColeccion()));
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
	 
	 public Juego opcion2(data.ColeccionJuegos coleccion, int idnumber) {
		 Map<Integer, Juego> coleccioncompleta = coleccion.getColeccion();
		 Juego juegoaAñadir = coleccioncompleta.get(idnumber);
		 return juegoaAñadir;
	 }
	 
	 public String opcion3(data.ColeccionJuegos coleccion) {
		 Map<Integer, Juego> coleccioncompleta = coleccion.getColeccion();
		return coleccioncompleta.toString();
	 }
	 
	public boolean addLista(List<Juego> lista){
    	return coleccionServices.addLista(lista);
    }
}

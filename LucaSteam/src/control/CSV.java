package control;
import java.util.HashMap;

import model.Juego;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */


public class CSV {
	services.CSV csvServiceManager;
	public HashMap<Integer, Juego> cargaInicialdeDatos(){
		return csvServiceManager.cargaInicialdeDatos();
	}
	
}

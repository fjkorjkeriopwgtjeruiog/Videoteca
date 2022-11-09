package services;
import java.util.HashMap;

import model.Juego;
/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */

public class CSV {
	data.CSV csvDataManager;
	
	public CSV() {
		
	}
	
	public HashMap<Integer, Juego>  cargaInicialdeDatos() {
		return csvDataManager.buildGameCollectionFromCSVFile("vgsales.csv");
	}
}

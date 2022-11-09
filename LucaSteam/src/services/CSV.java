package services;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */

public class CSV {
	public static void cargaInicialdeDatos() {
		data.CSV.buildGameCollectionFromCSVFile("vgsales.csv");
	}
}

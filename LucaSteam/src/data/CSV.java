package data;

import model.Juego;
import model.Generos;
import model.Plataformas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */

public class CSV {
	public static void buildGameCollectionFromCSVFile() {
		try {
			FileReader fr = new FileReader(new File("vgsales.csv"));
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine(); // La primera linea son las cabeceras
			String line = br.readLine();
			while( line != null) {
				String[] cosas = line.split(",");
				
				int rank = Integer.parseInt(cosas[0]);
				String nombre = cosas[1];
				Plataformas plataforma = null;
				
				int annosalida = -1;
				try{
					annosalida = Integer.parseInt(cosas[3]);
				}catch(NumberFormatException ex) {
					annosalida = -1;
				}
				
				Generos genero = null;
				String publisher = cosas[5];
				
				Juego juego = new Juego(rank, nombre, plataforma, annosalida, genero, publisher);
				//System.out.println(juego);
				
				control.ColeccionJuegos.nuevojuego(juego);
				
				line=br.readLine();
			}
			
			
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no encontrado");
			ex.printStackTrace();
		} catch (IOException ex){
			ex.printStackTrace();
		}
		
	}
}

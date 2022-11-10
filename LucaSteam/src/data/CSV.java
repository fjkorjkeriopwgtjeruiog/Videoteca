package data;

import model.Juego;
import model.Generos;
import model.Plataformas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.2
 * 09-11-2022
 */

public class CSV {
	public ArrayList<Juego> buildGameCollectionFromCSVFile(String filepath) {
		ArrayList<Juego> coleccionObtenida = new ArrayList<Juego>();
		
		try {
			FileReader filereader = new FileReader(new File(filepath));
			BufferedReader bufferedreader = new BufferedReader(filereader);
			bufferedreader.readLine(); // La primera linea son las cabeceras
			String line = bufferedreader.readLine();
			while( line != null) {
				String[] filaDelArchivoCSV = line.split(",");
				int rank = Integer.parseInt(filaDelArchivoCSV[0]);
				String nombre = filaDelArchivoCSV[1];
				
				Plataformas plataforma = Plataformas.desconocida;
				if(filaDelArchivoCSV[2].equals("Wii")) {
					plataforma=Plataformas.wii;
				} else if(filaDelArchivoCSV[2].equals("NES")) {
					plataforma=Plataformas.nes;
				}else if(filaDelArchivoCSV[2].equals("GB")) {
					plataforma=Plataformas.gb;
				}else if(filaDelArchivoCSV[2].equals("DS")) {
					plataforma=Plataformas.nds;
				}else if(filaDelArchivoCSV[2].equals("GBA")) {
					plataforma=Plataformas.gba;
				}else if(filaDelArchivoCSV[2].equals("XB")) {
					plataforma=Plataformas.xbox;
				}else if(filaDelArchivoCSV[2].equals("X360")) {
					plataforma=Plataformas.xbox360;
				}else if(filaDelArchivoCSV[2].equals("XOne")) {
					plataforma=Plataformas.xboxone;
				}else if(filaDelArchivoCSV[2].equals("PS")) {
					plataforma=Plataformas.playstation;
				}else if(filaDelArchivoCSV[2].equals("PS2")) {
					plataforma=Plataformas.ps2;
				}else if(filaDelArchivoCSV[2].equals("PS3")) {
					plataforma=Plataformas.ps3;
				}else if(filaDelArchivoCSV[2].equals("PS4")) {
					plataforma=Plataformas.ps4;
				}else if(filaDelArchivoCSV[2].equals("2600")) {
					plataforma=Plataformas.atari2600;
				}else if(filaDelArchivoCSV[2].equals("PSP")) {
					plataforma=Plataformas.psp;
				}else if(filaDelArchivoCSV[2].equals("PC")) {
					plataforma=Plataformas.pc;
				}else if(filaDelArchivoCSV[2].equals("WiiU")) {
					plataforma=Plataformas.wiiu;
				}else if(filaDelArchivoCSV[2].equals("N64")) {
					plataforma=Plataformas.n64;
				}else if(filaDelArchivoCSV[2].equals("GC")) {
					plataforma=Plataformas.gamecube;
				}else if(filaDelArchivoCSV[2].equals("GEN")) {
					plataforma=Plataformas.genesis;
				}else if(filaDelArchivoCSV[2].equals("3DS")) {
					plataforma=Plataformas.n3ds;
				}else if(filaDelArchivoCSV[2].equals("NES")) {
					plataforma=Plataformas.nes;
				}else if(filaDelArchivoCSV[2].equals("PSV")) {
					plataforma=Plataformas.psvita;
				}else if(filaDelArchivoCSV[2].equals("SAT")) {
					plataforma=Plataformas.saturn;
				}else if(filaDelArchivoCSV[2].equals("DC")) {
					plataforma=Plataformas.dreamcast;
				}else if(filaDelArchivoCSV[2].equals("Birth 2")) {
					plataforma=Plataformas.psvita; //mirar entrada 11135 del csv
				}
				
				int annosalida = -1;
				try{
					annosalida = Integer.parseInt(filaDelArchivoCSV[3]);
				}catch(NumberFormatException ex) {
					annosalida = -1;
				}
				
				Generos genero = Generos.misc;
				if(filaDelArchivoCSV[4].equals("Action")) {
					genero=Generos.accion;
				} else if(filaDelArchivoCSV[4].equals("Sports")) {
					genero=Generos.deportes;
				}else if(filaDelArchivoCSV[4].equals("Platform")) {
					genero=Generos.plataformas;
				}else if(filaDelArchivoCSV[4].equals("Racing")) {
					genero=Generos.carrera;
				}else if(filaDelArchivoCSV[4].equals("Role-Playing")) {
					genero=Generos.rpg;
				}else if(filaDelArchivoCSV[4].equals("Puzzle")) {
					genero=Generos.puzzle;
				}else if(filaDelArchivoCSV[4].equals("Misc")) {
					genero=Generos.misc;
				}else if(filaDelArchivoCSV[4].equals("Shooter")) {
					genero=Generos.tiros;
				}else if(filaDelArchivoCSV[4].equals("Simulation")) {
					genero=Generos.simulacion;
				}else if(filaDelArchivoCSV[4].equals("Fighting")) {
					genero=Generos.lucha;
				}else if(filaDelArchivoCSV[4].equals("Strategy")) {
					genero=Generos.estrategia;
				}else if(filaDelArchivoCSV[4].equals("Adventure")) {
					genero=Generos.aventura;
				}
				
				
				String publisher = filaDelArchivoCSV[5];
				
				Juego juego = new Juego(rank, nombre, plataforma, annosalida, genero, publisher);
				coleccionObtenida.add(juego);
				
				//System.out.println(juego);
				
				line=bufferedreader.readLine();
			}
		} catch (FileNotFoundException ex) {
			utils.Logging.Log("Archivo no encontrado");
		} catch (IOException ex){
			utils.Logging.Log("Problema de fichero");
		}
		return coleccionObtenida;
	}
}
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * guardar / guarda los datos de un juego en un fichero
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
 */

/**
 * Juego(String ruta) / Crea un nuevo juego a partir de los datos de un fichero. Debes dar la ruta donde guardaste los datos
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
 */

public class Juego {

	private int rank;
	private String nombre;
	private Enum plataforma;
	private int annosalida;
	private Enum genero;
	private String publisher;
	private Juego() {
		super();
	}
	private Juego(int rank, String nombre, Enum plataforma, int annosalida,
			Enum genero, String publisher) {
		super();
		this.rank = rank;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.annosalida = annosalida;
		this.genero = genero;
		this.publisher = publisher;
	}
	
	private void crearJuego() {
		
    }
	
	public String toString() {
		return "Juego [rank=" + rank + ", nombre=" + nombre + ", plataforma="
				+ plataforma + ", annosalida=" + annosalida + ", genero="
				+ genero + ", publisher=" + publisher + "]";
	}
	private int getRank() {
		return rank;
	}
	private void setRank(int rank) {
		this.rank = rank;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private Enum getPlataforma() {
		return plataforma;
	}
	private void setPlataforma(Enum plataforma) {
		this.plataforma = plataforma;
	}
	private int getAnnosalida() {
		return annosalida;
	}
	private void setAnnosalida(int annosalida) {
		this.annosalida = annosalida;
	}
	private Enum getGenero() {
		return genero;
	}
	private void setGenero(Enum genero) {
		this.genero = genero;
	}
	private String getPublisher() {
		return publisher;
	}
	private void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Juego(String ruta){
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            rank=Integer.parseInt(br.readLine());
            nombre=br.readLine();
            plataforma=Plataformas.valueOf(br.readLine());
            annosalida=Integer.parseInt(br.readLine());
            genero=Generos.valueOf(br.readLine());
            publisher=br.readLine();
        }catch (IOException e){
            System.out.println("Error");
	}
    }

	public void guardar(String ruta){
		try{
		    FileWriter f=new FileWriter(ruta);
		    f.write(rank+"\n");
		    f.write(nombre+"\n");
		    f.write(plataforma.toString()+"\n");
		    f.write(annosalida+"\n");
		    f.write(genero.toString()+"\n");
		    f.write(publisher+"\n");
		    f.close();
		}catch (IOException e){
		    System.out.println("Error");
		}
	}
}

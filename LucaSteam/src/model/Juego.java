package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * guardar / guarda los datos de un juego en un fichero. Debes dar la ruta del fichero donde guardarás los datos.
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

/**
 * copiar(Juego j) / Crea una copia de otro juego, por ejemplo para crear la versión de otra consola.
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
 */


public class Juego {

	private int rank;
	private String nombre;
	private Plataformas plataforma;
	private int annosalida;
	private Generos genero;
	private String publisher;
	public Juego() {
		super();
	}
	public Juego(int rank, String nombre, Plataformas plataforma, int annosalida,
			Generos genero, String publisher) {
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Plataformas getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataformas plataforma) {
		this.plataforma = plataforma;
	}
	public int getAnnosalida() {
		return annosalida;
	}
	public void setAnnosalida(int annosalida) {
		this.annosalida = annosalida;
	}

	public Generos getGenero() {
		return genero;
	}
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Juego(String ruta){
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
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
		
	public Juego copiar(Juego j){
		return new Juego(j.rank,j.nombre,j.plataforma,j.annosalida,j.genero,j.publisher);
	}
}
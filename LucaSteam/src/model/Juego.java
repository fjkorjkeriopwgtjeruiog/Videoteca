package model;

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
	
	
	
}

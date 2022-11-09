package model;

public class Juego {

	private int rank;
	private String nombre;
	private Plataformas plataforma;
	private int annosalida;
	private Generos genero;
	private String publisher;
	private Juego() {
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
	
	
	
}

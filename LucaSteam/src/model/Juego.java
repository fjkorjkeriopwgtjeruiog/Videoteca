package model;

public class Juego {

	int rank;
	String nombre;
	Enum plataforma;
	int annosalida;
	Enum genero;
	String publisher;
	public Juego() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Juego(int rank, String nombre, Enum plataforma, int annosalida,
			Enum genero, String publisher) {
		super();
		this.rank = rank;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.annosalida = annosalida;
		this.genero = genero;
		this.publisher = publisher;
	}
	
	public void crearJuego() {
		
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
	public Enum getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Enum plataforma) {
		this.plataforma = plataforma;
	}
	public int getAnnosalida() {
		return annosalida;
	}
	public void setAnnosalida(int annosalida) {
		this.annosalida = annosalida;
	}
	public Enum getGenero() {
		return genero;
	}
	public void setGenero(Enum genero) {
		this.genero = genero;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}

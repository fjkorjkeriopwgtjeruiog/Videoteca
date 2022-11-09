package com.mycompany.videoteca;

public class Juego{
    int rank;
	String nombre;
	Plataforma plataforma;
	int annosalida;
	Genero genero;
	String publisher;

	public Juego(int rank, String nombre, Plataforma plataforma, int annosalida,
			Genero genero, String publisher){
		this.rank = rank;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.annosalida = annosalida;
		this.genero = genero;
		this.publisher = publisher;
	}
        
        
        @Override
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
	public void setPlataforma(Plataforma plataforma) {
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
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
package com.mycompany.videoteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Juego{
    int rank;
    String nombre;
    Plataforma plataforma;
    int annosalida;
    Genero genero;
    String publisher;

    public Juego(String ruta){
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            rank=Integer.parseInt(br.readLine());
            nombre=br.readLine();
            plataforma=Plataforma.valueOf(br.readLine());
            annosalida=Integer.parseInt(br.readLine());
            genero=Genero.valueOf(br.readLine());
            publisher=br.readLine();
        }catch (IOException e){
            System.out.println("Error");
	}
    }
    
    public Juego(int rank, String nombre, Plataforma plataforma, int annosalida,
                    Genero genero, String publisher){
            this.rank = rank;
            this.nombre = nombre;
            this.plataforma = plataforma;
            this.annosalida = annosalida;
            this.genero = genero;
            this.publisher = publisher;
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
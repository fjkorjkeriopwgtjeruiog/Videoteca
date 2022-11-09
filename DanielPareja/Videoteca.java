package com.mycompany.videoteca;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Videoteca{

    public static void main(String[] args){
        Plataforma tri=Plataforma.n64;
        Genero mario=Genero.plataformas;
        
        Juego m64=new Juego(1,"Super Mario 64",tri,1997,mario,"Nintendo");
        System.out.println(m64);
        
        m64.setRank(2);
        System.out.println(m64.getRank());
        
        String ruta="juego.txt";
        
        try{
        FileWriter f=new FileWriter(ruta);
        f.write(m64.getRank()+"\n");
        f.write(m64.getNombre());
        f.write(m64.getPlataforma().toString());
        f.write(m64.getAnnosalida());
        f.write(m64.getGenero().toString());
        f.write(m64.getPublisher());
        f.close();
        
        FileReader l=new FileReader(ruta);
        System.out.println();
        l.close();
        }catch (IOException e){
            System.out.println("Error");
	}
    }
}

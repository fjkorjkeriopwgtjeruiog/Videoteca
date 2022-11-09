package test;

import org.junit.jupiter.api.Test;

public class Junit {
	
	Plataforma tri=Plataforma.n64;
    Genero mario=Genero.plataformas;
    
    Juego m64=new Juego(1,"Super Mario 64",tri,1997,mario,"Nintendo");
    System.out.println(m64);
    
    m64.setRank(2);
    System.out.println(m64.getRank());
    
    String ruta="juego.txt";
    
    m64.setAnnosalida(1996);
    
    System.out.println("Guardado");
    m64.guardar(ruta);
    
    System.out.println("Lectura");
    Juego trio=new Juego(ruta);
    System.out.println(trio);

}

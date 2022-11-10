package services;

import model.Generos;
import model.Juego;
import model.Plataformas;

import java.util.HashMap;

/**
 * leerJuego / Lee de forma más organizada los datos de un juego.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * leerLista / Lee una lista de juegos.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * nintendo / Muestra los juegos creados por la publicadora Nintendo.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * sigloxx / Muestra los juegos creados en el siglo XX.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * publicadora / Muestra los juegos creados por una determinada publicadora.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * anno / Muestra los juegos creados en un determinado año.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * genero / Muestra los juegos de un determinado genero de jugabilidad.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * plataforma / Muestra los juegos creados para una determinada consola.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

public class Informe{
	public void leerJuego(Juego j){
		System.out.println("-------------------");
		System.out.println(j.getNombre()+".");
		System.out.println("Rango "+j.getRank()+".");
		System.out.println("Plataforma: "+j.getPlataforma()+".");
		System.out.println("Año de publicación: "+j.getAnnosalida()+".");
		System.out.println("Genero: "+j.getGenero()+".");
		System.out.println("Publicador: "+j.getPublisher()+".\n");
	}
	
	public void leerLista(HashMap<Integer,Juego> lista){
		if(lista.size()==0)
			System.out.println("Lista vacía");
		else
			for(Juego j: lista.values())
				leerJuego(j);
	}
	
	public void nintendo(HashMap<Integer,Juego> coleccion){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()=="nintendo"){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public void sigloxx(HashMap<Integer,Juego> coleccion){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()<2001){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public void publicadora(HashMap<Integer,Juego> coleccion,String pub){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()==pub){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public void anno(HashMap<Integer,Juego> coleccion,int ann){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()==ann){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public boolean plataforma(HashMap<Integer,Juego> coleccion,String p){
		HashMap<Integer,Juego> nin=new HashMap<>();
		Plataformas j;
    	try{
    		j=Plataformas.valueOf(p);
    	}
    	catch(Exception e){
    		leerLista(nin);
    		return false; // Fuerza la salida del programa si da error.
    	}
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPlataforma()==j){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    	return true;
    }
	
	public boolean genero(HashMap<Integer,Juego> coleccion,String g){
		HashMap<Integer,Juego> nin=new HashMap<>();
		Generos u;
    	try {
    		u=Generos.valueOf(g);
    	}
    	catch(Exception e) {
    		leerLista(nin);
    		return false;
    	}
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getGenero()==u){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    	return true;
    }
}

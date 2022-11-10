package data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.Generos;
import model.Juego;
import model.Plataformas;

/**
 * addLista / Coge una lista de juegos y los añade todos. Devuelve false o true según si se produjo un error o no.
 * @author  Daniel
 * @version 1.0
 * 10-11-2022
 */

/**
 * addListaDatos / Interactua con el ColeccionJuegos de la carpeta services.
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

public class ColeccionJuegos {

	private Map<Integer, Juego> coleccion;
	
	public ColeccionJuegos() {
		coleccion = new HashMap<>();
    }

    public Map<Integer, Juego> getStock() {
        return coleccion;
    }

	public Map<Integer, Juego> getColeccion() {
		return coleccion;
	}

	public void setColeccion(Map<Integer, Juego> coleccion) {
		this.coleccion = coleccion;
	}
    
    /*
    METODOS
    */

    public void ListarJuegos() {
        Integer clave;
        Iterator<Integer> juegos = coleccion.keySet().iterator();
        System.out.println("-- COLECCION DE JUEGOS --");
        while (juegos.hasNext()) {
            clave = juegos.next();
            System.out.println("[" + clave + "]: " + coleccion.get(clave));
        }
    }
    
    public boolean CrearJuego(int codigo, Juego j) throws exception.CodigoRepetidoException {
        if (coleccion.containsKey(codigo)) {
        	System.out.println("m1");
        	throw new exception.CodigoRepetidoException();        	
        } else {
        	coleccion.put(codigo, j);
            return true;
        }
    }    
    
    public boolean existeCodigo(int cod){
        return coleccion.containsKey(cod);
    }

    public void eliminarJuego(int cod) {
    	coleccion.remove(cod);
    }
    
    public ArrayList<Juego> nintendo(){
    	ArrayList<Juego> nin=new ArrayList<>();
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()=="nintendo")
    			nin.add(coleccion.get(a));
    	return nin;
    }
    
    public ArrayList<Juego> sigloxx(){
    	ArrayList<Juego> nin=new ArrayList<>();
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()<2001)
    			nin.add(coleccion.get(a));
    	return nin;
    }

    public boolean CantidadesJuego(int cod) throws Exception {
        if (coleccion.isEmpty()) {
        	//1 es Nivel severo. Es un error
        	throw new Exception("No hay stock.");
        } else if (coleccion.containsKey(cod)) {
            //Existe
            System.out.println(coleccion.get(cod).getNombre());
            return true;
        } else {
        	throw new Exception("El juego no esta presente");
            //return false;
        }

    }
    
    public boolean addLista(List<Juego> lista){
    	int l=coleccion.size()+1;
    	for(Juego j: lista) {
    		try{
				CrearJuego(l,j);
			}catch (Exception e){
				return false;
			}
    	}
    	return true;
    }

    public boolean addListaDatos(List<Juego> lista,services.ColeccionJuegos p){
    	for(Juego j: lista) {
    		try{
				p.CrearJuego(j);
			}catch (Exception e){
				return false;
			}
    	}
    	return true;
    }

    public ArrayList<Juego> publicadora(String pub){
    	ArrayList<Juego> nin=new ArrayList<>();
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()==pub)
    			nin.add(coleccion.get(a));
    	return nin;
    }
    
    public ArrayList<Juego> anno(int ann){
    	ArrayList<Juego> nin=new ArrayList<>();
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()==ann)
    			nin.add(coleccion.get(a));
    	return nin;
    }
    
    public ArrayList<Juego> plataforma(String p){
    	ArrayList<Juego> nin=new ArrayList<>();
    	Plataformas j;
    	try{
    		j=Plataformas.valueOf(p);
    	}
    	catch(Exception e){
    		return nin;
    	}
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPlataforma()==j)
    			nin.add(coleccion.get(a));
    	return nin;
    }
    
    public ArrayList<Juego> genero(String g){
    	ArrayList<Juego> nin=new ArrayList<>();
    	Generos u;
    	try {
    		u=Generos.valueOf(g);
    	}
    	catch(Exception e) {
    		return nin;
    	}
    	int l=coleccion.size();
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getGenero()==u)
    			nin.add(coleccion.get(a));
    	return nin;
    }
}
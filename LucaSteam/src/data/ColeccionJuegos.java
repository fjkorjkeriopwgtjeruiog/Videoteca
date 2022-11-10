package data;
import services.CSV;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.Juego;

/**
 * addLista / Coge una lista de juegos y los añade todos. Devuelve false o true según si se produjo un error o no.
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
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
    
    public boolean CrearJuego(int codigo, Juego j) throws Exception {
        if (coleccion.containsKey(codigo)) {
        	System.out.println("m1");
        	throw new Exception("No se puede guardar el juego. El codigo esta repetido.");        	
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

    // Pendiente entender mejor su función.
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
}

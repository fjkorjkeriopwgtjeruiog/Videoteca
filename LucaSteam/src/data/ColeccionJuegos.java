package data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.Juego;
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
    
    
}

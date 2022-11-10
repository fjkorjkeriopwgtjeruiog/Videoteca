package services;

import java.util.List;

import model.Juego;

/**
 * addLista / Coge una lista de juegos y los añade todos. Devuelve false o true según si se produjo un error o no.
 * @author  Daniel
 * @version 1.0
 * 09-11-2022
 */

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();
	
	public boolean CrearJuego(Juego j) throws Exception {
		//Habria que decidir un algoritmo de codigos (una funciona Hash)
        return coleccion.CrearJuego((int) (Math.random() * 100000), j);
    }

    public void ListarJuegos() {
    	coleccion.ListarJuegos();
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
}

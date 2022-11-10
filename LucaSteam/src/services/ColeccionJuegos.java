package services;

import java.util.List;
import model.Juego;

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();
	
	public boolean CrearJuego(Juego j) throws Exception {
		//Habria que decidir un algoritmo de codigos (una funciona Hash)
        return coleccion.CrearJuego((int) (Math.random() * 100000), j);
    }

    public void ListarJuegos() {
    	coleccion.ListarJuegos();
    }
    
    public static void listAllJuegos(List<Juego> listaJuegos) {
    	for(int i = 0 ; i<listaJuegos.size() ; ++i) {
    		System.out.println(listaJuegos.get(i));
    	}
    }

	public void addLista(List<Juego> cargaInicialdeDatos) {
		
	}
}

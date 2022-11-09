package services;

import model.Juego;

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();
	
	public static boolean CrearJuego(Juego j) {
        
		
		return false;
    }
	
	public boolean AddProducto(Juego j) throws Exception  {
        //Habria que decidir un algoritmo de c�digos (una funciona Hash)
        return coleccion.CrearJuego((int) (Math.random() * 100000), j);
    }
}

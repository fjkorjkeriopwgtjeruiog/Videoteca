package services;

import java.util.List;
import model.Juego;

/**
 * addLista / Coge una lista de juegos y los añade todos. Devuelve false o true
 * según si se produjo un error o no.
 * 
 * @author Daniel
 * @version 1.0 09-11-2022
 */

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();

	public boolean CrearJuego(Juego j) throws Exception {
		// Habria que decidir un algoritmo de codigos (una funciona Hash)
		return coleccion.CrearJuego((int) (Math.random() * 100000), j);
	}

	public void ListarJuegos() {
		coleccion.ListarJuegos();
	}

	public static void listAllJuegos(List<Juego> listaJuegos) {
		for (int i = 0; i < listaJuegos.size(); ++i) {
			System.out.println(listaJuegos.get(i));
		}
	}

	public boolean addLista(List<Juego> lista) {
		for (Juego j : lista) {
			try {
				CrearJuego(j);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}

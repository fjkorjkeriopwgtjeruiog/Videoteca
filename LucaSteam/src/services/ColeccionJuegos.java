package services;

import utilidades.Datos;
import excepciones.StockException;
import model.Juego;

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();

	public boolean AddJuego(Juego j) {
        return this.AddJuego(j);
    }
	
	public boolean eliminarJuego() {
        int codigo = Datos.recogeInt("Indica el código del juego a eliminar");

        if (stock.existeCodigo(codigo)) {
            stock.eliminarProducto(codigo);
            System.out.println("Juego eliminado");
            return true;
        } else {
        	throw new Exception("El juego no tiene ese producto");
            //return false;
        }
    }
}

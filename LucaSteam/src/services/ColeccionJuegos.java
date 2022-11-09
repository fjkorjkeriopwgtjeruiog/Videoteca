package services;

import model.Juego;

public class ColeccionJuegos {

	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();
	
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
=======
	public static boolean AddJuego(Juego j) {
        
		
		return false; //de momento, luego ya se cambia
    }
}

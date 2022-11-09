package control;
import utils.Entrada;
import model.Juego;

public class ColeccionJuegos {

	public static void menu () {
		boolean continuar = false; //posibilidad de salir del loop
		do {	
		boolean opcion1activa= false;
	    System.out.println("Esto es el mensaje incial no corresponde a este spring");
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			control.CSV.cargaInicialdeDatos();
			opcion1activa= true;
			
		}
		
		//otras opciones
			
		} while (continuar);
	}

	public static void nuevojuego(Juego juego) {
		services.ColeccionJuegos.AddJuego(juego);
	}


}

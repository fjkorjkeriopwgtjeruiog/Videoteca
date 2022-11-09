package unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import model.Juego;
import utils.Logging;

public class Junit {
	
	static {
		try {
			
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}
	
	@BeforeAll
	public static void beforeAll() {
		
	}
	
	@BeforeEach
	public void beforeEach() {
		
	}
	
	public static void afterAll() {
		
	}
	
	public void afterEach() {
		
	}
	
	@Disabled
	//Ni idea de que hace esto, pero estaba en el ejercicio que he fusilado
	public void executionIgnored() {
		Logging.Log("");
	}
	
	@Test
	public void testingCantidadDeJuegosEnCSV() {
		final int cantidadEsperada = 16598; //aunque el rank vaya de 1 a 16600, hay dos que faltan de por medio
		
		data.CSV csv = new data.CSV();
		HashMap<Integer,Juego> mapaJuegosCargadosDeCSV = csv.buildGameCollectionFromCSVFile("vgsales.csv");
		
		
		assertEquals(cantidadEsperada, mapaJuegosCargadosDeCSV.size());
	}
}

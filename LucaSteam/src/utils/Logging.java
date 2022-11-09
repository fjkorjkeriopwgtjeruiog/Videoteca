package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Logging / Utilidades par logear la informacion del programador
 * @author  Martin
 * @version 1.0
 * 09-11-2022
 */
public class Logging {
	public static void Log(String infoToLog) {
		try {
			FileWriter fw = new FileWriter(new File("Log.txt"));
			fw.write("[LOG] "+infoToLog + "\n");
			
		} catch(IOException ex) {
			
		}
		
		
	}
}

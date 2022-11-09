package utils;

import java.util.Scanner;

public class Entrada {
	
	public static int entradaInt() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		return opcion;
	}
	
	public static float entradaFloat() {
		float opcion;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextFloat();
		return opcion;
	}
	
	


}

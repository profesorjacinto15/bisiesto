package bisiesto;

import java.util.Scanner;

/**
 * Clase que calcula si un año es bisiesto
 * @author jacinto
 *
 */

public class bisiesto {
	
	/**
	 * Metodo que comprueba si un año es o no bisiesto
	 * @param ano a comprobar si es bisiesto
	 * @return si es o  no bisiesto
	 */

	public static boolean esBisiesto (int ano) {
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			return true;
		} else {
			return false;
		}
			
	}
	
	/**
	 * Metodo principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		int ano;
		 do {
		System.out.print("Introduce el año a comprobar");
		ano = tec.nextInt();
		 } while (ano <=0);
		 if (esBisiesto(ano)) {
			 System.out.println("El año -> "+ano+" es bisiesto");
		 } else {
			 System.out.println("El año -> "+ano+" NO es bisiesto");
		 }
		 tec.close();
	}

}

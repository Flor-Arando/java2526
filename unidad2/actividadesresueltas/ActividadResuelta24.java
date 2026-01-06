package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta24 {
	public static void main(String[] args) {
		float numero;
		// indicar si es un num casi cero (son del 0.1 hasta el -0.99...
		// los que no son ceros son del 1 en adelante, el 0 y el -1
		// en conclusion hay que verificar que el número esté entre -1 y 1 (exclusivo) y distinto de 0:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número (x,x) para indicar si es casi cero: ");
		numero = sc.nextFloat();
		sc.close();
		
		if(numero > -1 && numero < 1 && numero != 0) {
			System.out.println("Es casi cero");
		} else {
			System.out.println("No es casi cero");
		}
	}
}

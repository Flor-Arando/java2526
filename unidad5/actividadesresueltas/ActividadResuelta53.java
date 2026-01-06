package unidad5.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numeros[] = new double[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerDecimales(sc,"Introduzca el número: ");
		}
		
		System.out.println("-------------numeros introducidos:------------------------");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static double leerDecimales(Scanner sc, String mensaje) {
		System.out.println(mensaje);

		while (!sc.hasNextDouble()) {
			System.out.println("Error: debe introducir un número decimal. Intente de nuevo:");
			sc.next(); // descarta la entrada incorrecta
		}

		return sc.nextDouble(); // devuelve el entero 
	}
	
}

//diseñar un programa que solicite al usuario que introduzca por teclado
//5 num decimales. A continuacion, mostrar los numeros en el mismo orden que se han introducido.
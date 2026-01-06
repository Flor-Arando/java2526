package clases;

import java.util.Scanner;

public class MetodosReutilizables {
	public static void main(String[] args) {
		
	}
	
	
	// Como verificar enteros introducidos por el usuario:
	// numeros[i] = leerEntero(sc, "Ingrese el número: ");
	public static int leerEntero(Scanner sc, String mensaje) {
		System.out.println(mensaje);

		while (!sc.hasNextInt()) {
			System.out.println("Error: debe introducir un número entero. Intente de nuevo:");
			sc.next(); // descarta la entrada incorrecta
		}

		return sc.nextInt(); // devuelve el entero 
	}
}

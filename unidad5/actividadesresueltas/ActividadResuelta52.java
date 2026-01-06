package unidad5.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = leerEntero(sc, "¿Cuántos números desea introducir?");
		int[] numeros = new int[numero];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerEntero(sc, "Introduzca el número:");
		}

		System.out.println("Orden inverso al introducido:");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

		sc.close();
	}
	
	
	public static int leerEntero(Scanner sc, String mensaje) {
		System.out.println(mensaje);

		while (!sc.hasNextInt()) {
			System.out.println("Error: debe introducir un número entero. Intente de nuevo:");
			sc.next(); // descarta la entrada incorrecta
		}

		return sc.nextInt(); // devuelve el entero 
	}
}

//Escribir una app que solicite al usuario cuantos num desea introducir. 
//Luego introducir por teclado esa cant de núm y por último mostrar en 
//el orden inverso al introducido.
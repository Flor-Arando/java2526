package unidad3.introudccionbucles;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
//		Ejercicio 3: Solicitar Entrada hasta Cumplir una Condición
//		Desarrolle un programa que solicite al usuario un número hasta que se introduzca el valor "0" para finalizar. Utilice un bucle do-while.
//		Objetivo: Trabajar con un bucle de postcondición y manejar la entrada del usuario
		double numero;
		Scanner sc = new Scanner(System.in);
		
		do {			
			System.out.println("Ingrese un número, si desea salir escriba 0: ");
			numero = sc.nextDouble();
		} while (numero !=0);
		
		sc.close();
	}
}

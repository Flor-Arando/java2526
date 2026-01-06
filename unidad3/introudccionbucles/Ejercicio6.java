package unidad3.introudccionbucles;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
//		Ejercicio 6: Tabla de Multiplicar Personalizada
//		Desarrolle un programa que solicite al usuario un número y luego imprima la tabla de multiplicar de ese número del 1 al 10. Utilice un bucle for.
//		Objetivo: Utilizar un bucle for para generar una secuencia y consolidar la interacción con el usuario.
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		numero = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(numero + " * "+ i +" = "+ numero*i);
		}
		
		sc.close();
	}
}

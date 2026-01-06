package unidad3.introudccionbucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
//		Ejercicio 10: Juego de Adivinanza con Intentos Limitados
//		Desarrolle un programa donde el usuario debe adivinar un número entre 1 y 10. El usuario tiene 5 intentos. 
//		Si el usuario acierta antes de agotar los 5 intentos, el programa debe finalizar con un mensaje de felicitación.
//		Objetivo: Combinar bucles controlados por contador (for) con una salida anticipada (break) y lógica condicional para implementar un pequeño juego.
		

		int intentos=5;
		int num;
		Random random = new Random();
		Scanner sc= new Scanner(System.in);
		int rango = random.nextInt(1,10);
		
		for(int i=0; i<intentos; i++) {
			
			System.out.println("Escriba el número: ");		
			//System.out.println(rango);
			num = sc.nextInt();		
			if(rango == num) {
				System.out.println("felicitaciones");
				break;
			}
		}		
	}
}

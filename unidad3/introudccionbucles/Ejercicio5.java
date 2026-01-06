package unidad3.introudccionbucles;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
//		Ejercicio 5: Bucle con Control de Contador y Condición
//		Implemente un programa que imprima los primeros 20 números naturales, pero se detenga si el usuario ingresa la palabra "parar".
//		Objetivo: Combinar un bucle for con una salida anticipada (break).
		String parar = "parar";
		String respuesta;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=20; i++) {
			
			System.out.println("número: " + i);
			System.out.println("Si desea terminar escriba parar: ");
			respuesta = sc.next();
			if(parar.equals(respuesta)) {
				break;
			} 
			
		}
		
	}
}

package unidad3.introudccionbucles;

public class Ejercicio8 {
	public static void main(String[] args) {
//		Ejercicio 8: Patrón de Caracteres con Bucles Anidados
//		Desarrolle un programa que imprima un patrón triangular usando asteriscos (*). Por ejemplo:
//
//		*
//		**
//		***
//		****
//		*****
//		Utilice bucles anidados.
//		Objetivo: Introducir bucles anidados y trabajar en la generación de patrones.
		
		int pasos = 5;
		for(int i=0; i<pasos; i++) {
			for(int j=0; j<=i ;j++) {
				System.out.print("*");
			
			}
			System.out.println(" ");
		}
	}
}

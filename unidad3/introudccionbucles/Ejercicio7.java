package unidad3.introudccionbucles;

import java.util.Random;

public class Ejercicio7 {
	public static void main(String[] args) {
//		Ejercicio 7: Búsqueda de un Valor en una Secuencia
//		Implemente un programa que genere números aleatorios entre 1 y 100 y continúe generándolos hasta encontrar un número mayor a 90. Use un bucle while.
//		Objetivo: Practicar bucles con condición de parada y el uso de números aleatorios
		
		Random random = new Random();
		
		// Número aleatorio en un rango específico
		int rango = random.nextInt(1,100); // (int) (Math.random()*100) se puede hacer más corto;

        while(rango<90) {
        	rango = random.nextInt(1,100);
        	System.out.println("num " + rango);
     	
        }		
	}
}

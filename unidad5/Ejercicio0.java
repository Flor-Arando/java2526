package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio0 {
	public static void main(String[] args) {
		float []notas = {1,2,3,1,5};
		
		if (repetidos(notas)) {
			System.out.println("repet");
		}
		else {
			System.out.println("no repet");
		}
		
		//float [][]matrizNotas = {{1,34,1},{3,5,6,7}}; o como la siguiente forma tambien es valida
		float [][]matrizNotas = 
			{
					{1,7,34,1},
					{3,5,6,7}
			};
		String []nombres = {"Javi", "maria"};
		
		int indiceAlumno = 0;
		
		System.out.println("alumno/a: "+nombres[indiceAlumno]+" : "+Arrays.toString(matrizNotas[indiceAlumno]));
		// ---------------------------------buscar indice del alumno por su nombre----------------------------------
		
		String nombre = "javi";
		indiceAlumno= -1;
		for(int i=0; i<nombres.length; i++) {
			if(nombre.equals(nombres[i])) {
				
			}
		}
		
		
	}
	
	public static boolean repetidos(float notas[]) {
		boolean repetidos = false;
		
		for(int i=0; i<notas.length; i++) {
		
			
			for(int j=0; j<notas.length; j++) {
				if(notas[i]==notas[j] && i!=j) {
					repetidos=true;
					break;
				}
			}
			if(repetidos) break; // cuando sea true break.
		}
		return repetidos;
	}
}

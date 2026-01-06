package unidad5;

import java.util.Scanner;

public class Explicacion1 {
	public static void main(String[] args) { // funcion que recibe un vector llamado args que es de tipo String.
					
		float[] notas;
		notas = new float[12]; // length (longitud)- como su indice es 12 su longitud es -1

//		notas[0]=7.5F; // el alumno 0 tiene asignado un 7.5
//		notas[1]=5;
//		notas[2]=6.25F;

		// System.out.println(notas); // dara algo que no nos sirve

		for (int i = 0; i < notas.length; i++) { // meta dato llamado length y nos devolvera el total del array.
			System.out.println("intriduce nota: [" + i + "]");

			// System.out.println(notas[i]);
			// notas[i]=new Scanner(System.in).nextFloat();
			notas[i] = i + 1; // cargamos las notas con el valor de i.
			// notas[i] = i+ (float) (Math.random() * 100) + 1;
		}
		
		//crearNotaArray(notas);
		//BorrarNota(notas);	
		//float nota = leerNota(notas);
		//System.out.println(nota);		

		//mediaNotas(notas);
		float max = notaMaxima(notas);
		System.out.println(max);
		
		float min = notaMinima(notas);
		System.out.println(min);
		
		ordenarNotas(notas);
		ordenarNotasDesc(notas);
		mostrarNotas(notas);

	}

	public static void crearNotaArray(float[] notasFuncion) { // cuando utilizamos un argumento como un array 
		// crear - actualizar:
		System.out.println("que nota quieres crear/actualizar");
		int indice = new Scanner(System.in).nextInt();
		System.out.println(" que valor");
		int valor = new Scanner(System.in).nextInt();
		notasFuncion[indice] = valor;
	}
	
	public static void BorrarNota(float [] notas) {
		// delete
		System.out.println("que nota quieres eliminar");
		int indice = new Scanner(System.in).nextInt();
		notas[indice] = -1;
	}
	
	public static float leerNota(float [] notas) {
		// read 
		System.out.println("que nota quieres leer");
		int indice = new Scanner (System.in).nextInt();
		float leerNota=  notas[indice];
		return leerNota;
	}
	
	public static void mostrarNotas(float [] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]+",");
		}		
	}
	
	public static float notaMaxima(float [] notas) {
		float max = notas[0];

		for(int i=1; i<notas.length; i++) { // le podemos poner 1 para optimizar, porque el indice 0 ya esta cargado seria comparar dos veces
			
			if(max<notas[i]) {
				max = notas[i];
			}
			
		}
		
		return max;
	}
	
	// nos pueden pedir el indice del valor más alto
	
	public static float notaMinima(float [] notas) {
		float min = notas[0];

		for(int i=0; i<notas.length; i++) { // misma optimizacion con el i=1
			
			if(min>notas[i]) {
				min = notas[i];
			}		
		}
		
		return min;
	}
	
	public static void ordenarNotas(float [] notas) { // se puede ordenar una lista por si misma o devolver una nueva tamb.
		float aux;
		for(int i=0; i<notas.length; i++) {
			
			for(int j=0; j<notas.length-1; j++) {
				
				if(notas[j]>notas[j+1]) {
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1]=aux;
				}					
			}
		}	
	}
	
	public static void ordenarNotasDesc(float [] notas) { // se puede ordenar una lista por si misma o devolver una nueva tamb.
		float aux;
		for(int i=0; i<notas.length; i++) {
			
			for(int j=0; j<notas.length-1; j++) {
				
				if(notas[j]<notas[j+1]) {
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1]=aux;
				}					
			}
		}	
	}
	
	
	
	
	public static void mediaNotas(float [] notas) { // falta verificar que sea mayor igual a cero
		float acumulador=0;
		
		for(int i=0; i<notas.length; i++) {
			acumulador += notas[i];
		}
		
		float media = acumulador/notas.length;
		
		System.out.println(media);
	}
	
	
}

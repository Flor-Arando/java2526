package unidad5;

import java.util.Scanner;

public class EjercicioCampus1 {
	
	public static void main(String[] args) {
		// Ej 0 - Haz un programa que pida la nota de 5 alumnos, calcule y muestre la nota media por pantalla.
		/*Scanner sc = new Scanner(System.in);
		double nota, media;
		double acumulador = 0;
		double []notas;
		notas = new double[5];
		
		for(int i=0; i<notas.length;i++) {
			System.out.println("ingrese la nota: ");
			nota = sc.nextDouble();
			notas[i]=nota;
			acumulador +=notas[i];			
		}
		
		media = acumulador/notas.length;*/
		
		double tabla[] = {1,2};
		System.out.println(tabla);
		
		double tabla2[]= {5,12,3};
		tabla2 = tabla; // copio tabla nueva a original (al reves no )
		System.out.println(tabla2);
	
	}
	
	
	
	
	
}


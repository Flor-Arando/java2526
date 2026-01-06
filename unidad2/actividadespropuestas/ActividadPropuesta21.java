package unidad2.actividadespropuestas;

import java.util.Scanner;

public class ActividadPropuesta21 {
	
	public static void main(String[] args) {
		
		boolean igualdad, distincion, menor, menorIgual, mayor, mayorIgual;
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el primer número: ");
		a = sc.nextInt();
		System.out.print("Escriba el segundo número: ");
		b = sc.nextInt();
		sc.close();
		
		igualdad = a == b;
		distincion = a != b;
		menor = a<b;
		mayor = a>b;
		menorIgual = a <= b;
		mayorIgual = a >= b;
		
		
		System.out.println("Igualdad: " + igualdad + "\n" +
							"Distinción: " + distincion + "\n" +
							"Menor: " + menor + "\n" +
							"Mayor: " + mayor + "\n" +
							"Menor o igual: " + menorIgual + "\n" +
							"Mayor o igual: " + mayorIgual + "\n");
		
	}
}

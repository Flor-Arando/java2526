package unidad2.actividadespropuestas;

import java.util.Scanner;

public class ActividadPropuesta22 {
	public static void main (String[] args) {
		
		int numero;
		boolean esPositivo;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		numero = sc.nextInt();
		sc.close();
		
		esPositivo = numero > 0;
		
		System.out.println("Número positivo: " + esPositivo);
		
	}
}

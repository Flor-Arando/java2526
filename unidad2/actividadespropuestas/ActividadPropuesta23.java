package unidad2.actividadespropuestas;

import java.util.Scanner;

public class ActividadPropuesta23 {
	public static void main(String[] args) {
		
		int a,b;
		boolean iguales;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el valor a: ");
		a = sc.nextInt();
		System.out.print("Escriba el valor b: ");
		b = sc.nextInt();
		sc.close();
		
		iguales = a != b || a == 0 || b == 0 ? true:false;
		
		System.out.println("¿Los valores son distintos o con valor 0? " + iguales);
		
	}
}

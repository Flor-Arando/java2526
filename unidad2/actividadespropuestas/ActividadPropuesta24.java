package unidad2.actividadespropuestas;

import java.util.Scanner;

public class ActividadPropuesta24 {
	public static void main(String[] args) {
		int a, b;
		boolean multiplo;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el primer número: ");
		a = sc.nextInt();
		System.out.print("Escriba el segundo número: ");
		b = sc.nextInt();
		sc.close();
		
		multiplo = a % b == 0 ? true:false;
		
		System.out.println(a + " es multiplo de " + b + "? " + multiplo);
		
	}
}

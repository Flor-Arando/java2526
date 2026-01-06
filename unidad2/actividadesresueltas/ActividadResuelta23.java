package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta23 {
	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el 1er núm: ");
		n1 = sc.nextInt();
		System.out.println("Escriba el 2do núm: ");
		n2 = sc.nextInt();
		sc.close();
		
		
		if(n1>n2) {
			System.out.println(n1 + " es mayor que " + n2);
		} 
		else if (n1<n2) {
			System.out.println(n1 + " es menor que " + n2);
		}
		else {
			System.out.println("Escriba valores distintos, no iguales.");
		}
	}
}

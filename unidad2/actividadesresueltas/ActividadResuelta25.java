package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta25 {
	public static void main(String[] args) {
		// escriba dos numeros y ordenelos de manera decreciente
		double n1,n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer núm: ");
		n1 = sc.nextDouble();
		System.out.println("Escriba el segundo núm: ");
		n2 = sc.nextDouble();
		sc.close();

		
		String orden = n1 > n2 ? "mayor " + n1 + " - " + n2 + " menor" : "mayor " + n2 + " - menor " + n1;
		
		System.out.println(orden);
	}
}

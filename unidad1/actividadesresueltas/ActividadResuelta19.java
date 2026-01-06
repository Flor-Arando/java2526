package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta19 {
	
	public static void main(String[] args) {
		
		double numero;
		boolean esPar;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		numero = sc.nextDouble();
		
		esPar = numero % 2 == 0;
		
		System.out.println("Es par: " + esPar);
		sc.close();
		
	}

}

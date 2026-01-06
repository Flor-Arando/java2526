package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta112 {
	
	public static void main(String[] args) {
		
		double numero, valorAbs;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		numero = sc.nextDouble();
		
		valorAbs = Math.abs(numero);
		
		System.out.println("Valor absoluto: " + valorAbs);
		sc.close();
	}
}

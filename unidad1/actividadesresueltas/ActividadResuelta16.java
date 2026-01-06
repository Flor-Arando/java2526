package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta16 {
	public static void main(String[] args) {
		int nota1, nota2;
		double media;
		
		System.out.print("Nota 1: ");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextInt();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextInt();
		
		media =(nota1 + nota2)/2.0; // escribir con decimal para tener un resultado decimal

		System.out.println("Media aritmetica: " + media);
		sc.close();

	}

}

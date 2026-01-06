package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta21 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un núm: ");
		num = sc.nextInt();
		sc.close();
		
		if(num%2==0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}

}

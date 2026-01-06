package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta22 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Escriba el segundo número: ");
		num2 = sc.nextInt();
		sc.close();
		
		if(num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}
}

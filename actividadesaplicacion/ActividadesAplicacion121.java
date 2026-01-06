package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion121 {
	
	public static void main(String[] args) {
		double a,b;
		boolean iguales;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el primer número: ");
		a = sc.nextDouble();
		System.out.print("Escriba el segundo número: " );
		b = sc.nextDouble();
		
		iguales = a == b? true: false;
		
		System.out.println("¿Los números ingresados son iguales? " + iguales);
		sc.close();
		
	}
}

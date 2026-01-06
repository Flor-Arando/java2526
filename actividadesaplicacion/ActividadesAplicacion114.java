package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion114 {
	
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba la base del triangulo;");
		base = sc.nextDouble();
		
		System.out.print("Escriba la altura del triangulo;");
		altura = sc.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("El área del triángulo es: " + area);
		sc.close();

	}
}

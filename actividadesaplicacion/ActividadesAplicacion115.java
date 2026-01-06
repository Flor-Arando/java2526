package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion115 {

	public static void main(String[] args) {		
		
		double y,a,x,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el coeficiente A: ");
		a = sc.nextDouble();
		System.out.print("Escriba el coeficiente B: ");
		b = sc.nextDouble();
		System.out.print("Escriba el coeficiente C: ");
		c = sc.nextDouble();
		System.out.print("Escriba el coeficiente X: ");
		x = sc.nextDouble();
		
		y = (a*x + a*x) + (b*x) + c;
		
		System.out.println("Valor del polinomio: " + y);
		sc.close();
		
	}
}

package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion117 {
	
	public static void main(String[] args) {
		double mm, cm, m, longitud;
		
		System.out.print("Ingrese la distancia en milímetros: ");
		Scanner sc = new Scanner(System.in);
		mm = sc.nextDouble();
		System.out.print("Ingrese la distancia en centimetros: ");
		cm = sc.nextDouble();
		System.out.print("Ingrese la distancia en metros: ");
		m = sc.nextDouble();
		
		longitud = (mm*1/10) + cm + (m*100);
		
		System.out.println("Longitud: " + longitud + " cm.");
		sc.close();
	}
}

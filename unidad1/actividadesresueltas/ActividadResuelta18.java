package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta18 {
	
	public static void main(String[] args){
		int edad;
		boolean mayor;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su edad: ");
		edad = sc.nextInt();
		mayor = edad >= 18;
		
		System.out.println("Mayoría de edad: " + mayor);
		sc.close();
	}

}

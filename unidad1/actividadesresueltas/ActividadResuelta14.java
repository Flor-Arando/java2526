package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta14 {
	public static void main(String[] args) {
		
		System.out.print("Ingrese el año actual: ");
		Scanner sc = new Scanner(System.in);
		int aActual = sc.nextInt();
		
		System.out.print("Ingrese su año de nacimiento: ");
		int aNacimiento = sc.nextInt();
		
		int edad = aActual - aNacimiento;
		
		System.out.println("Su edad es: " + edad + " años.");
	    
		sc.close();
	   }
}

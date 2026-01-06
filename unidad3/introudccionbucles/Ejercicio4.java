package unidad3.introudccionbucles;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
//		Ejercicio 4: Suma de Valores Ingresados por el Usuario
//		Cree un programa que sume los números ingresados por el usuario hasta que se introduzca un número negativo. Utilice un bucle while.
//		Objetivo: Reforzar el uso de bucles con condiciones de parada basadas en entradas del usuario.
		double numero;
		double sumaTotal = 0;
		boolean empezar = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(empezar) {
			
			System.out.print("Escriba un número, para terminar ingrese un número negativo: ");
			numero = sc.nextDouble();
			
			if(numero<0) {
				empezar = false;
			} 
			else {
				sumaTotal += numero;				
			}

		}
		System.out.println("suma total: "+ sumaTotal);
		sc.close();
	}
}

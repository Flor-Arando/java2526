package unidad2.actividadesaplicacion;

import java.util.Scanner;

public class ActividadAplicacion213 {
	public static void main(String[] args) {
		double comidaDiaria, kilosPorAnimal;
		int numAnimales;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de comida comprada para todos los animales en kg: ");
		comidaDiaria = sc.nextDouble();
		System.out.print("Cantidad de animales a alimentar: ");
		numAnimales = sc.nextInt();
		System.out.print("Media que comen los animales: ");
		kilosPorAnimal = sc.nextDouble();
		sc.close();
		
		
		if (comidaDiaria-(numAnimales*kilosPorAnimal) > 0) {
			System.out.println("Hay alimento sufuciente");
		}
		else {
			double alimento = comidaDiaria/(numAnimales*kilosPorAnimal);
			System.out.println("Cada animal necesita comer: " + alimento + " kg");
		}
	}
}

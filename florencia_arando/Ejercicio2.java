package florencia_arando;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio por kg de cacao");
		double precioKgCacao = sc.nextDouble();
		
		System.out.println("Precio por kg de azucar");
		double precioKgAzucar = sc.nextDouble();
		
		System.out.println("Precio por kg de leche en polvo");
		double precioKgleche = sc.nextDouble();
		
		System.out.println("Coste de envoltorio por unidad de tableta: ");
		double costeEnvoltorioUnidad = sc.nextDouble();
		
		System.out.println("Cantidad en gramos de cacao: ");
		double grsCacao = sc.nextDouble();
		
		System.out.println("Cantidad en gramos de azucar: ");
		double grsAzucar = sc.nextDouble();
		
		System.out.println("Cantidad en gramos de leche en polvo: ");
		double grsLeche = sc.nextDouble();
		
		System.out.println("Número de unidades por caja: ");
		int unidadesPorCaja = sc.nextInt();
		
		// caculo de coste unitario de una tableta: ingredientes + envoltorio 
				
		double precioPorGrsCacao = (grsCacao/1000)*precioKgCacao;
		double precioPorGrsAzucar = (grsAzucar/1000)*precioKgAzucar;
		double precioPorGrsLeche = (grsLeche/1000)*precioKgleche;
		
		double precioTotalPorTableta = precioPorGrsCacao+precioPorGrsAzucar+precioPorGrsLeche+costeEnvoltorioUnidad;
		
		System.out.printf("Coste unitario de una tableta: %.2f%n", precioTotalPorTableta);
		
		// caculo  coste total de una caja
		double precioTotalPorCaja = precioTotalPorTableta*unidadesPorCaja;
		System.out.printf("Coste unitario de una tableta: %.2f%n", precioTotalPorCaja);
		
		sc.close();
	}
}

// crear programa que calcule el coste por tableta y el coste por caja de tabletas de chocolate
// me pide coste por unidad y coste por caja
// conversion de g a kg




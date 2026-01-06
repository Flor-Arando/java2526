package florencia_arando;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		float precioPorGallina;
		int vidaGallina;
		float precioMedioPienso;
		float numHuevosDia;
		float precioPorHuevo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio por gallina: ");
		precioPorGallina = sc.nextFloat();
		
		System.out.println("Vida media de la gallina: ");
		vidaGallina = sc.nextInt();
		
		System.out.println("Precio medio del pienso que come por día: ");
		precioMedioPienso = sc.nextFloat();
		
		System.out.println("Número de huevos medio que pone la gallina al día: ");
		numHuevosDia = sc.nextFloat();
		
		precioPorHuevo = calcularPrecio(precioPorGallina, vidaGallina ,precioMedioPienso, numHuevosDia);
		
		System.out.printf("Precio por huevo: %.2f%n", precioPorHuevo);
		
		sc.close();
		
	}
	
	public static float calcularPrecio(float precioGallina, int vidasDiasGallina, float precioDiaPienso, float huevosDia) {
		
		float calculoInicial = precioGallina + precioDiaPienso * vidasDiasGallina;
		float costoFinal = huevosDia/calculoInicial;
		
		return costoFinal;
		
	}
}

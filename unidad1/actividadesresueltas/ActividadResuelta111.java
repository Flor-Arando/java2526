package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta111 {
	
	public static void main(String [] args) {
		
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERA = 1.95;
		
		double vManzanas1, vPeras1,vManzanas2, vPeras2, importeTotal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba los datos del primer semestre:");
		System.out.print("Cantidad de kg de Manzanas vendidas este semestre: ");
		vManzanas1 = sc.nextInt();
		
		System.out.print("Cantidad de kg de Peras vendidas este semestre: ");
		vPeras1 = sc.nextInt();
		
		System.out.println("-------Escriba los datos del segundo semestre-----");
		
		System.out.print("Cantidad de kg de Manzanas vendidas este semestre: ");
		vManzanas2 = sc.nextInt();
		
		System.out.print("Cantidad de kg de Peras vendidas este semestre: ");
		vPeras2 = sc.nextInt();
		
		importeTotal = (vManzanas1 + vManzanas2)*PRECIO_MANZANA + (vPeras1+vPeras2)*PRECIO_PERA;
		
		System.out.println("Importe total es de: " + importeTotal + "euros");
		sc.close();
	}

}

package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion119 {
	
	public static void main(String[] args) {
		
		final double PRECIO_INFANTIL=15.50, PRECIO_ADULTO=20.0, DESC=0.95;
		int eInfantil, eAdulto;
		double importeTotal, importeFinal;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de entradas para infantiles: ");
		eInfantil = sc.nextInt();
		System.out.print("Ingrese la cantidad de entradas para adultos: ");
		eAdulto = sc.nextInt();
		
		importeTotal = (eInfantil*PRECIO_INFANTIL) + (eAdulto*PRECIO_ADULTO);
		importeFinal = importeTotal >= 100? importeTotal*DESC:importeTotal; 
		
		System.out.println("Importe a pagar: " + String.format("%.2f", importeFinal)+" €");
		sc.close();
	}
}

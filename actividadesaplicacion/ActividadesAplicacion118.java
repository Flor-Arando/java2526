package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion118 {
	
	public static void main(String[] args) {
		
		int hormiga, arania, cochinilla, totalPatas;			
		final int P_HORM=6, P_ARAN=8, P_COCH=14;
			
		Scanner sc = new Scanner(System.in);	
		System.out.print("Ingrese la cantidad de hormigas capturadas: ");
		hormiga = sc.nextInt();
		System.out.print("Ingrese la cantidad de arañas capturadas: ");
		arania = sc.nextInt();
		System.out.print("Ingrese la cantidad de cochinillas capturadas: ");
		cochinilla = sc.nextInt();
		
		totalPatas = (hormiga*P_HORM) + (arania*P_ARAN) + (cochinilla*P_COCH);
		
		System.out.println("Total de patas: " + totalPatas);
		sc.close();		
		
	}
}

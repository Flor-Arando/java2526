package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion111 {
	public static void main(String[] args) {
		
		float iva, baseImponible, importeTotal, importeIva;
		
		System.out.print("Escriba la base imponible: ");
		Scanner sc = new Scanner(System.in);
		baseImponible = sc.nextFloat();
		
		System.out.print("Escriba el valor del IVA: ");
		iva = sc.nextByte();
		
		importeIva= baseImponible*iva/100;
		importeTotal = baseImponible + importeIva;
		System.out.println("Importe IVA: " + importeIva);
		System.out.println("Importe total: " + importeTotal); 

		sc.close();
	}  
}

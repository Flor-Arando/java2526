package unidad2.actividadespropuestas;

import java.util.Scanner;

public class ActividadPropuesta25 {
	public static void main (String[] args) {
		int aforoMaxLocal, eVendidas;
		float  ePrecio, recaudacion;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el aforo máximo del local: ");
		aforoMaxLocal = sc.nextInt();
		System.out.print("Cantidad de entradas vendidas: ");
		eVendidas = sc.nextInt();
		System.out.print("Precio de entrada: ");
		ePrecio = sc.nextFloat();
		sc.close();
		
		if(eVendidas < aforoMaxLocal*0.2) {
			System.out.print("No hay concierto");
		}
		else if (eVendidas < aforoMaxLocal*0.5) {
			
			recaudacion = eVendidas * (ePrecio*0.75F);
			System.out.print("Dinero recaudado: " + recaudacion);			
		}
		else {
			recaudacion = eVendidas * ePrecio;
			System.out.print("Dinero recaudado: " + recaudacion);
		}
		
	}
}

package unidad2.actividadesaplicacion;

import java.util.Scanner;

public class ActividadAplicacion219 {
	public static void main(String[] args) {
		double grados, radianes;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba los grados que desea pasar a radianes: ");
		grados = sc.nextDouble();
		sc.close();
		
		grados %=360;
		radianes = grados*Math.PI/180;
		
		System.out.println("Radianes: "+radianes);
	
	}
}

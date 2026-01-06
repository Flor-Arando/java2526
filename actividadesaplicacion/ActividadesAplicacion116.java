package actividadesaplicacion;

import java.util.Scanner;

public class ActividadesAplicacion116 {
	
	public static void main(String[] args) {
		
		int valorIngresado, segundos, horas, minutos;
		
		System.out.print("Ingrese la cantidad de segundos que desee: ");
		Scanner sc = new Scanner(System.in);
		valorIngresado = sc.nextInt();
		
		horas = valorIngresado/3600;
		minutos = horas%60;
		segundos = (valorIngresado%60); 
		
		System.out.println(horas + "hs " + minutos + "min " + segundos +  " seg");
		sc.close();
		
	}
}

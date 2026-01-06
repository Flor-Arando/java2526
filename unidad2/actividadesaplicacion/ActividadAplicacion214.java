package unidad2.actividadesaplicacion;

import java.util.Scanner;

public class ActividadAplicacion214 {
	public static void main(String[] args) {
		int numero;
		String y = "y", decena;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Esrciba un número entre 1 y 99: ");
		numero = sc.nextInt();
		sc.close();
		
		switch(numero) {
			case 1->
				System.out.println("uno");
			case 2 ->
				System.out.println("dos");
			case 3 ->
				System.out.println("tres");
			case 4 ->
				System.out.println("cuatro");
			case 5 ->
				System.out.println("cinco");
			case 6->
				System.out.println("seis");
			case 7 ->
				System.out.println("siete");
			case 8 ->
				System.out.println("ocho");
			case 9 ->
				System.out.println("nueve");
			case 10 ->
				System.out.println("diez");
			case 11->
				System.out.println("once");
			case 12 ->
				System.out.println("doce");
			case 13 ->
				System.out.println("trece");
			case 14 ->
				System.out.println("catorce");
			case 15 ->
				System.out.println("quince");
			case 16->
				System.out.println("dieciseis");
			case 17 ->
				System.out.println("diecisiete");
			case 18 ->
				System.out.println("dieciocho");
			case 19 ->
				System.out.println("diecinueve");
			case 20 ->
				System.out.println("veinte");
			case 30 ->
				decena = "treinta";

			case 40->
				System.out.println("cuarenta");
			case 50->
				System.out.println("cincuenta");
			case 60 ->
				System.out.println("sesenta");
			case 70->
				System.out.println("setenta");
			case 80->
				System.out.println("ochenta");
			case 90->
				System.out.println("noventa");			
			default ->
				System.out.println("error");
			
			
		}
		
		
		
		
		
	}
}

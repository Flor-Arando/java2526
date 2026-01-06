package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta113 {
	public static void main(String[] args) {
		
		int nota1, nota2, nota3, mediaBoletin;
		double mediaExpediente;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la nota 1: ");
		nota1 = sc.nextInt();
		System.out.print("Ingrese la nota 2: ");
		nota2 = sc.nextInt();
		System.out.print("Ingrese la nota 3: ");
		nota3 = sc.nextInt();
		
		mediaExpediente = (nota1 + nota2 + nota3)/3;
		mediaBoletin = (int)mediaExpediente;
		
		System.out.println("Nota media de expediente: " + mediaExpediente + "\n"
				+ "Nota media de boletin: " + mediaBoletin);
		sc.close();
	}
}

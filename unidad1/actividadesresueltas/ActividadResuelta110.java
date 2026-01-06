package unidad1.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta110 {
	
	public static void main(String[] args) {
		
		boolean irBiblioteca, llueve, tareaTerminada, puedeSalir;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba true si necesita ir a la biblioteca o false sino lo necesita: ");
		irBiblioteca = sc.nextBoolean();
		
		System.out.print("Escriba true si está lloviendo o false sino lo está: ");
		llueve = sc.nextBoolean();
		
		System.out.print("Escriba true si termino su tarea o false sino la terminó: ");
		tareaTerminada = sc.nextBoolean();
		
		puedeSalir = irBiblioteca || tareaTerminada && !llueve;
		
		System.out.println("Puede salir: " + puedeSalir);
		sc.close();
	}

}

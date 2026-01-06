package unidad4.ejerciciosampliacion;

import java.util.Scanner;

public class NumeroMagico {
	public static void main(String[] args) {
				
		
		final int CANTIDAD = 5;
		
		boolean empezar = true;

		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(empezar) {
			int numeroMagico = -1;
			int indiceMagico = (int) (Math.random() * (CANTIDAD - 1 + 1) + 1);
			
			// mostrar numeros
			for(int i=1; i<=CANTIDAD; i++) {
				int n = (int) (Math.random() * (10 - 1 + 1) + 1);
				System.out.println(n);
				
				if( i==indiceMagico ) {
					numeroMagico = n;
				}
			} // fin para
			
			System.out.println("¿Cuál crees que es el número mágico?");
			int intento = sc.nextInt();
			
			if(intento == numeroMagico) {
				System.out.println("¡Acertaste!");
			}
			else {
				
				System.out.println("Fallaste, era " + numeroMagico);
			}
						
				
			System.out.println("¿Quieres jugar otra vez? (S/N)");
			respuesta = sc.next();
			
			if(respuesta.equalsIgnoreCase("n")) {
				empezar = false;
			}
								
		}
		sc.close();
		
	}	
}

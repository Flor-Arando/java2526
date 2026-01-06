package unidad4.ejerciciosampliacion;

import java.util.Scanner;

public class Penaltis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turnos = 5;
		int puntajeJugador = 0;
		int puntajeCPU = 0;
		int j1, j2, CPU1,CPU2;
		
		while (turnos > 0) {
			
			System.out.println("\nTurno jugador");
			j1 = lanzarPenalti(sc);
			CPU1 = (int) (Math.random() * 3) + 1;
			
			if(j1!=CPU1) {
				puntajeJugador++;
				 System.out.println("+1 punto para el jugador");
			}
			mostrarMarcador(j1,CPU1);
			
			System.out.println("\nTurno cpu");
			
			
			CPU2 = (int) (Math.random() * 3) + 1;	
			j2 = lanzarPenalti(sc);
			
			if(j2!=CPU2) {
				puntajeCPU++;
				 System.out.println("+1 punto para la CPU");
			}
			mostrarMarcador(j2,CPU2);
			
			turnos--;
			
			System.out.println("--------------------------------------------------");
			
		}
		
		decidirGanador(puntajeJugador, puntajeCPU);
		sc.close();

	}

	public static int lanzarPenalti(Scanner sc) {
		int direccion;
		do {
			System.out.print("Elige dirección (1-izquierda, 2-centro, 3-derecha): ");
			direccion = sc.nextInt();
		} while (direccion < 1 || direccion > 3);

		return direccion;
	}

	public static void mostrarMarcador(int j1, int j2) {
		if (j1 == j2) {
			System.out.println("parada");
		} else {
			System.out.println("gooool");
		}	
	}

	public static void decidirGanador(int puntosJ1, int puntosJ2) {
		System.out.println("\nMarcador final: Jugador " + puntosJ1 + " - CPU " + puntosJ2);
		
		 if (puntosJ1 > puntosJ2) {
	            System.out.println("¡Gana el jugador!");
	            
	        } else if (puntosJ2 > puntosJ1) {
	        	
	            System.out.println("Gana la CPU.");
	        } else {
	        	
	            System.out.println("¡Empate!");
	        }
	}
}
/*
 * Conceptos: condicionales múltiples, puntuaciones, estructuras de control.
 * Descripción: jugador elige dirección (1-izquierda, 2-centro, 3-derecha); la
 * CPU también. Si coinciden → parada; si no → gol. Gana el que marque más en 5
 * turnos.
 * 
 * Función lanzarPenalti()
 * 
 * Función mostrarMarcador()
 * 
 * Función decidirGanador()
 */
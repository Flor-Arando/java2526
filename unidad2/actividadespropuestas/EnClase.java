package unidad2.actividadespropuestas;

import java.util.Scanner;

public class EnClase {
	public static void main(String[] args) {
		int jug1, jug2;
		int partidas = 4;
		int contador = 0;
		int puntajeJug1 = 0;
		int puntajeJug2 = 0;
		String ganador;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Jugador 1 - Escriba el valor que desea elegir piedra (1), papel(2) y tijera(3): ");
			jug1 = sc.nextInt();
			System.out.print("Jugador 2 - Escriba el valor que desea elegir piedra (1), papel(2) y tijera(3): ");
			jug2 = sc.nextInt();
			sc.close();
			if((jug1 == jug2) || (jug1 == 1 && jug2==3) || (jug1==2 && jug2==1) || (jug1==3 && jug2==2)) {
				puntajeJug1 +=1;
				System.out.println("Gana jugador 1");
			} else {
				puntajeJug2 +=1;
				System.out.println("Gana jugador 2");
			}
			
						
			contador ++;
			
		} while (partidas > contador);
		
		ganador = puntajeJug1 >= puntajeJug2 ? "Jugador 1" : "Jugador 2";
		
		System.out.println("Puntaje jugador 1: " + puntajeJug1);
		System.out.println("Puntaje jugador 2: " + puntajeJug2);
		System.out.println("Ganador: " + ganador);

		// throw interruptedException para el sleep
		
		
		
		
		/*
		 * tiene que pasar que:
			-gane piedra contra tijera (1-3)
			-gane papel contra piedra (2-1)
			-gane tijera contra papel (3-2)

		 */
		
		
		// usar 2 contadores en el do while para cuando  gana un jugador y cuando gana el otro.
		
		// 1) contador de victorias 2) q me informe del jugador ganador 3)  que el programa identifique si ya hay un ganador
		// atendiendo el nro de rondas seleccionado. 
		
	}
}

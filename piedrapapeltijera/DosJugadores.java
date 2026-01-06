package piedrapapeltijera;

import java.util.Scanner;

public class DosJugadores {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("¿Al mejor de cuántas rondas quieres jugar? ");
		int rondasGanar = sc.nextInt();
		sc.nextLine();

		int puntosJ1 = 0;
		int puntosJ2 = 0;
		int ronda = 1;

		while (puntosJ1 < rondasGanar * 0.5 && puntosJ2 < rondasGanar * 0.5) {
			System.out.println("\n--- Ronda " + ronda + " ---");

			System.out.print("Jugador 1, elige (piedra, papel, tijera): ");
			String j1 = sc.nextLine();

			System.out.print("Jugador 2, elige (piedra, papel, tijera): ");
			String j2 = sc.nextLine();

			if (j1.equals(j2)) {
				System.out.println("Empate!");
			} else if ((j1.equals("piedra") && j2.equals("tijera")) || (j1.equals("papel") && j2.equals("piedra"))
					|| (j1.equals("tijera") && j2.equals("papel"))) {
				System.out.println("Gana Jugador 1");
				puntosJ1++;
			} else {
				System.out.println("Gana Jugador 2");
				puntosJ2++;
			}

			System.out.println("Marcador -> J1: " + puntosJ1 + " - J2: " + puntosJ2);
			ronda++;
		}

		System.out.println("\n=== FIN DE LA PARTIDA ===");
		System.out.println("Rondas ganadas por Jugador 1: " + puntosJ1);
		System.out.println("Rondas ganadas por Jugador 2: " + puntosJ2);

		if (puntosJ1 > puntosJ2) {
			System.out.println("¡El ganador es Jugador 1!");
		} else {
			System.out.println("¡El ganador es Jugador 2!");
		}

		sc.close();
	}

}

package piedrapapeltijera;

import java.util.Scanner;

public class juegoConMaquina {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String jugarOtraVez = "si";

		while (jugarOtraVez.equals("si")) {
			
			System.out.print("¿Al mejor de cuántas rondas? ");
			int rondasGanar = sc.nextInt();
			sc.nextLine();
	
			System.out.print("¿Quieres jugar tú o ver dos máquinas? (yo/maquinas): ");
			String modo = sc.nextLine();
	
			int puntosJ1 = 0;
			int puntosJ2 = 0;
			int ronda = 1;
			// puntosObjetivo = (numRondas/2+1)
		while (puntosJ1 < rondasGanar * 0.5 && puntosJ2 < rondasGanar * 0.5) {
			
			System.out.println("\n--- Ronda " + ronda + " ---");

			String j1 = "";
	
			if (modo.equals("yo")) {
				
				System.out.print("Tu turno (piedra, papel, tijera): ");
				j1 = sc.nextLine();
			} else {
				
				Thread.sleep(500);
				int num = (int)(Math.random() * 3);
				
				if (num == 0) j1 = "piedra";
				
				else if (num == 1) j1 = "papel";
				
				else j1 = "tijera";
				
				System.out.println("Máquina 1: " + j1);
			}

		Thread.sleep(500);

		int num2 = (int)(Math.random() * 3);
		String j2 = "";
		if (num2 == 0) j2 = "piedra";
		else if (num2 == 1) j2 = "papel";
		else j2 = "tijera";
		System.out.println("Máquina 2: " + j2);

		if (j1.equals(j2)) {
			
			System.out.println("Empate!");
		} else if ((j1.equals("piedra") && j2.equals("tijera")) ||
			(j1.equals("papel") && j2.equals("piedra")) ||
			(j1.equals("tijera") && j2.equals("papel"))) {
			
			System.out.println("Gana el primero");
			puntosJ1++;
		} else {
			
			System.out.println("Gana el segundo");
			puntosJ2++;
		}

		System.out.println("Marcador: " + puntosJ1 + " - " + puntosJ2);
		ronda++;
		}

		System.out.println("\n=== FIN ===");
		System.out.println("Resultado final: " + puntosJ1 + " - " + puntosJ2);

		if (puntosJ1 > puntosJ2) {
		System.out.println("Ganador: el primero");
		} else {
		System.out.println("Ganador: el segundo");
		}

		System.out.print("\n¿Otra partida? (si/no): ");
		jugarOtraVez = sc.nextLine();
		}

		sc.close();
		}
}

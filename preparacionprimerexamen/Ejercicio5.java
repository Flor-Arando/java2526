package preparacionprimerexamen;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		jugar();

	}

	// Función para generar un número aleatorio entre 1 y 100
	public static int generarNumeroSecreto() {
		return (int) (Math.random() * 100) + 1;
	}

	// Función para verificar la proximidad del número
	public static String verificarProximidad(int numeroSecreto, int intento) {
		int diferencia = Math.abs(numeroSecreto - intento);

		if (diferencia == 0) {
			return "🎉 ¡Correcto!";
		} else if (diferencia > 20) {
			return "❄️ Muy bajo o muy alto (diferencia mayor a 20)";
		} else if (diferencia >= 10) {
			return "⚠️ Bajo o alto (diferencia entre 10 y 20)";
		} else {
			return "🔥 Cerca (diferencia menor a 10)";
		}
	}

	// Función principal del juego
	public static void jugar() {
		Scanner sc = new Scanner(System.in);
		int numeroSecreto = generarNumeroSecreto();
		int intentos = 0;
		final int MAX_INTENTOS = 10;
		boolean adivinado = false;

		System.out.println("🎮 ¡Bienvenido al juego de adivinanza!");
		System.out.println("Tienes 10 intentos para adivinar un número entre 1 y 100.\n");

		while (intentos < MAX_INTENTOS && !adivinado) {
			System.out.print("Intento " + (intentos + 1) + ": Ingrese su número → ");
			int numeroUsuario = sc.nextInt();

			// Validar rango
			while (numeroUsuario < 1 || numeroUsuario > 100) {
				System.out.print("❌ Número fuera de rango. Ingrese un número entre 1 y 100: ");
				numeroUsuario = sc.nextInt();
			}

			intentos++;
			String pista = verificarProximidad(numeroSecreto, numeroUsuario);
			System.out.println(pista);

			if (pista.contains("Correcto")) {
				adivinado = true;
			} else if (intentos < MAX_INTENTOS) {
				System.out.println("Te quedan " + (MAX_INTENTOS - intentos) + " intentos.\n");
			}
		}

		if (!adivinado) {
			System.out.println("\n😢 Se acabaron los intentos. El número secreto era: " + numeroSecreto);
		} else {
			System.out.println("🏆 ¡Lo lograste en " + intentos + " intentos!");
		}

		sc.close();
	}
}

/*
 * Diseñe un juego de adivinanza de números donde el usuario tiene que adivinar
 * un número secreto entre 1 y 100. El sistema debe: Generar un número secreto
 * aleatorio. Solicitar al usuario que adivine el número en un máximo de 10
 * intentos. Dar pistas al usuario: si su número es "muy bajo" (diferencia mayor
 * de 20), "bajo" (diferencia entre 10 y 20), "cerca" (diferencia menor de 10) o
 * "correcto". Finalizar el juego al adivinar correctamente o al agotar los
 * intentos, mostrando el número secreto si no ha sido adivinado. Este ejercicio
 * requiere la creación de funciones, como una función para verificar la
 * proximidad del número y otra para contar los intentos.
 */
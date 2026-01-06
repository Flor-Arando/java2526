package unidad4.ejerciciosampliacion;

import java.util.Scanner;

public class AdivinaNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contarIntentos = 0;
		int vidas = 3;
		int numSecreto = generarNumero();

		System.out.println(numSecreto);

		while (vidas > 0) {
			contarIntentos++;
			System.out.println("cantidad vidas: " + vidas);

			int numero = pedirIntento(sc);
			boolean valor = evaluarIntento(numero, numSecreto);

			if (valor) {
				System.out.println("¡Ganaste! Lo lograste en " + contarIntentos + " intentos.");
				break;
			}

			vidas--;

			if (vidas == 0) {
				System.out.println("Has agotado tus vidas. El número era " + numSecreto);
			}

		}

	}

	public static int generarNumero() {
		return (int) (Math.random() * (10 - 1 + 1) + 1);
	}

	public static int pedirIntento(Scanner sc) {
				
		System.out.print("Ingrese un número entre 1 y 10: ");
		int numero = sc.nextInt();

		return numero;
	}

	public static boolean evaluarIntento(int intento, int numeroSecreto) {
		boolean iguales = false;

		if (intento == numeroSecreto) {
			iguales = true;
		} else if (intento > numeroSecreto) {
			System.out.println("te pasaste!");
		} else {
			System.out.println("te falta!");
		}
		return iguales;
	}
}

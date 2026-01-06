package preparacionprimerexamen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, promedio;

		// Leer nota 1 con validación
		System.out.println("Ingrese la nota 1 (0 a 10): ");
		nota1 = sc.nextDouble();
		nota1 = validarNota(nota1, sc);

		// Leer nota 2 con validación
		System.out.println("Ingrese la nota 2 (0 a 10): ");
		nota2 = sc.nextDouble();
		nota2 = validarNota(nota2, sc);

		// Leer nota 3 con validación
		System.out.println("Ingrese la nota 3 (0 a 10): ");
		nota3 = sc.nextDouble();
		nota3 = validarNota(nota3, sc);

		// Calcular promedio
		promedio = (nota1 + nota2 + nota3) / 3;

		// Evaluar resultado
		if (promedio >= 8) {
			System.out.println("Participante aprobado y queda como finalista.");
		} else if (promedio >= 5) {
			System.out.println("Participante aprobado.");
		} else {
			System.out.println("Participante rechazado.");
		}

		System.out.printf("Promedio de nota: %.2f%n", promedio);

		sc.close();
	}

	// Función para validar que la nota esté entre 0 y 10
	public static double validarNota(double nota, Scanner sc) {
		while (nota < 0 || nota > 10) {
			System.out.println("Valor fuera de rango. Ingrese una nota entre 0 y 10:");
			nota = sc.nextDouble();
		}
		return nota;
	}
}

/*
 * Enunciado: Implemente un sistema de puntuación para un concurso de talentos.
 * Cada participante recibe una puntuación de tres jueces, y el sistema debe:
 * 
 * Leer las tres puntuaciones (valores entre 0 y 10).
 * 
 * Calcular la media de las puntuaciones.
 * 
 * Determinar si el participante ha sido "Aprobado" (media mayor o igual a 5) o
 * "Rechazado" (media menor a 5).
 * 
 * Además, si la media es superior a 8, el sistema debería marcar al
 * participante como "Finalista".
 */
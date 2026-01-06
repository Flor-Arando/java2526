package preparacionprimerexamen;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int cantidadAlumnos = 5;
		double nota;
		double totalNotas = 0;
		int cantAprobados = 0;
		double notaMasBaja = 0;
		double notaMasAlta = 0;
		double mediaNotas;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= cantidadAlumnos; i++) {
			System.out.println("Ingrese la nota (entre 0 y 10) del estudiante " + i + ":");
			nota = sc.nextDouble();
			
			// Validación: repetir mientras la nota esté fuera de rango
            while (nota < 0 || nota > 10) {
                System.out.println("Valor fuera de rango. Ingrese una nota válida (entre 0 y 10):");
                nota = sc.nextDouble();
            }
            
			totalNotas += nota;

			if (nota >= 5) {
				cantAprobados++;
			}

			if (i == 1) {
				// Inicializamos ambas con la primera nota
				notaMasAlta = nota;
				notaMasBaja = nota;
				
			} else {
				
				if (nota > notaMasAlta) {
					notaMasAlta = nota;
				}
				else {
					notaMasBaja = nota;
				}
			}

		}
		mediaNotas = totalNotas / cantidadAlumnos;
		
        System.out.printf("Suma total de notas: %.2f%n", totalNotas);
        System.out.println("Cantidad de aprobados: " + cantAprobados);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);
        System.out.printf("Media de todas las notas: %.2f%n", mediaNotas);
        
		sc.close();
	}

}
/*
 * Enunciado: Cree un programa para gestionar las notas de un curso de hasta 30
 * estudiantes. El sistema debe: Permitir la entrada de una nota para cada
 * estudiante (notas de 0 a 10). Calcular la media de todas las notas.
 * Determinar cuántos estudiantes han aprobado (nota mayor o igual a 5).
 * Encontrar la nota más alta y más baja en la clase.
 * 
 */
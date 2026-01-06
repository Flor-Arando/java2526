package unidad5;

public class Matrices {

	public static void main(String[] args) {

		float[][] alumnosNotas;
		alumnosNotas = new float[5][3]; // 4 alumnos(filas) y 3 notas (columnas)

//		rellenarMatriz(alumnosNotas);

		rellenarMatriz2(alumnosNotas);
		mostrarMatriz(alumnosNotas);
		// mostrarMediaAlumnos(alumnosNotas);
		mediaClase(alumnosNotas);

		mostrarColumna(alumnosNotas, 0); // Muestra la primera columna
		mostrarColumnas(alumnosNotas); // Muestra todas las columnas

		String[] nombres = new String[alumnosNotas.length];
		nombres[0] = "javi";
		nombres[1] = "pepe";
		nombres[2] = "mar";
		nombres[3] = "juan";
		nombres[4] = "pepa";
		// otra forma de crear un array con nombres
		// String [] nombres = {"javi", "pepe", "mar", "juan"};

		mostrarMediaAlumnos(nombres, alumnosNotas);


	}

	public static void mostrarMediaAlumnos(String[] nombres, float[][] alumnosNotas) {
		float notaMedia;
		for (int i = 0; i < alumnosNotas.length; i++) {
			notaMedia = mediaAlumno(alumnosNotas[i]);
			System.out.println(nombres[i] + " tiene nota media de: " + notaMedia);
		}
	}

	public static float mediaAlumno(float[] notas) {
		float acum = 0;
		for (int i = 0; i < notas.length; i++) {
			acum += notas[i];
		}
		return acum / notas.length;
	}

	private static void mediaClase(float[][] alumnosNotas) {
		float acumAlu = 0;
		float acumClase = 0;
		float mediaAlumno = 0;

		for (int filas = 0; filas < alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				acumAlu += alumnosNotas[filas][columnas];
			}
			mediaAlumno = acumAlu / alumnosNotas[filas].length;
			System.out.println("La nota media del alumno" + filas + " es: " + mediaAlumno);
			acumClase += mediaAlumno;
			acumAlu = 0;
		}
		System.out.println("La nota media de la clase es: " + (acumClase / alumnosNotas.length));
	}

	private static void mostrarMediaAlumnos(float[][] alumnosNotas) {
		for (int i = 0; i < alumnosNotas.length; i++) {
			float mediaAlu = mediaNotas(alumnosNotas[i]);
			System.out.println("La media del alumno" + i + "es: " + mediaAlu);
		}
	}

	private static void mostrarMatriz(float[][] alumnosNotas) {
		for (int filas = 0; filas < alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				System.out.print(alumnosNotas[filas][columnas] + ", ");
			}
			System.out.println();
		}
	}

	private static void rellenarMatriz2(float[][] alumnosNotas) {
		for (int filas = 0; filas < alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				alumnosNotas[filas][columnas] = (float) Math.random() * 10;
			}
		}
	}

	private static void rellenarMatriz(float[][] alumnosNotas) {
		for (int i = 0; i < alumnosNotas.length; i++) {
			rellenarVector(alumnosNotas[i]);
		}
	}

	public static void rellenarVector(float[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (float) Math.random() * 10;
		}
	}

	public static float mediaNotas(float[] notasFuncion) {

		float totalAcumulado = 0;
		float notasTomadas = 0;
		float media = 0;

		for (int i = 0; i < notasFuncion.length; i++) {
			if (notasFuncion[i] >= 0) {
				totalAcumulado += notasFuncion[i];
				notasTomadas++;
			}
		}

		if (notasTomadas == 0) {
			System.out.println("Ha habido un error en la toma de notas, no es posible realizar la media.");
		} else {
			media = totalAcumulado / notasTomadas;
		}

		return media;
	}

	// mostrar columna que se pasa el nro de col para que solo se mueva la fila

	public static void mostrarColumna(float[][] alumnosNotas, int columna) {

		System.out.println("Mostrando columna " + columna + ":");

		for (int fila = 0; fila < alumnosNotas.length; fila++) {
			System.out.println("Alumno " + fila + ": " + alumnosNotas[fila][columna]);
		}
	}

	public static void mostrarColumnas(float[][] alumnosNotas) {

		for (int col = 0; col < alumnosNotas[0].length; col++) {
			System.out.println("=== Columna " + col + " ===");
			mostrarColumna(alumnosNotas, col); // Reutilizamos la función anterior
			System.out.println();
		}
	}

}
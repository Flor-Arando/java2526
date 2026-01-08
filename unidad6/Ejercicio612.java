package unidad6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio612 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[] palabras = {
                "murcielago",
                "computadora",
                "elefante",
                "astronauta",
                "piramide"
        };

        String[] pistas = {
                "Soy un animal que vuela pero no es un pájaro.",
                "Máquina que usas para programar.",
                "El animal terrestre más grande.",
                "Persona que viaja al espacio.",
                "Construcción antigua con forma triangular."
        };

        // Elegir palabra aleatoria
        Random r = new Random();
        int index = r.nextInt(palabras.length);

        String original = palabras[index];
        String pista = pistas[index];

        char[] originalArray = original.toCharArray();
        char[] guiones = new char[original.length()];

        int intentos = 7;
        boolean completado = false;
        boolean pistaPedida = false;
        boolean letraPedida = false;

        // Inicializar guiones
        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '_';
        }

        System.out.println("Adivina la palabra:");
        imprimir(guiones);

        do {
            System.out.println("\n\nOpciones:");
            System.out.println("1. Introducir letra");
            System.out.println("2. Pedir pista (consume 1 intento)");
            System.out.println("3. Pedir letra acertada (consume 2 intentos)");
            System.out.print("Elige opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    intentos += intentar(originalArray, guiones);
                    break;

                case 2:
                    if (!pistaPedida) {
                        System.out.println("PISTA: " + pista);
                        intentos--;
                        pistaPedida = true;
                    } else {
                        System.out.println("Ya pediste la pista.");
                    }
                    break;

                case 3:
                    if (!letraPedida) {
                        if (intentos >= 2) {
                            revelarLetra(originalArray, guiones);
                            intentos -= 2;
                            letraPedida = true;
                        } else {
                            System.out.println("No tienes suficientes intentos.");
                        }
                    } else {
                        System.out.println("Ya pediste una letra.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("Te quedan " + intentos + " intentos.");
            imprimir(guiones);

            // Comprobar si está completado
            completado = true;
            for (char c : guiones) {
                if (c == '_') {
                    completado = false;
                    break;
                }
            }

        } while (intentos > 0 && !completado);

        if (completado) {
            System.out.println("\n¡Felicidades! Adivinaste la palabra.");
        } else {
            System.out.println("\nHas perdido. La palabra era: " + original);
        }

        sc.close();
    }


    public static int intentar(char[] original, char[] guiones) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        int cambio = 0;

        for (int i = 0; i < original.length; i++) {
            if (letra == original[i]) {
                guiones[i] = letra;
                cambio++;
            }
        }

        if (cambio == 0) {
            return -1; // falló
        }

        return 0; // acertó
    }


    public static void revelarLetra(char[] original, char[] guiones) {
        Random r = new Random();
        int pos;

        do {
            pos = r.nextInt(original.length);
        } while (guiones[pos] != '_');

        guiones[pos] = original[pos];
        System.out.println("Letra revelada: " + original[pos]);
    }

    public static void imprimir(char[] adivinar) {
        for (char c : adivinar) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

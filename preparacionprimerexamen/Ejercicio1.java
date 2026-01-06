package preparacionprimerexamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorIngresado;

        System.out.println("Por favor, ingrese la temperatura en grados Celsius:");

        // Mientras el valor ingresado no sea numérico, seguir pidiendo que ingrese el correcto
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada no válida. Intente nuevamente:");
            sc.next(); // descarta la entrada incorrecta
        }

        valorIngresado = sc.nextDouble();

        // Evaluar la temperatura
        if (valorIngresado > 30) {
            System.out.println("Temperatura alta: se aconseja activar el sistema de ventilación.");
        } else if (valorIngresado >= 15 && valorIngresado <= 25) {
            System.out.println("Temperatura óptima.");
        } else if (valorIngresado < 10) {
            System.out.println("Temperatura baja: se aconseja activar el calentador.");
        } else {
            System.out.println("No se requieren acciones en la temperatura ni recomendaciones.");
        }

        sc.close();
    }
}



/*
Enunciado: 
Se le pide que diseñe una aplicación para monitorizar y ajustar la temperatura en un invernadero automatizado. 
El sistema tiene tres tipos de alarmas de temperatura: 

Baja: cuando la temperatura cae por debajo de 10°C. 

Óptima: cuando la temperatura se encuentra entre 15°C y 25°C. 

Alta: cuando la temperatura supera los 30°C. 

El programa debe: 

Solicitar al usuario la temperatura actual en grados Celsius (entrada por consola). 

Indicar el tipo de alarma correspondiente. 

Aconsejar si es necesario activar el calentador (para temperatura baja) o el sistema de ventilación (para temperatura alta). 
*/

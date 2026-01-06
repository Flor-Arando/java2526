package preparacionprimerexamen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double acumulador = 0;
        double precioBase;
        double precioFinal;

        // Leer cantidad de productos
        System.out.print("Ingrese la cantidad de productos que desea calcular: ");
        cantidad = sc.nextInt();

        // Validar cantidad positiva
        while (cantidad <= 0) {
            System.out.print("Cantidad inválida. Ingrese un número mayor que 0: ");
            cantidad = sc.nextInt();
        }

        // Leer precios
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el precio base del producto " + i + ": ");
            precioBase = sc.nextDouble();

            // Validar precio positivo
            while (precioBase < 0) {
                System.out.print("Precio inválido. Ingrese un valor mayor o igual a 0: ");
                precioBase = sc.nextDouble();
            }

            acumulador += precioBase;
        }

        // Aplicar descuentos
        if (cantidad > 10) {
            precioFinal = acumulador * 0.90; // 10% de descuento
            System.out.printf("Precio total: %.2f%nPrecio final con 10%% de descuento: %.2f%n", acumulador, precioFinal);
        } else if (cantidad > 5) {
            precioFinal = acumulador * 0.95; // 5% de descuento
            System.out.printf("Precio total: %.2f%nPrecio final con 5%% de descuento: %.2f%n", acumulador, precioFinal);
        } else {
            precioFinal = acumulador;
            System.out.printf("Precio total sin descuento: %.2f%n", precioFinal);
        }

        sc.close();
    }
}



/*
Una fábrica desea calcular el costo de producción de un conjunto de productos. Cada producto tiene un precio base, y 
el sistema debe: 

Leer la cantidad de productos que se desea producir. 
Pedir el precio base de cada producto en una secuencia de entradas. 
Calcular el costo total de producción. 
Además, el sistema debe aplicar los siguientes descuentos: 
5% de descuento si la cantidad es superior a 50. 
10% de descuento si la cantidad es superior a 100. 
*/
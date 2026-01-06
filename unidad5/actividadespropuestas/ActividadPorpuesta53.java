package unidad5.actividadespropuestas;

import java.util.Scanner;

public class ActividadPorpuesta53 {
	 public static void main(String[] args) {
		int numero;
		int contCeros=0, contNegativos=0, contPositivos=0;
		double sumNegativos=0, sumPositivos=0;
		double numeroIngresado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número entero:");
        numero = sc.nextInt();
        double numeros[]= new double[numero];
        
        System.out.println("Introduzca cualquier número "+numero+" veces.");
        
        
        for (int i = 0; i < numeros.length; i++) {
			System.out.print("ingrese el número: ");
			numeroIngresado = sc.nextDouble();
			numeros[i] = numeroIngresado;
			
			if (numeroIngresado>0) {
				sumPositivos += numeroIngresado;
				contPositivos++;
				
			}
			else if(numeroIngresado<0) {
				sumNegativos += numeroIngresado;
				contNegativos++;
				
			}
			else {
	
				contCeros++;
				
			}
		}
        
        double mediaP = sumPositivos/contPositivos;
        double mediaN = sumNegativos/contNegativos;
        
        System.out.println("Media de números positivos: "+mediaP);
        System.out.println("Media de números negativos: "+mediaN);
        System.out.print("Cantidad de ceros introducidos: "+contCeros);
		sc.close();
		 
	}
}

//Introduce por teclado un número n, a continuacion solicita al usuario que teclee n números. Realiza la
//media de números positivos, la media de negativos y cuenta el numero de ceros introducidos. 

package florencia_arando;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		double valorIngresado;
		int opcionElegida;
		boolean empezar = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(empezar) {
			System.out.println("1.cambio Celsius a Fahrenheit \n2.cambio Celsius a Kelvin \n3.cambio Fahrenheit a Celsius"
					+ "\n4.cambio Kelvin a Celsius \n5.Salir"
					+"\nPor favor ingrese el número de la opción que desea elegir: ");
			opcionElegida = sc.nextInt();					
			
			System.out.println("Ingrese la cantidad de grados que desea convertir: ");	
			valorIngresado = sc.nextDouble();
					
			
			if(opcionElegida == 1) {
				double f = (valorIngresado*9/5)+32;
				System.out.printf("Resultado en ºF: %.2f%n",f); // celsius a fa
			}
			else if (opcionElegida == 2) {
				double k = valorIngresado + 273.15;
				System.out.printf("Resultado en ºK: %.2f%n",k); // celsius a kelvin
			}
			else if(opcionElegida == 3) {
				double c = (valorIngresado-32)*5/9;
				System.out.printf("Resultado en ºC: %.2f%n",c); // fa a cels
			}
			else if(opcionElegida == 4) {
				double c = valorIngresado-273.15;
				System.out.printf("Resultado en ºC: %.2f%n",c); // k a cels
			}
			else if(opcionElegida == 5) {
				empezar = false;			
			}
			
			else{
				System.out.println("Opcion incorrecta. Vuelva a ingresarlo");				
			}
		}
		sc.close();	
		
	}
	 
	
}

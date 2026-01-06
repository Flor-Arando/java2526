package unidad3.introudccionbucles;

public class Ejercicio9 {
	public static void main(String[] args) {
//		Ejercicio 9: Números Primos dentro de un Rango
//		Implemente un programa que imprima todos los números primos entre 1 y 50. Utilice bucles anidados para verificar si cada número es primo.
//		Objetivo: Practicar bucles anidados y condiciones complejas para resolver problemas más elaborados.
		
		for(int i=2; i<50; i++) {
			boolean primo = true;
			
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					primo = false;
					break;
				}		
			}
			
			if(primo) {
				System.out.print(i+" ");
			}
		}
						
	}
}



package clases;

public class HolaRecursivo {
	public static void main(String[] args) {
		holaRecursivo(-20);
		// holaRecursivo(-2); // en java se almacenan datos y otra zona de memoria de pilas(stuck) de llamadas a funciones,
						// cuando se acaba la memoria de pilas de llamadas a funciones aparecera el error de stackOverFlow.
						// porque rebalza esa pila de llamadas entonces genera el error. 
	}
	
	/*
	public static float media(int n1, int n2, int n3) {
		float resultado = (n1 + n2 + n3)/3;
		return resultado;
	}*/
	
	// clase 30/10
	// el syso hola es importante ver si va antes o despues del else, porque puede cambiar el resultado
	
	public static void holaRecursivo(int veces) {
		
		if(veces<=0) {
			System.out.println("no va"); // verificacion
		}
		else {
			if(veces==1) {
				System.out.println("hola");
			}
			else {
				holaRecursivo(veces-1);
				System.out.println("hola");
				
				}
			}
		}
}

	

package unidad5;

public class Ejercicio12 {
	public static void main(String[] args) {
		int []vector = {2,4,6,8};
		int []vector2 = {2,4,6,8};
		
		for(int i=0; i<vector.length; i++) {
			
			for(int j=0; j<vector2.length; j++) {
				if(vector[i] == vector2[j]) {
					System.out.println("el vector posicion: "+vector[i]+" es igual al vector 2 con posicion "+vector2[j]);
				}
			}
		}
	}
}
// Ej 12 - Crea dos vectores idénticos y comparalos. Inicializalos con varios valores iguales.
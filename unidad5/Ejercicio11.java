package unidad5;

import java.util.Arrays;

public class Ejercicio11 {
	public static void main(String[] args) {
		int []vector = {2,4,6,8};
		int []vector2 = Arrays.copyOf(vector, 5);
		
		
		for(int i=0; i<vector2.length; i++) {
			System.out.println(vector2[i]);
		}
	}
}

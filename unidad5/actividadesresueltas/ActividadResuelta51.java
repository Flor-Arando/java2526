package unidad5.actividadesresueltas;

public class ActividadResuelta51 {
	public static void main(String[] args) {
		int miTabla[] = new int[10];
		int sumador = 0;
		
		System.out.println("Vector con núm aleatorios:");
		for (int i = 0; i < miTabla.length; i++) {
			miTabla[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
			sumador += miTabla[i];
			System.out.println(miTabla[i]);
		}
		
		System.out.println("Suma total de números aleatorios: "+sumador);
		
	}
}

//Crea una tabla de long 10 que se inicializará con núm aleatorios comprendidos 
//entre 1 y 100. Mostrar la suma de todos los núm aleatorios que se guardan en la tabla
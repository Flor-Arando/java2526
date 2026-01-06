package unidad4.actividadesaplicacion;

public class ActividadAplicacion418 {
	public static void main(String[] args) {
		numerosRandom(5,1,10);

	}
	
	public static void numerosRandom(int cantidad, int min, int max) {
		for(int i=0; i<cantidad; i++) {
			int numeroAleatorio = (int)(Math.random()*(max-min+1)+min);
			System.out.println(numeroAleatorio);
		}
	}
	
}

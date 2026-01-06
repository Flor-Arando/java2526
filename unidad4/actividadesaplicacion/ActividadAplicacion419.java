package unidad4.actividadesaplicacion;

public class ActividadAplicacion419 {
	public static void main(String[] args) {
		numerosRandom(4);
	}
	
	public static void numerosRandom(int cantidad) {
		for(int i=0; i<cantidad; i++) {
			double numeroAleatorio = (Math.random()*(1-0+1)+0);
			System.out.println(numeroAleatorio);
		}
	}
}

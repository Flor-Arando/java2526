package unidad4.actividadesaplicacion;

public class ActividadAplicacion412 {
	public static void main(String[] args) {
		
		System.out.println("Distancia euclídea: " + distancia(5.1,5.2,6.4,6.6));
	}
	
	public static double distancia(double x1, double y1, double x2, double y2) {
		double distancia = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2)));
		return distancia;
	}
}

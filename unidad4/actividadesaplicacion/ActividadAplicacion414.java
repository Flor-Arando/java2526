package unidad4.actividadesaplicacion;

public class ActividadAplicacion414 {
	public static void main(String[] args) {
		
		System.out.println("total de segundos: " + totalSegundos(1,2,3));
	}
	
	public static int totalSegundos(int dias, int horas, int minutos) {
		int segPorDia = 86400;
		int segPorHora = 3600;
		int segPorMinuto = 60;
		
		int total = segPorDia * dias + segPorHora * horas + segPorMinuto * minutos;
		
		return total;
	}
}

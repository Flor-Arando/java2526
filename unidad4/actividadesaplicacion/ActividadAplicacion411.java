package unidad4.actividadesaplicacion;

public class ActividadAplicacion411 {
	public static void main(String[] args) {
		
		 calculoEsfera(3);
		 
	}
	
	public static void calculoEsfera(double radio) {
		double superficie = (4*Math.PI) * Math.pow(radio, 2);
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		
		System.out.println("superficie: " + superficie + "\n" + "volumen: "+ volumen);	
	}
}

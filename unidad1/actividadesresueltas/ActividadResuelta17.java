package unidad1.actividadesresueltas;
import java.util.*;

public class ActividadResuelta17 {
	public static void main(String[] args) {
		double radio;
				
		System.out.print("Ingrese el radio: ");
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // para decimales con punto(.)
		radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);	
		double longitud = 2*Math.PI*radio;
		
		System.out.println("Longitud de la circunferencia: " + longitud);
		System.out.println("Area del circulo: " + area);
		sc.close();
	}
}

package unidad5.actividadesresueltas;

public class ActividadResuelta54 {
	public static void main(String[] args) {
		
		int tabla[] = {2,3,4};
		
		int valorMax = maximo(tabla);
		System.out.println(valorMax);
	}
	
	public static int maximo(int t[]) {
		
	
		int maximo = t[0];
		
		for (int i = 0; i < t.length; i++) {
			if (t[i]>maximo) {
				maximo = t[i];
			
			}
		}
		return maximo;
	}
}

// diseñar la funcion de int maximo(int t[]) que devuelva el maximo valor contenido en la tabla
// suponiendo que la tabla siempre tendra al menos 1 elemento 
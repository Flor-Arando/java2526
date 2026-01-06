package unidad4.actividadesaplicacion;

public class ActividadAplicacion413 {
	public static void main(String[] args) {
		
		muestraPares(6); // sin el sysout porque la funcion lo tiene
		
	}
	
	public static void muestraPares(int n) {
		
		for(int i=0; i<=n; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}		
		}

	}
}

package unidad2.actividadesresueltas;

import java.util.Scanner;

public class ActividadResuelta27 {
	public static void main(String[] args) {
		// pedir 3 num y ordenarlos de mayor a menor
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el núm 1: ");
		n1 = sc.nextInt();
		System.out.println("Escriba el núm 2: ");
		n2 = sc.nextInt();
		System.out.println("Escriba el núm 3: ");
		n3 = sc.nextInt();
		sc.close();
		
		if(n1>=n2 && n1>=n3) { // n1
			
			if(n3<=n2) {
				System.out.println(n1+" "+n2+" "+n3);
			}				
			else {
					
				System.out.println(n1+" "+n3+" "+n2);
				}
			}
			
			else if(n2>=n1 && n2>=n3) { // n2
				
				if(n3<=n1) {
					System.out.println(n2+" "+n1+" "+n3);
				}
				else {
					System.out.println(n2+" "+n3+" "+n1);
				}
			}
			
			else { // n3
				
				if(n2<=n1) {
					System.out.println(n3+" "+n1+" "+n2);
				}
				else {
					System.out.println(n3+" "+n2+" "+n1);
				}		
		}
	}
	
}

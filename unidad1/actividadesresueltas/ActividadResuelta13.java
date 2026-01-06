package unidad1.actividadesresueltas;
import java.util.Scanner;
public class ActividadResuelta13 {
	
   public static void main(String[] args) {
      int edad;
      
      System.out.print("Escriba su edad: ");
      Scanner sc = new Scanner(System.in);
      edad = sc.nextInt();
      edad = edad + 1;
      System.out.print("El próximo año su edad será de " + edad + " años");
      sc.close();  
   }
}
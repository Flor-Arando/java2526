package unidad5.actividadespropuestas;

public class ActividadPorpuesta52 {
	public static void main(String[] args) {
		boolean []arrayOriginal = new boolean[2];
		System.out.println("ref array original - dirección del objeto: "+arrayOriginal);
		
		boolean []arrayDos = new boolean[3];
		boolean []arrayTres = new boolean[1];
		
		System.out.println("------------------creacion de nuevas variables de referencia: -----------------------");
		System.out.println(arrayDos);
		System.out.println(arrayTres);
		
//		NO estoy copiando el array, estoy haciendo que arrayDos y arrayTres apunten al mismo objeto que arrayOriginal
//		Como ya no hay ninguna variable apuntando a ellos por quedar huerfanos, Java los marcará para garbage collection.
		arrayDos = arrayOriginal;
		arrayTres = arrayOriginal;
		
		System.out.println("------------------referencias despues: -----------------------");
		System.out.println("ref array original: "+arrayOriginal);
		System.out.println(arrayDos);
		System.out.println(arrayTres);
		
//		Si reasigno una referencia, no cambia el array, cambia qué array está apuntando.
//		Varias variables pueden apuntar al mismo array.
//		Los arrays que pierden todas sus referencias son eliminados por el garbage collector.

	}
}

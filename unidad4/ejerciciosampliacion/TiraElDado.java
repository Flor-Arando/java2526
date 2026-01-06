package unidad4.ejerciciosampliacion;

import java.util.Scanner;

public class TiraElDado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int rondas, j1,j2, victoriaJ1, victoriaJ2;
		int puntajeJ1 = 0;
		int puntajeJ2 = 0;
		
		System.out.print("¿Al mejor de cuántas rondas quieres jugar? ");
		rondas = sc.nextInt();

		
		int victoriaNecesaria = (int) Math.ceil(rondas*0.5); 
		System.out.println(victoriaNecesaria + "prueba");
		
		do {
			
			System.out.println("-------\nTirada "+contador);
			
			j1 = tirarDado(sc);
			j2 = tirarDado(sc);
			
			System.out.println("Jugador 1 saca: " + j1);
            System.out.println("Jugador 2 saca: " + j2);
			
            while(j1 == j2) {
            	System.out.println("Empate. ¡Tiran de nuevo!");
				j1 = tirarDado(sc);
				j2 = tirarDado(sc);
				System.out.println("Jugador 1 saca: " + j1);
		        System.out.println("Jugador 2 saca: " + j2);
			}
            
            
            victoriaJ1 = compararResultados(j1,j2);
            victoriaJ2 = compararResultados(j1,j2);
           
            if(victoriaJ1==1) {
            	puntajeJ1 ++;
            }
            else if (victoriaJ2 == 2) {
            	puntajeJ2 ++;
            }
            
            System.out.println("Puntaje: J1 = " + puntajeJ1 + "\nPuntaje: J2 = " + puntajeJ2);
            contador++;
			
		}while(puntajeJ1 != victoriaNecesaria && puntajeJ2 != victoriaNecesaria);
				
			
	}
	
	public static int tirarDado(Scanner sc) {	
		int numero = (int) (Math.random() * 6) + 1;
		return numero;
	}
	
	public static int compararResultados(int j1, int j2) {
		if(j1>j2) {			
			return 1;
		}
		else {
			return 2;
		}

	}
}
/*
 * Conceptos: bucle do-while, números aleatorios, control de flujo. 
 * Descripción:cada jugador tira un dado (1–6). Gana el que saque el número más alto. 
 * Se puede jugar al mejor de N rondas.
 * 
 * Función tirarDado()
 * 
 * Función compararResultados()
 * 
 * Variante: añadir doble tirada en caso de empate.
 * 
 * int a = new Scanner(System.in).nexInt(); para no tener problemas con el scanner y se pierdan recursos hacerlo así.
 * utilizar funciones junto con otras internas en el main.
 */
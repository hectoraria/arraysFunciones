package actividades;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// Creo el array Bidemensional
		int tabla[][];
		// Variable para dale tanto ancho como alto
		int largo;
		int ancho;
	
		// Abro el escaner
		Scanner sc =new Scanner (System.in);
		
		// Pregunto por el alto de la tabla
		System.out.println("Introduce la altura de la tabla:");
		largo=sc.nextInt();
		// Pregunto por el ancho de la tabla
		System.out.println("Introduce el ancho de la tabla:");
		ancho=sc.nextInt();
		tabla=new int [largo][ancho];
		
		rellenatabla(tabla, largo, ancho);
		// Creo un for para rellenar el array bidimensional
		for(int i=0;i<largo;i++) {
			for(int j=0;j<ancho;j++) {
				System.out.print(tabla[i][j]+" \t");
			}
			
			System.out.println();
		}
	}
	


	public static void rellenatabla(int tabla[][],int y,int x) {
		for(int i=0;i<y;i++) {
			for(int j=0;j<x;j++) {
				tabla[i][j]=10*(i+j);
			}
		}
	}
	
}



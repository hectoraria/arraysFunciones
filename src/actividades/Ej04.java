package actividades;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		// Creo el array Bidemensional
		int tabla[][];
		int tamaño=11;
		// Abro el escaner
		Scanner sc =new Scanner (System.in);

		
		// Inicializo la tabla
		tabla=new int [tamaño][tamaño];
		
		tabla=rellenatabla(tabla,tamaño);
		
		
		// Creo un for para rellenar el array bidimensional
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print(tabla[i][j]+" \t");
			}
			
			System.out.println();
		}
	}
	


	public static int[][] rellenatabla(int tabla[][],int tamaño) {
		for(int i=1;i<tamaño;i++) {
			for(int j=1;j<tamaño;j++) {
				tabla[i][j]=(i*j);
			}
		}
		return tabla;
	}
	
}
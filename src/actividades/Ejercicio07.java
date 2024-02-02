package actividades;

import java.util.Scanner;

/*
 * Realiza una función que reciba una tabla bidimensional 
 * y devuelva en otro array distinto su transposición:
	
	Define un método main que llame a esta función 
	pasándole una tabla bidimensional y muestre por pantalla el resultado.

 * 
 * */
public class Ejercicio07 {

	public static void main(String[] args) {
		// Creo el array Bidemensional
		int tabla[][] = new int[4][4];
		// Variable contador
		int contador = 1;
		// Abro el escaner
		Scanner sc = new Scanner(System.in);

		// Creo un for para rellenar el array bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = contador;
				contador++;
			}

			System.out.println();

		}
		
		// Llamo a la funcion
		tabla=darvuelta(tabla);
		
		// Creo un for para rellenar el array bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " \t");
			}

			System.out.println();
		}
	}


	public static int[][] darvuelta(int tabla[][]) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j]=tabla[j][i];
			}

			System.out.println();
		}

		return tabla;
	}

}
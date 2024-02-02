package actividades;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * Esta clase consiste en llenar la tabla entre el 100 y el 999
	 * 
	 * @auth hector
	 * 
	 * @return tabla manda la tabla llena
	 */
	public static int[][] rellenatabla(int tabla[][], int fila, int columna) {

		Random rd = new Random();

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				tabla[i][j] = rd.nextInt(100, 1000);
			}
		}
		return tabla;
	}

	/*
	 * En este metodo main tenemos una llamada a la funcion anterior donde despues
	 * con un for se muestra el contenido del array bidimensional
	 * 
	 * @auth hector
	 * 
	 */
	public static void main(String[] args) {
		// Creo el array Bidemensional
		int tabla[][];
		// Variable para las filas
		int fila = 4;
		// Variable para las columnas
		int columna = 5;
		// Abro el escaner
		Scanner sc = new Scanner(System.in);

		// Inicializo la tabla
		tabla = new int[fila][columna];

		tabla = rellenatabla(tabla, fila, columna);

		// Creo un for para rellenar el array bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " \t");
			}

			System.out.println();

		}
		// Cierro el escaner
		sc.close();
	}
}

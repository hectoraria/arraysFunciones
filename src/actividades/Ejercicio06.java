package actividades;

import java.util.Arrays;
import java.util.Random;

/*
 * Realiza una función que reciba una tabla de dos dimensiones. 
 * A continuación, debe devolver un array de dos posiciones que 
 * contenga el mínimo en la posición 0 y el máximo en la posición 1. 
 * Define un método main que rellene un array de 6 filas por 10 columnas 
 * con números enteros positivos comprendidos 
 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a 
 * la función con este array y mostrar por consola los valores mínimo y máximo de la tabla.
 * */
public class Ejercicio06 {

	public static void main(String[] args) {
		// Creo el array Bidemensional
		int tabla[][]=new int[6][10];
		// Creo el array para igualar a la memoria
		int tablaarray[]=new int [2];
		// Inicio el escaner
		Random rd = new Random();
		// Lleno el array bidimensional recorriendo el for
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 1; j < tabla[i].length; j++) {
				tabla[i][j] = rd.nextInt(0, 1001);
			}
		}
		tablaarray=rellenatabla(tabla);
		
		System.out.println(Arrays.toString(tablaarray));

	}
	public static int[] rellenatabla(int tabla[][]) {
		// Creo el array para recoger el minimo y el maximo
		int tablaarray[]=new int [2];
		
		// Variable maximo y minimo
		tablaarray[0] =Integer.MIN_VALUE;
		tablaarray[1] =Integer.MAX_VALUE;
		

		for (int i = 1; i < tabla.length; i++) {
			for (int j = 1; j < tabla[i].length; j++) {
				if(tablaarray[0]<tabla[i][j]) {
					tablaarray[0]=tabla[i][j];
				}
				if(tablaarray[1]>tabla[i][j]) {
					tablaarray[1]=tabla[i][j];
				}
			}
		}
		return tablaarray;
	}

}

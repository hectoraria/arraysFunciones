package actividades;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// Creo el array Bidemensional
		int alumnos[][]=new int[4][5];
		int notas=0;
		int max=0;
		int min=0;
		int media=0;
		//Importar escaner 
		Scanner sc = new Scanner(System.in);
		
		// Creo un for para rellenar el array y calcular el maximo, minimo y la nota media
		for(int i=0;i<4;i++) {
			max=-999999999;
			min=999999999;
			media=0;
			// for para ir preguntado por la nota
			for(int j=0;j<5;j++) {
				System.out.println("Introduce la nota del alumno "+(i+1));
				notas=sc.nextInt();
				
				if(notas<min) {
					min=notas;
				}else if(notas>min){
					max=notas;
				}
				media=notas+media;
				alumnos[i][j]=notas;
			}
			media=media/5;
		}
		// Creo un for para rellenar el array bidimensional
		for(int y=0;y<alumnos.length;y++) {
			for(int x=0;x<alumnos[y].length;x++) {
				System.out.print(alumnos[y][x]+" \t");
			}
			
			System.out.println();
		}
		
	

	}

}

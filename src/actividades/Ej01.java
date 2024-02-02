package actividades;

public class Ej01 {

	public static void main(String[] args) {
		// Creo un array bidimensional
		int num[][] =new int[3][6];
		
		num[0][0]=0;
		num[0][1]=30;
		num[0][2]=2;
		num[1][0]=75;
		num[0][5]=5;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		for(int[] fila : num) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
			
		}

}

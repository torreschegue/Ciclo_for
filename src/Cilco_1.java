/*
 * Ciclo For
 * Este es un ciclo que nos permite hacer iteraciones para operacion complejas:
 * Recorrer una lista de informacion muy grande que incluir una base de datos
 * Recorrer ciclo con operaciones muy complejas o iterar con resultado de diferente tipo
 * Sintaxis:
 * for(inicializador; Condicion logica; incremento){
 * 	proceso 1
 * 	proceso n
 * }
 * 
 * inicializador: indica donde vamos a partir y se reconoce la valiable control o quien lleve el flujo
 * Condicion logica: Es la cual nos permite condicionar hasta donde queremos llegar.
 * Incremento: contador que aumenta en 1 por cada ciclo de iteracion
 * 
 * Nota: El Ciclo for en su primera vuelta no se incremento, hasta de la segunda.
 * 
 * 
 * */


public class Cilco_1 {

	public static void main(String[] args) {
		
		// For 
		//int i; // Indice o variable control
		for (int i = 1; i<= 100;  i++) {
			System.out.print(i);
			System.out.print("-");
		}
		System.out.println();
		
		// While
		int x = 1; //Condicion
		//x = 1;
		while(x<= 100) { 
			System.out.print(x);
			System.out.print("-");
			//x = x + 1;
			x++;
		}

	}

}

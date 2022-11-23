import java.util.Scanner;

/*
 * Desarrollar un programa que solicite 10 numeros
 * e imprima la suma de los ultimos 5 numeros
 * Teclado --> {9, 3, 1, 4, 8, 1 ,2 ,4, 1 ,2}
 * suma = 10
 * i -> Indice
 * i = 1
 * {9(1), 3(2), 1(3), 4(4), 8(5), 1(6) ,2(7) ,4(8), 1(9) ,2(10)}
 * la suma inicia cuando i>5
 * 
 * * {1(1), 1(2), 1(3), 1(4), 1(5), 1(6) ,1(7) ,1(8), 1(9) ,1(10)}
 * 10
 * 9+1 =10
 * 9-1 = 8
 * */
public class ciclo_5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor,suma;
		suma=0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Ingrese su valor: " + i);
			valor = teclado.nextInt();
			
			if(i>5) {
				suma = suma +valor;
			}
		}
		
		System.out.println("La suma de los ultimos 5 valores es:" + suma);
		
	}

}

import java.util.Scanner;

public class ciclo_2 {

	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);
		
		int suma, promedio, valor, i;
		suma = 0;
		
		for(i = 1; i<=5; i++) {
			System.out.println("Ingrese Valor: " + i);
			valor = teclado.nextInt();// 10, 9, 10
			// Contador
			suma = suma + valor;
			// suma 0; 10
			// suma 10; 19
			// suma 19; 29
			// 1
			// 1
			
		}
		
		System.out.println("La suma es: " + suma);
		promedio = (suma/5);
		System.out.println("Tu promedio es: " + promedio);

	}

}

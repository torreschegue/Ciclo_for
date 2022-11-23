import java.util.Scanner;

public class Ciclo_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cantidad, n, valor;
		cantidad = 0;
		
		System.out.println("Cuantos Valores Ingresara: ");
		n = teclado.nextInt();
		
		for(int i = 1;  i<=n; i++) {
			
			System.out.println("Ingrese un Valor: " + i);
			valor = teclado.nextInt();
			
			if(valor >= 1000) {
				cantidad ++;
			}
			
		}
		
		System.out.println("La Cantidad de valores Ingresados mayores o Iguales a 1000 son:");
		System.out.println(cantidad);
		
		

	}

}

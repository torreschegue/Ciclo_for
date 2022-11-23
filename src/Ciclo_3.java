import java.util.Scanner;

public class Ciclo_3 {
 public static void main(String[] args) {
	 
	 Scanner teclado = new Scanner(System.in);
	 int aprobados, reprobados, nota;
	 aprobados = 0;
	 reprobados = 0;
	 
	 for(int i = 1; i<=10; i++) {
		 System.out.println("Ingrese una nota: " + i);
		 nota = teclado.nextInt();
		 
		 if(nota >= 70) {
			 // Forma larga
			 //aprobados = aprobados +1;
			 // forma corta
			 aprobados ++;
		 }else {
			 // Forma Larga
			 reprobados= reprobados +1;
			 // Forma Corta
			 reprobados++;
		 }
	 }
	 
	 System.out.println("Cantidad de aprobados: " + aprobados);
	 System.out.println("Cantidad de reprobados: " +  reprobados);
	 
	 
	 
	
 }
}

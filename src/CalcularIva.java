import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Calculadora del IVA ");
		System.out.println("---------------------");
		char letra = 'k';
		
		do {
			System.out.println("Por favor dame el importe en euros");
			
			float importe = src.nextFloat();
			
			System.out.println("El IVA repercutido es : " + importe * 0.21);
			while(letra != 's' && letra != 'n') {
				System.out.println("Quieres volver a calcular otro importe? Pulsa 's' para Seguir, 'n' para Parar");
				String opcion = src.next();
				letra = opcion.charAt(0);
			}
			
			
		} while ('s' == letra);
		
		System.out.println("---------------------------");
		System.out.println("Adios hasta la proxima");
		
		src.close();
	}

}

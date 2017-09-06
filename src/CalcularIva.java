import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		
		System.out.println("Calculadora del IVA ");
		System.out.println("---------------------");
		String letra = "k";
		do {
			System.out.println("Por favor dame el importe en euros");
			
			Scanner src = new Scanner(System.in);
			
			float importe = src.nextFloat();
			
			System.out.println("El IVA repercutido es : " + importe * 0.21);

			System.out.println("Quieres volver a calcular otro importe? Pulsa 's' para Seguir, 'n' para Parar");
			letra = src.next();
			
		} while ("s".equals(letra));
		
		System.out.println("---------------------------");
		System.out.println("Adios hasta la proxima");
	}

}

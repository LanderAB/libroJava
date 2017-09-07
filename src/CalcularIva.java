import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Calculadora del IVA ");
		System.out.println("---------------------");
		char letra = 'k';
		float importe = 0;
		boolean importeCorrecto = true;
		
		do {
			System.out.println("Por favor dame el importe en euros");
			//comprobar que sea un numero correcto
			do {
				try {
					src = new Scanner(System.in);
					importe = src.nextFloat();
					importeCorrecto = false;
				} catch (Exception e) {
					System.out.println("valor incorrecto, introduce un valor correcto,por ejemplo: 123.45");
				}
				
			} while(importeCorrecto);
			
			//calculo del iva
			System.out.println("El IVA repercutido es : " + importe * 0.21);
			
			//si queremos recpetir la operacion
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

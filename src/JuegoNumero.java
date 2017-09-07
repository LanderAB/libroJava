import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoNumero {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		int contadorVidas = 3;
		int numeroNuevo = -1;
		boolean seguir = false;
		char letraSeguir = 'k';
		
		//bucle do-While para poder jugar otra partida
		do {
			int numeroAdivinar = (int) (Math.random() * 10 + 1);
			seguir = false;
			//Mientras tenga vidas que siga jugando
			while (contadorVidas > 0) {
				// Bucle do while para introducir el numero correcto
				do {
					try {
						System.out.println("Introduce numero a adivinar del 1 al 10");
						src = new Scanner(System.in);
						numeroNuevo = src.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("No introduzcas caracteres, solo numeros");
						numeroNuevo = -1;
					} catch (Exception e) {
						System.out.println("Introduce un valor correcto del 1 al 10");
						numeroNuevo = -1;
					}
				} while (numeroNuevo > 10 || numeroNuevo < 0);
				contadorVidas--;

				if (numeroAdivinar == numeroNuevo) {
					System.out.println("Has acertado!!");
					break;
				} else {
					System.out.println("No has adivinado. Te faltan " + contadorVidas + " vidas");
				}
			}

			if (contadorVidas == 0) {

				System.out.println("Has perdido el juego, el numero a adivinar era el " + numeroAdivinar);
			}

			System.out.println("Quieres seguir jugando? Pulsa 's' , sino pulsa cualquier otra tecla");
			letraSeguir = src.next().charAt(0);
			if (letraSeguir == 's') {
				seguir = true;
				contadorVidas = 3;
			}
		} while (seguir);
		System.out.println("-------------------------------------");
		System.out.println("Adios!!");
		src.close();

	}

}

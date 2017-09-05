/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {
	
	public void Restar(float dinero, float valorVueltas, int[] arrayContador, int n) {
		for(int i = 0; i < 100 ; i++) {
			if(valorVueltas >= dinero) {
				valorVueltas = valorVueltas - dinero;
			} else {
				arrayContador[n] = i;
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		float valorCompra = 1326.24f;
		float valorPagado = 2000f;
		float valorVueltas = valorPagado - valorCompra;
		
		int cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, cont05 = 0, cont02 = 0, cont01 = 0, cont005 = 0, cont002 = 0, cont001 = 0;
		
		
		while(valorVueltas >= 50) {
				valorVueltas = valorVueltas - 50;
				cont50++;
		}
		
		while(valorVueltas >= 20) {
			valorVueltas = valorVueltas - 20;
			cont20++;
		}
		
		while(valorVueltas >= 10) {
			valorVueltas = valorVueltas - 10;
			cont10++;
		}
		
		while(valorVueltas >= 5) {
			valorVueltas = valorVueltas - 5;
			cont5++;
		}
		
		while(valorVueltas >= 2) {
			valorVueltas = valorVueltas - 2;
			cont2++;
		}
		
		while(valorVueltas >= 1) {
			valorVueltas = valorVueltas - 1;
			cont1++;
		}
		
		while(valorVueltas >= 0.5) {
			valorVueltas = valorVueltas - 0.5f;
			cont05++;
		}
		
		while(valorVueltas >= 0.2) {
			valorVueltas = valorVueltas - 0.2f;
			cont02++;
		}
		
		while(valorVueltas >= 0.1) {
			valorVueltas = valorVueltas - 0.1f;
			cont01++;
		}
		
		while(valorVueltas >= 0.05) {
			valorVueltas = valorVueltas - 0.05f;
			cont005++;
		}
		
		while(valorVueltas >= 0.02) {
			valorVueltas = valorVueltas - 0.02f;
			cont002++;
		}
		
		while(valorVueltas >= 0.01) {
			valorVueltas = valorVueltas - 0.01f;
			cont001++;
		}
		//end while
	
		System.out.println("Billetes 50 -->" + cont50);
		System.out.println("Billetes 20 -->" + cont20);
		System.out.println("Billetes 10 -->" + cont10);
		System.out.println("Billetes 5 -->" + cont5);
		System.out.println("Billetes 2 -->" + cont2);
		System.out.println("Billetes 1 -->" + cont1);
		System.out.println("Billetes 0.5 -->" + cont05);
		System.out.println("Billetes 0.2 -->" + cont02);
		System.out.println("Billetes 0.1 -->" + cont01);
		System.out.println("Billetes 0.05 -->" + cont005);
		System.out.println("Billetes 0.02 -->" + cont002);
		System.out.println("Billetes 0.01 -->" + cont001);
		
		float[] billetes_monedas = {50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
		for (int i = 0; i < billetes_monedas.length; i++) {
			
		}
		
		
		
	}


}

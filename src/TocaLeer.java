
public class TocaLeer {

	/**
	 * @param args
	 */
	
	static String[] alumnos = {"Arkaitz", "Erlantz", "Fran", "Cristian", "Leire", "Mikel", "Josu", "Alberto", "Jon", "Lander", "German"};

	
	public static void main(String[] args) {
		
		int numAleatorio = generaNumeroAleatorio(alumnos.length);
		
		System.out.println("El afortunado es : " + alumnos[numAleatorio]);

	}
	
	/**
	 * Este metodo devuelve un numero aleatorio entre 0 y <code>max</code>
	 * @param max es el numero maximo de alumnos (alumnos.length)
	 * @return int aleatorio
	 */
	public static int generaNumeroAleatorio(int max){
		//TODO aqui falta implementar logica
		int numAleatorio = (int)(Math.random() * max);
		return numAleatorio;
	}

}

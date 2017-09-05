
public class HelloWorld {
	
	final int DIAS_SEMANA = 7;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
		String[] alumnos = {"Ander", "Arkaitz", "Erlantz", "Fran", "Cristian", "Leire", "Mikel", "Josu", "Alberto", "Jon", "Lander", "German"};
		
		System.out.println("-------------- Lista -------------");
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println((i+1) + " - " + alumnos[i]);
		}
		
	}

}

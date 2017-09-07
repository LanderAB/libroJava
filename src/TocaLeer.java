
public class TocaLeer {

	/**
	 * @param args
	 */
	
	//static String[] alumnos = {"Arkaitz", "Erlantz", "Fran", "Cristian", "Leire", "Mikel", "Josu", "Alberto", "Jon", "Lander", "German"};

	static Participante[] alumnos = new Participante[15];
	
	public static void main(String[] args) {
		
		alumnos[0] = new Participante("Arkaitz", "arkaitzgl");
		alumnos[1] = new Participante("Erlantz1 ", "erliglesias");
		alumnos[2] = new Participante("Fran", "FranPerez92");
		alumnos[3] = new Participante("Cristhian ", "CristianVar");
		alumnos[4] = new Participante("Erlantz2 ", "-Erlantzcabrejas ");
		alumnos[5] = new Participante("Leire", "LeireBustin");
		alumnos[6] = new Participante("mikel", "zoroa84");
		alumnos[7] = new Participante("Josu Larrazabal", "Katakume");
		alumnos[8] = new Participante("Alberto ", "amsoria91");
		alumnos[9] = new Participante("Jon alarcon", "alarconsolis");
		alumnos[10] = new Participante("Arantza", " ");
		alumnos[11] = new Participante("Naiara", "naiaramateos");
		alumnos[12] = new Participante("Lander", "LanderAB");
		alumnos[13] = new Participante("Yeray ", "LordBlacKhiin");
		alumnos[14] = new Participante("German", " ");
		
		int numAleatorio = generaNumeroAleatorio(alumnos.length);
		
		System.out.println("El afortunado es : " + alumnos[numAleatorio].getNombre() + " " + alumnos[numAleatorio].getUsuarioGit());

	}
	
	/**
	 * Este metodo devuelve un numero aleatorio entre 0 y <code>max</code>
	 * @param max es el numero maximo de alumnos (alumnos.length)
	 * @return int aleatorio
	 */
	public static int generaNumeroAleatorio(int max){
		int numAleatorio = (int)(Math.random() * max);
		return numAleatorio;
	}

}

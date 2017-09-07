import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCanciones {
	/**
	 * Metodo que inicializa las canciones y las mete en un ArrayList
	 * @return ArrayList para que posteriormente se pueda manipular
	 */
	ArrayList inicializarCanciones() {
		ArrayList canciones = new ArrayList();
		
		canciones.add(new Cancion("Oreka", "Berri Txarrak", "2,35min"));
		canciones.add(new Cancion("Sakalakalashnikov", "Ayax y Prok", "3,32min"));
		canciones.add(new Cancion("Jaia", "Skalariak", "5,36min"));
		canciones.add(new Cancion("El espiritu del oi", "Non Servium", "2,17min"));
		canciones.add(new Cancion("Salda badago", "Hertzainak", "5,33min"));
		canciones.add(new Cancion("Aske maite", "Gatibu", "2,37min"));
		canciones.add(new Cancion("Rap God", "Eminem", "1,58min"));
		canciones.add(new Cancion("Zehaztasuna eta Zihurtasuna", "Oliba Gorriak", "3,14min"));
		canciones.add(new Cancion("Guerras Punicas", "Riot Propaganda", "4,33min"));
		canciones.add(new Cancion("Haizea", "Glaukoma", "4,22min"));
		
		return canciones;
	}
	/**
	 * 
	 * Metodo que pinta el menu principal
	 */
	void pintarMenu() {
		System.out.println("**********  MENU  CANCIONES ************");
		System.out.println("1. Listar");
		System.out.println("2.Eliminar");
		System.out.println("3.Crear");
		System.out.println("4.Cancion en detalle");
		System.out.println("5.Salir");
		
	}
	
	int escogerOpcion() {
		Scanner src = new Scanner(System.in);
		int opcion = -1;
		System.out.println("\nElige la opcion que deseas escoger");
		try {
			opcion = src.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Estos caracteres no son validos");
		};
		return opcion;
	}
	/**
	 * Metodo que lista todas las canciones
	 * @param canciones Es un ArrayList con las canciones inicializadas
	 */
	void listarCanciones(ArrayList canciones) {
		for(int i = 0; i < canciones.size(); i++) {
			System.out.println((i+1) + " " + canciones.get(i).toString());
		}
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	/**
	 * Metodo que borra las canciones mediante un index
	 * @param canciones ArrayList, en este caso borra una cancion de la lista
	 */
	void borrarCanciones(ArrayList canciones) {
		System.out.println("Escoge la cancion que deseas borrar, con numero");
		Scanner src = new Scanner(System.in);
		int index = src.nextInt();
		
		canciones.remove(index - 1);
		System.out.println("Cancion borrada!");
		
	}
	
	/**
	 * metodo para insertar las canciones con titulo, artista y duracion
	 * @param canciones ArrayList
	 */
	void crearCanciones(ArrayList canciones) {
		Scanner src = new Scanner(System.in);
		System.out.println("Escribe el nombre del titulo");
		String titulo = src.next();
		System.out.println("Escribe el nombre del artista");
		String artista = src.next();
		src.nextLine();
		System.out.println("Escribe cuanto dura en minutos");
		String duracion = src.next();
		
		canciones.add(new Cancion(titulo, artista, duracion));
		System.out.println("Canción añadida!");
	}
	
	/**
	 * Metodo para listar una sola cancion, mas detallado
	 * @param canciones ArrayList
	 */
	void listaUnaCancion(ArrayList canciones) {
		Scanner src = new Scanner(System.in);
		System.out.println("Escoge el numero de cancion que quieras ver en detalle");
		int index = src.nextInt();
		
		System.out.println(canciones.get(index - 1).toString());
	}
	

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		MenuCanciones objMenuCanciones = new MenuCanciones();
		ArrayList objCanciones = objMenuCanciones.inicializarCanciones();
		
		int opcion = 0;
		
		do {
			objMenuCanciones.pintarMenu();
			
			opcion = objMenuCanciones.escogerOpcion();
					
			if(opcion == 1) {  //Listar las canciones
				
				objMenuCanciones.listarCanciones(objCanciones);
			
			} else if(opcion == 2) { //Borrar las canciones
				
				objMenuCanciones.borrarCanciones(objCanciones);
			} else if(opcion == 3) { //Crear canciones
				
				objMenuCanciones.crearCanciones(objCanciones);
				
			} else if (opcion == 4) { //Lista una cancion
				
				objMenuCanciones.listaUnaCancion(objCanciones);
				
			} else if(opcion == 5) { //Salir de pantalla
				System.out.println("ADIOS!");
				
			} else { //Cuando introduce otro numero
				System.out.println("Introduce el numero correcto\n\n");
			}
			
		} while(opcion != 5);
		
		src.close();
	}

}

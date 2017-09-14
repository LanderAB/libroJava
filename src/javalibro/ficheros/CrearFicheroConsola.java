package javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearFicheroConsola {
	
	public static String[] insertarDatos() {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Introduce la ruta donde quieres guardar");
		String ruta = src.nextLine();
		
		System.out.println("Introduce el nombre del archivo");
		String nombre = src.nextLine();
		
		System.out.println("Introduce algo de texto");
		String texto = src.nextLine();
		
		String[] array = {ruta, nombre, texto};
		return array;
	}
	
	public static void crearFichero(String[] array) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw =  new FileWriter(array[0] + "\\" + array[1]);
			bw = new BufferedWriter(fw);

			bw.write(array[2]);
			System.out.println("El archivo se ha creado correctamente");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo");
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		String[] array = insertarDatos();
		crearFichero(array);

	}

}

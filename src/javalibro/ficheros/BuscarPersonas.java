package javalibro.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPersonas {

	public static void main(String[] args) {
		String linea = "";
		int contador = 0;
		try {
			FileReader fr = new FileReader("C:\\desarrollo\\personas.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
				contador++;
			}
			System.out.println("En total hay "+ contador + " personas");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el documento");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer la línea");
			e.printStackTrace();
		}
	}

}

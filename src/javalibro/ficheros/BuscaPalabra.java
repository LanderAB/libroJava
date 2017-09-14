package javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuscaPalabra {
	
	public static void listarDirectorio(File directorio, String separador){
		File[] ficheros = directorio.listFiles();
		for (int x=0;x<ficheros.length;x++){			
			System.out.println(separador + ficheros[x].getName());
			
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + " ";
				listarDirectorio(ficheros[x],nuevo_separador);
			}
		}
	}
	
	public static void buscarPalabra(File directorio) {
		String palabra = "osobuko";
		boolean encontrado = false;
		String linea = "";
		try {
			FileReader fr = new FileReader(directorio);
			BufferedReader br = new BufferedReader(fr);
			
			while(encontrado == false && (linea = br.readLine()) != null) {
				for(int i = 7; i < linea.length(); i++) {
					if(linea.substring(i, i-7).equals(palabra)) {
						System.out.println("Has encontrado osobuko en  :" + directorio);
						encontrado = true;
					}
					
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer la linea");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		String palabra = "osobuko";
		File f = new File("C:\\desarrollo\\buscatesoro");
		listarDirectorio(f, "   ");
		//TODO terminar el ejercicio, muchos errores

	}

}

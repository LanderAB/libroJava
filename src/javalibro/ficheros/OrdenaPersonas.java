package javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javalibro.colecciones.TiemposColecciones;
import javalibro.excepciones.PersonaException;
import javalibro.pojo.Persona;

/**
 * ordena el fichero personas.txt
 * campos < 7 (no valido), dni valido, email valido, edad >= 18 valido
 * email, dni, edad lanza PersonaException  (Estos emails no son validos)
 * @author Administrador
 *
 */
public class OrdenaPersonas {
	
	private static final String RUTA = "C:\\desarrollo\\personas.txt";
	private static final String RUTA_PER_ERROR = "C:\\desarrollo\\personas_error.txt";
	private static final String RUTA_PER_OK = "C:\\desarrollo\\personas_ok.txt";
	private static final int CAPACIDAD_MAX = 7;
	
	public static void comprobarCampos() {
		//Declarar valores
		//Para leer el fichero
		FileReader fr = null;
		BufferedReader br = null;
		
		//Para escribir en el fichero bueno
		FileWriter fwOk = null;
		BufferedWriter bwOk = null;
		
		//Para escribir en el fichero de Error
		FileWriter fwError = null;
		BufferedWriter bwError = null;
		
		String linea = "";
		
		//Contadores para los registros
		int contadorOk = 0;
		int contadorError = 0;
		
		try {
			//Inicializar valores
			fr = new FileReader(RUTA);
			br = new BufferedReader(fr);
			
			fwOk = new FileWriter(RUTA_PER_OK);
			bwOk = new BufferedWriter(fwOk);
			
			fwError = new FileWriter(RUTA_PER_ERROR);
			bwError = new BufferedWriter(fwError);
			
			Persona p = null;
						
			String[] partes = new String[CAPACIDAD_MAX];
			
			
			while((linea = br.readLine()) != null) {
				try {
					partes = linea.split(",");
					if(partes.length < 7) {
						fwError.write(linea);
						contadorError++;
						fwError.write("\r\n");
						fwError.flush();
						
					} else {
						p = new Persona(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), partes[4], partes[5], partes[6]);
						fwOk.write(linea);
						contadorOk++;
						fwOk.write("\r\n");
						fwOk.flush();
					} 
				} catch (PersonaException e) {
					
					
					try {
						fwError.write(linea);
						contadorError++;
						fwError.write("\r\n");
						fwError.flush();
					} catch (IOException e1) {
						System.out.println("No se ha podido escribir");
						e1.printStackTrace();
					}
				} //fin catch PersonaException
				
			} //final  while
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se ha podido leer la linea");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Formato del numero erroneo");
			e.printStackTrace();
		}
		
		System.out.println("Registros OK : " + contadorOk);
		System.out.println("Registros ERROR : " + contadorError);
	}

	public static void main(String[] args) {
		
		comprobarCampos();

	}

}

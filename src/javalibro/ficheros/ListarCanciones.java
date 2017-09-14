package javalibro.ficheros;

import java.io.File;

/**
 * Listar todas las canciones de la carpeta X
 * @author Administrador
 *
 */
public class ListarCanciones {
	
	/**
	 * Metodo para recorrer carpetas de forma recursiva
	 * @see http://lineadecodigo.com/java/listar-un-directorio-de-forma-recursiva-en-java/
	 * @param directorio
	 * @param separador
	 */
	public static void listarDirectorio(File directorio, String separador) {
		File[] ficheros = directorio.listFiles();
		for (int x=0; x < ficheros.length;x++){			
			System.out.println(separador + ficheros[x].getName());
			
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + " ";
				listarDirectorio(ficheros[x],nuevo_separador);
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		/*File fichero = new File("C:\\desarrollo\\Music");
		File[] lista = fichero.listFiles();
		for(int i = 0; i < lista.length; i++) {
			if(lista[i].isDirectory()) {
				File fichero2 = new File(lista[i].toString());
				File[] canciones = fichero2.listFiles();
				
				System.out.println(canciones.length + " " + lista[i].getName());
				
				for(int j = 0 ; j < canciones.length; j++) {
					System.out.println("\t"+canciones[j].getName() + " " + (canciones[j].length()/1024) + "kb");
				}
			}
		}
*/
		File f = new File("C:\\desarrollo\\Music");
		listarDirectorio(f, "--------");
	}
	

}

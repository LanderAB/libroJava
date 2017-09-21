package javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Nos conectaremos a una pagina web (http://www.example.com/) para descargar el codigo de fuente
 * @author Administrador
 *
 */
public class ConectarPaginaWeb {
	
	static final String PAGINA_WEB = "http://www.example.com/";
	/**
	 * Metodo que recoge un enlace que se encuentra en la pagina http://www.example.com/
	 * @return devuelve el enlace (String) que se encuentra dentro de las etiquetas <a>
	 */
	public static String recogerEnlaceWeb(String ruta) {
		String resul = "";
		try {
			//creamos URL
			URL url = new URL(ruta);
			
			//abrimos conexion
			URLConnection con = url.openConnection();
			
			//Crear InputStream y Buffer asociado
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			//leemos el codigo fuente linea a linea
			String linea = "";
			
			while((linea = br.readLine()) != null) {
				
				//conseguir h1
				if(linea.indexOf("<a") != -1) {
					for(int i = 0; i < (linea.length() - 4); i++){
						if(("http").equals(linea.substring(i, i+4))) {
							String frase = linea.substring(i);
							for(int j = 0; j < frase.length(); j++) {
								if(frase.charAt(j) == '"') {
									resul = frase.substring(0, j);
								}
							}
						}
					}
				}
			}
			System.out.println(resul);
			
		} catch (MalformedURLException e) {
			System.out.println("URL mal escrita " + PAGINA_WEB);
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No podemos establecer la conexion");
			
			e.printStackTrace();
		}
		
		return resul;
	}
	/**
	 * Metodo que recoge una url y saca su codigo por pantalla
	 * @param enlace URL destino al que le sacaremos el codigo fuente
	 */
	public static void sacarCodigo(String enlace) {
		try {
			URL url2 = new URL(enlace);
			URLConnection con2 = url2.openConnection();
			
			InputStreamReader isr2 = new InputStreamReader(con2.getInputStream());
			BufferedReader br2 = new BufferedReader(isr2);
			
			String linea2 = "";
			
			while((linea2 = br2.readLine()) != null) {
				System.out.println(linea2);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	public static void main(String[] args) {
		
		String url = recogerEnlaceWeb(PAGINA_WEB);
		String url2 = recogerEnlaceWeb(url);
		sacarCodigo(url2);

	}

}

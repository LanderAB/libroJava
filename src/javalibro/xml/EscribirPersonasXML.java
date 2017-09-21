package javalibro.xml;

/**
 * Ejercicio para convertir un data/personas.txt a data/personas.xml<br>
 * 
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y, TRABAJADOR
 * 
 * Estructura del xml:<br>
 * 
 * <personas> 
 * 	<persona> 
 * 		<nombre>Ted</nombre> 
 * 		<apellido1>Upton</apellido2>
 * 		<apellido2>Sant Andreu De La Barca</apellido2> 
 * 		<edad>8</edad> 
 * 		<email>tedfupton@mailinator.com</email>
 * 		<dni>12277015Y</dni> 
 * 		<rol>TRABAJADOR</rol> 
 * 	</persona>
 * 	<persona>
 * 		...
 * 	</persona>
 * 
 * </personas>
 * 
 * @author Administrador
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javalibro.excepciones.PersonaException;
import javalibro.pojo.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que Escribe los registros de personas.txt en un archivo personas.XML
 * @author Administrador
 *
 */
public class EscribirPersonasXML {
	
	public static final int CAPACIDAD_MAX = 7;
	public static final int PARTE_NOMBRE = 0;
	public static final int PARTE_APELLIDO = 1;
	public static final int PARTE_APELLIDO2 = 2;
	public static final int PARTE_EDAD = 3;
	public static final int PARTE_EMAIL = 4;
	public static final int PARTE_DNI = 5;
	public static final int PARTE_ROL = 6;
	
	public static final String RUTA_FICHERO = "C:\\desarrollo\\personas.txt";
	/**
	 * Metodo que recoge todos los registros linea a linea y los inserta en un arrayList
	 * @param ruta String donde esta contenido el fichero .txt
	 * @return devuelve un ArrayList<Persona> (entre ellos hay objetos = null!)
	 */
	public static ArrayList<Persona> recogerPersonas(String ruta){
		ArrayList<Persona>  arrayPersonas = new ArrayList<Persona>();
		
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		String partes[] = new String[CAPACIDAD_MAX];
		Persona p = null;
		
		try {
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			while((linea = br.readLine()) != null) {
				partes = linea.split(",");
				if(partes.length == 7) {
					
					try {
						p = new Persona(partes[PARTE_NOMBRE], partes[PARTE_APELLIDO], partes[PARTE_APELLIDO2], Integer.parseInt(partes[PARTE_EDAD]), partes[PARTE_EMAIL], partes[PARTE_DNI], partes[PARTE_ROL]);
					} catch (NumberFormatException e) {
						System.out.println("Formato no valido");
						e.printStackTrace();
					} catch (PersonaException e) {
						System.out.println("No cumple alguna condicion pero aun asi va pa dentro!!");
						e.printStackTrace();
					}
					
					arrayPersonas.add(p);
					
				}
				
			}
		} catch (IOException e) {
			System.out.println("No se ha podido leer la linea");
			e.printStackTrace();
		}
		
		return arrayPersonas;
	}
	/**
	 * Metodo que a partir de un ArrayList<Persona> generamos un fichero XML
	 * @param arrayPersona ArrayList donde van los objetos Persona, Muchos son NULL!!
	 */
	public static void generarXML(ArrayList<Persona> arrayPersona) {
        try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			
			//crear nodo raiz
			Element rootElement = doc.createElement("personas");
	        doc.appendChild(rootElement); 
	        
	        
	        
	        Element ePersona = doc.createElement("persona");
	        
	        //TODO bucle para todas las personas del fichero
	        for(int i = 0; i < arrayPersona.size(); i++) {
	        	if(arrayPersona.get(i) != null) {
	        		Element eNombre = doc.createElement("nombre");
		        	eNombre.setTextContent(arrayPersona.get(i).getNombre());
		        	ePersona.appendChild(eNombre);
		        	
		        	Element eApellido = doc.createElement("apellido");
		        	eApellido.setTextContent(arrayPersona.get(i).getApellido());
		        	ePersona.appendChild(eApellido);
		        	
		        	Element eApellido2 = doc.createElement("apellido2");
		        	eApellido2.setTextContent(arrayPersona.get(i).getCalle());
		        	ePersona.appendChild(eApellido2);
		        	
		        	Element eEdad = doc.createElement("edad");
		        	eEdad.setTextContent(String.valueOf(arrayPersona.get(i).getEdad()));
		        	ePersona.appendChild(eEdad);
		        	
		        	Element eEmail = doc.createElement("email");
		        	eEmail.setTextContent(arrayPersona.get(i).getEmail());
		        	ePersona.appendChild(eEmail);
		        	
		        	Element eDni = doc.createElement("dni");
		        	eDni.setTextContent(arrayPersona.get(i).getDni());
		        	ePersona.appendChild(eDni);
		        	
		        	Element eRol = doc.createElement("rol");
		        	eRol.setTextContent(arrayPersona.get(i).getOficio());
		        	ePersona.appendChild(eRol); 
	        	}
	        		
	        	
	        }
	        
	        //añadir Elementos Persona al nodo raiz 	
	        rootElement.appendChild(ePersona);
			
	        
	        //guardar en fichero
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File("data\\personas.xml"));
	        transformer.transform(source, result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public static void main(String[] args) {
		
		ArrayList<Persona> arrayPersona = new ArrayList<Persona>();
		//TODO conseguir un ArrayList<Persona> a partir del fichero de texto
        arrayPersona = recogerPersonas(RUTA_FICHERO);
		
        generarXML(arrayPersona);

	}

}

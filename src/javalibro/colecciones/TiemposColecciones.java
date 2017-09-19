package javalibro.colecciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import javalibro.pojo.Persona;

public class TiemposColecciones {
	
	final static int CAPACIDAD_ARRAY = 7;
	final static String DNI_BUSCAR = "26779063W";
	
	public static ArrayList<Persona> meterArrayList(String ruta){
		String linea = "";
		int contador = 0;
		String[] partes = new String[CAPACIDAD_ARRAY];
		Persona objPersona = null;
		ArrayList<Persona> objArrayList = new ArrayList<Persona>();
		
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				partes = linea.split(",");
				if(partes.length == CAPACIDAD_ARRAY) {
					objPersona = new Persona(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
					objArrayList.add(objPersona);
					contador++;
				}
			}
			System.out.println("En total hay "+ contador + " personas metidas en el ArrayList");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el documento");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer la línea");
			e.printStackTrace();
		}
		
		return objArrayList;
	}
	
	public static void recorrerArrayList(ArrayList objArrayList) {
		
		Iterator<Persona> it = objArrayList.iterator();
		Persona objPersona = null;
		while(it.hasNext()) {
			objPersona = it.next();
		}
	}
	
	public static HashMap<String, Persona> meterHashMap(String ruta){
		String linea = "";
		int contador = 0;
		Persona objPersona = null;
		HashMap<String, Persona> objHashMap = new HashMap<String, Persona>();
		
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				String[] partes = linea.split(",");
				if(partes.length == 7) {
					objPersona = new Persona(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
					objHashMap.put(partes[5], objPersona);
					contador++;
				}
			}
			System.out.println("En total hay "+ contador + " personas metidas en el HashMap");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el documento");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer la línea");
			e.printStackTrace();
		}
		
		
		return objHashMap;
	}
	
	public static void recorrerHashMap(HashMap<String, Persona> objHashMap) {
		
		Collection coleccion = objHashMap.values();
		Iterator<Persona> it =  coleccion.iterator();
		Persona objPersona = null;
		while(it.hasNext()) {
			objPersona = it.next();
		}
		
	}
	
	public static long buscarDniHashMap(HashMap<String, Persona> objHashMap) {
		
		long tInicio = System.currentTimeMillis();
		Collection coleccion = objHashMap.values();
		Iterator it = coleccion.iterator();
		
		
		long tFinal = 0;
		Persona objPersona2 = null;
		while(it.hasNext()) {
			objPersona2 = (Persona) it.next();
			if(objPersona2.getDni().equals(DNI_BUSCAR)) {
				System.out.println("Encontrado con HashMap" + objPersona2.toString());
				tFinal = System.currentTimeMillis();
				break;
			}
		}
		
		return tFinal - tInicio;
	}
	
	public static long buscarDniArrayList(ArrayList<Persona> objArrayList) {
		long tInicio = System.currentTimeMillis();
		long tFinal = 0;
		
		Iterator it = objArrayList.iterator();
		while(it.hasNext()) {
			Persona objPersona2 = (Persona) it.next();
			if(objPersona2.getDni().equals(DNI_BUSCAR)) {
				System.out.println("Encontrado con ArrayList " + objPersona2.toString());
				tFinal = System.currentTimeMillis();
				break;
			}
		}
		
		return tFinal - tInicio;
	}
	
	
	

	public static void main(String[] args) {
		
		//Recorrer
		//ArrayList
		
		long tInicio = System.currentTimeMillis();
		
		ArrayList<Persona> objArrayList = meterArrayList("C:\\desarrollo\\personas.txt");
		
		recorrerArrayList(objArrayList);
		
		long tFinal = System.currentTimeMillis();
		long tArrayListRecorrer = tFinal - tInicio;
		System.out.println("El tiempo empleado con ArrayList es: " + (tArrayListRecorrer));
		
		
		//Cambio de Array
		//HashMap
		
		tInicio = System.currentTimeMillis();
		
		HashMap<String, Persona> objHashMap = meterHashMap("C:\\desarrollo\\personas.txt");
		
		recorrerHashMap(objHashMap);
		
		
		tFinal = System.currentTimeMillis();
		long tHashMapRecorrer = tFinal - tInicio;
		
		
		System.out.println("El tiempo empleado con HashMap es: " + tHashMapRecorrer);
		
		
		//Ahora toca buscar por dni 
		//HashMap
		
		long tHashMapBuscar = buscarDniHashMap(objHashMap);
		
		
		//Cambio 
		//ArrayList	
		
		long tArrayListBuscar = buscarDniArrayList(objArrayList);
		
		System.out.println("El tiempo que ha tardado en buscar ARRAYLIST ha sido de : " + tArrayListBuscar);
		System.out.println("El tiempo que ha tardado en buscar HASHMAP ha sido de : " + tHashMapBuscar);
		

	}

}

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
	
	public static ArrayList<Persona> meterArrayList(String ruta){
		String linea = "";
		int contador = 0;
		String[] partes = new String[7];
		Persona objPersona = null;
		ArrayList<Persona> objArrayList = new ArrayList<Persona>();
		
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				partes = linea.split(",");
				if(partes.length == 7) {
					objPersona = new Persona(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
					objArrayList.add(objPersona);
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
	
	
	

	public static void main(String[] args) {
		
		//Recorrer
		//ArrayList
		
		long tInicio = System.currentTimeMillis();
		
		ArrayList<Persona> objArrayList = meterArrayList("C:\\desarrollo\\personas.txt");
		
		Iterator<Persona> it = objArrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		long tFinal = System.currentTimeMillis();
		long tArrayListRecorrer = tFinal - tInicio;
		System.out.println("El tiempo empleado con ArrayList es: " + (tArrayListRecorrer));
		
		
		//Cambio de Array
		//HashMap
		
		
		
		tInicio = System.currentTimeMillis();
		
		String linea = "";
		int contador = 0;
		Persona objPersona = null;
		HashMap<String, Persona> objHashMap = new HashMap<String, Persona>();
		
		try {
			FileReader fr = new FileReader("C:\\desarrollo\\personas.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				String[] partes = linea.split(",");
				if(partes.length == 7) {
					objPersona = new Persona(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
					objHashMap.put(partes[5], objPersona);
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
		Collection coleccion = objHashMap.values();
		it =  coleccion.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		tFinal = System.currentTimeMillis();
		long tHashMapRecorrer = tFinal - tInicio;
		System.out.println("El tiempo empleado con HashMap es: " + tHashMapRecorrer);
		
		System.out.println("El tiempo empleado con ArrayList es : " + tArrayListRecorrer);
		
		
		//Ahora toca buscar por dni 
		//HashMap
		
		coleccion = objHashMap.values();
		it = coleccion.iterator();
		
		tInicio = System.currentTimeMillis();
		
		while(it.hasNext()) {
			Persona objPersona2 = it.next();
			if(objPersona2.getDni().equals("26779063W")) {
				System.out.println("Encontrado con HashMap" + objPersona2.toString());
				tFinal = System.currentTimeMillis();
				break;
			}
		}
		
		long tHashMapBuscar = tFinal - tInicio;
		
		//Cambio 
		//ArrayList
		
		
		
		tInicio = System.currentTimeMillis();
		
		it = objArrayList.iterator();
		while(it.hasNext()) {
			Persona objPersona2 = it.next();
			if(objPersona2.getDni().equals("26779063W")) {
				System.out.println("Encontrado con ArrayList " + objPersona2.toString());
				tFinal = System.currentTimeMillis();
				break;
			}
		}
		
		long tArrayListBuscar = tFinal - tInicio;
		
		System.out.println("El tiempo que ha tardado en buscar ARRAYLIST ha sido de : " + tArrayListBuscar);
		System.out.println("El tiempo que ha tardado en buscar HASHMAP ha sido de : " + tHashMapBuscar);
		

	}

}

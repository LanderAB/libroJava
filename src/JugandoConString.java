
public class JugandoConString {

	public static void main(String[] args) {
		
		String manolo = "Manolo Kabezabolo";
		
		//convertir a minusculas
		System.out.println("El string pasado a minuscula : " + manolo.toLowerCase());
		//convertir a mayusculas
		System.out.println("El string pasado a mayuscula :"  + manolo.toUpperCase());
		//mostrar numero de caracteres
		System.out.println("El numero de caracteres es : " + manolo.length());
		//mostrar posiscion de la letra "K"
		System.out.println("El carácter K esta en la posicion " + manolo.indexOf('K'));
		
		//separar en dos variables el nombre y ´apellido' con substring
		String nombre = manolo.substring(0, 6); //Manolo
		System.out.println(nombre);
		String apellido = manolo.substring(7); // Kabezabolo
		System.out.println(apellido);
		
		
		/*   Comparando   */
		
		String c1 = "casa";
		String c2 = "Casa";
		
		//comparar c1 y c2 con equals y equalIgnoreCase
		if(c1.equals(c2)) {
			System.out.println("Son iguales con el equals");
		} else {
			System.out.println("No son iguales");
		}
		
		if(c1.equalsIgnoreCase(c2)) {
			System.out.println("Son iguales con ignoreCase");
		} else {
			System.out.println("No son iguales con ignoreCase");
		}
		
		/* Limpiando entradas de datos */
		
		String c3 = "perro";
		String c4 = "     perro     ";
		
		//las dos variables deden ser igual => trim
		if(c3.equals(c4.trim())) {
			System.out.println("Ahora si son iguales, los dos sin espacio");
		} else {
			System.out.println("Todavia no son iguales");
		}
		
		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique magna non elementum facilisis. Suspendisse ultricies finibus massa, at ullamcorper felis aliquet a. Aliquam gravida volutpat purus nec faucibus. Ut sodales enim ac gravida fermentum. Aenean id est at mauris vehicula tincidunt et sit amet erat. Morbi et tincidunt massa, scelerisque maximus quam. Sed hendrerit fermentum venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin faucibus hendrerit sem. Aliquam erat volutpat. Ut in condimentum eros. Praesent molestie justo quis porta finibus. Etiam laoreet, odio at auctor sodales, arcu arcu finibus ligula, a facilisis elit tellus laoreet turpis. Nulla mattis mattis mi sed aliquet. Duis dignissim commodo vulputate.";
		//mostrar longitud
		System.out.println("La longitud es de : " + lorem.length());
		//contar las palabras
		System.out.println("Palabras " + lorem.split(" ").length + " palabras");
		//contar todas las vocales
		int contadorVocales = 0;
		char [] aVocales = lorem.toLowerCase().toCharArray();
		for (int i = 0; i < aVocales.length; i++) {
			if(aVocales[i] == 'a' || aVocales[i] == 'e' || aVocales[i] == 'i' || aVocales[i] == 'o' || aVocales[i] == 'u') {
				contadorVocales++;
			}
		}
		System.out.println("Los vocales son : " + contadorVocales);
		
		//indicar el numero de veces que aparece 'at'
		
		String letras = "at";
		int j = 2;
		int contadorAt = 0;
		while(j < lorem.length()) {
			if(letras.equals(lorem.substring(j-2 , j))) {
				contadorAt++;
			}
			j++;
		}
		
		System.out.println("El numero de veces que aparece 'at' es de : " + contadorAt + " veces");
		int cantidad = UtilidadesString.buscarPalabra(lorem, letras);
		System.out.println("Numero de veces con metodo : " + cantidad);
/*		for(int i = 0; i < aVocales.length; i++) {
			if(aVocales[i] == 'a' || aVocales[i] == 'A') {
				aVocales[i] = 4;
			}
		}*/
		
	}
	
}

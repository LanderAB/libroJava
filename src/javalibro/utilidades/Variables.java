package javalibro.utilidades;
/*
 * Ejercicio para probar las variables de Java
 */
public class Variables {
	/**
	 * funcion para obtener sinbolo especial ASCII de check \u2714 o cross \u2716
	 * @param valor boolean
	 * @return si valor true check, si false cross
	 */
	public static char dameSimbolo(boolean valor) {
		char resul = '\u2716';
		
		if(valor) {
			 resul = '\u2714';
		}	 
		return resul;
	}

	public static void main(String[] args) {
		
		System.out.println("Ejercicio con variables");
		System.out.println("Enteros:");
		
		System.out.println("int "+ Integer.BYTES +" bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		
		System.out.println("byte " + Byte.BYTES + " bytes enteros " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		
		System.out.println("short " + Short.BYTES + " bytes enteros " + Short.MIN_VALUE + " "+ Short.MAX_VALUE);
		
		System.out.println("long " + Long.BYTES  + " bytes enteros " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
		
		System.out.println("Reales: ");
		
		System.out.println("float " + Float.BYTES + " bytes enteros " + Float.MIN_VALUE + " " + Float.MAX_VALUE );
		
		
		float sueldoMesGerman = 1200.25f;
		
		System.out.println("German cobra : " + sueldoMesGerman);
		
		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("Sueldo " + sSueldoGerman);
		
		double sueldazo = 12000.04d;
		System.out.println("Este es mi nuevo sueldazo : " + String.valueOf(sueldazo).replace('.', ','));
		
		
		System.out.println("3.Booleanas : ");
		
		boolean encontrado = false; 
		System.out.println("Esto es falso --> " + encontrado);
		
		System.out.println("4.Caracteres :");
		
		char caracter = 'k';
		System.out.println("Este es un caracter --> " + caracter);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("   " + " DIGITO " + " LETRA " + " MAYUSCULA " + " MINUSCULA ");
		System.out.println(" a " + " " + Character.isDigit('a') + " " + Character.isLetter('a') + " " + Character.isUpperCase('a') + " " + Character.isLowerCase('a'));
		System.out.println(" F " + " " +Character.isDigit('F') + " " + Character.isLetter('F') + " " + Character.isUpperCase('F') + " " + Character.isLowerCase('F'));
		System.out.println(" 3 " + " " + Character.isDigit('3') + " " + Character.isLetter('3') + " " + Character.isUpperCase('3') + " " + Character.isLowerCase('3'));
		System.out.println(" j " + " " + Character.isDigit('j') + " " + Character.isLetter('j') + " " + Character.isUpperCase('j') + " " + Character.isLowerCase('j'));
		
		
		char[] chars =  {'a','F','3','j'};
		System.out.println("   " + " DIGITO " + " LETRA " + " MAYUSCULA " + " MINUSCULA ");
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + "   " + 
								dameSimbolo(Character.isDigit(chars[i])) + "      " + 
								dameSimbolo(Character.isLetter(chars[i])) + "       " +
								dameSimbolo(Character.isUpperCase(chars[i])) + "       " +
								dameSimbolo(Character.isLowerCase(chars[i])) + "       ");
		}
		
	}

}

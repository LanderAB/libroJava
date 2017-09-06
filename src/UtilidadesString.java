
public class UtilidadesString {

	/**
	 * Cuenta las palabras que esten contenidas dentro del texto, incluidas dentro
	 * de una misma palabra
	 * 
	 * @param texto
	 *            String donde buscar las palabras
	 * @param busqueda
	 *            String palabra que buscamos dentro del texto
	 * @return int, 0 sino encuentra, numero de palabras encontradas
	 */
	 static int buscarPalabra(String texto, String busqueda) {
		int resul = 0;
		if (texto == null || busqueda == null) {
			resul = 0;
		} else {
			int j = 2;
			while (j < texto.length()) {
				if (busqueda.equals(texto.substring(j - 2, j))) {
					resul++;
				}
				j++;
			}

		}
		return resul;
	}

}

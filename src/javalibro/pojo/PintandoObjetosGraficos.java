package javalibro.pojo;

import javalibro.pojo.interfaces.Vendible;

public class PintandoObjetosGraficos {

	public static void main(String[] args) {

		//una clase abstracta no se puede instanciar
		//ObjetoGrafico obj = new ObjetoGrafico();
		
		//Una interfaz tampoco se puede instanciar
		//Vendible v = new Vendible();
		
		Circulo c = new Circulo();
		c.dibujar();
		c.mover(12, 0);
		
		LineaColor lc = new LineaColor();
		lc.color = "rojo";
		lc.longitud = 56;
		lc.mover(99, -12); // metodo ObjetoG>rafico
		lc.dibujar(); // metodo abstracto ObjetoGrafico

	}

}

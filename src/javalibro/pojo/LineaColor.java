package javalibro.pojo;

public class LineaColor extends Linea{
	
	String color;
	
	@Override
	void dibujar() {
		System.out.println("Soy una linea de color : "  + color + " con una longitud de " + longitud);
	}

}

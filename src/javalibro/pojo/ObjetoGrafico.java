package javalibro.pojo;
/**
 * Una clase abstracta puede contener codigo implementado, pero tiene algún método sin implementar (abstract)
 * Es algo intermedio entre Class e Interface
 * No puede instanciar objetos, pero de una interfaz si se puede. 
 * Las clases hijas deben implementar los métodos abstractos, o volver a declararlos abstract
 * @author Administrador
 *
 */
public abstract class ObjetoGrafico {
	
	int x;
	int y;
	
	void mover(int xPos, int yPos) {
		this.x = xPos;
		this.y = yPos;
	}
	
	abstract void dibujar();

}

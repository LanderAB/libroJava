package javalibro.pojo;

import javalibro.pojo.interfaces.Vendible;

public class LibroPapel extends Libro implements Vendible {

	
	public boolean tapaBlanda;
	public static final float COSTE_TAPA_DURA = 1.5f;
	
	public LibroPapel(String titulo) {
		super(titulo);
		this.tapaBlanda = true;
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return "LibroPapel [tapaBlanda=" + tapaBlanda + "]";
	}
	
	@Override
	public float getPrecio() {
		float incremento = 0;
		if(!this.isTapaBlanda()) {
			incremento = COSTE_TAPA_DURA;
		}
		return super.getPrecio() + incremento;
	}

}

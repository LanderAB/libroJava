package javalibro.pojo;

import javalibro.pojo.interfaces.Imprimible;
import javalibro.pojo.interfaces.Vendible;

public class Libro implements Imprimible, Vendible {

	private String titulo;
	private String autor;
	private int numPaginas;
	
	static final float PRECIO_PAGINA = 0.2f;

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "Anonimo";
		this.numPaginas = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		if(numPaginas < 0) {
			numPaginas = 0;
		}
		this.numPaginas = numPaginas;
	}
	
	protected void metodoProtegido() {
		System.out.println("Soy un metodo protegido");
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}

	void imprimir() {
		System.out.println("Imprimiendo...");
	}

	public float getPrecio() {
		
		return (float) (this.getNumPaginas() * PRECIO_PAGINA);
	}


}

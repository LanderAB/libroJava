package javalibro.ejercicios;

public class Cancion {
	
	private String titulo;
	private String artista;
	private String duracion;
	
	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}

	public Cancion() {
		super();

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "Titulo= " + titulo + ", artista= " + artista + ", duracion= " + duracion;
	}
	
	
	
	
	
	

}

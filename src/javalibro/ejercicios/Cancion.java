package javalibro.ejercicios;

public class Cancion {
	
	private String titulo;
	private String artista;
	private String duracion;
	private long id;
	
	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.id = -1;
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", id=" + id + "]";
	}

	
	
	
	
	
	

}

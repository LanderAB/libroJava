package javalibro.pojo;

public class Persona {
	private String nombre; 
	private String apellido;
	private String calle;
	private String numero;
	private String email;
	private String dni;
	private String oficio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public Persona(String nombre, String apellido, String calle, String numero, String email, String dni,
			String oficio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.calle = calle;
		this.numero = numero;
		this.email = email;
		this.dni = dni;
		this.oficio = oficio;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellido=" + apellido + ", calle=" + calle + ", numero=" + numero
				+ ", email=" + email + ", dni=" + dni + ", oficio=" + oficio + "]";
	}
	
	
}

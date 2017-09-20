package javalibro.pojo;

import javalibro.excepciones.PersonaException;
import javalibro.utilidades.Validaciones;

public class Persona {
	
	private String nombre; 
	private String apellido;
	private String calle;
	private int edad;
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
	public int getEdad() {
		return edad;
	}
	/**
	 * Setea la edad de la persona
	 * @param edad int años de la persona
	 * @throws PersonaException edad < 18
	 */
	public void setEdad(int edad) throws PersonaException {
		if(edad < 18) {
			throw new PersonaException(PersonaException.MSG_EDAD_MENOR);
		}
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws PersonaException {
		
		if(!Validaciones.email(email)) {
			throw new PersonaException(PersonaException.MSG_EMAIL_ERROR);
		}
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) throws PersonaException {
		
		if(!Validaciones.dni(dni)) {
			throw new PersonaException(PersonaException.MSG_DNI_ERROR);
		}
		this.dni = dni;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public Persona(String nombre, String apellido, String calle, int edad, String email, String dni,
			String oficio) throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.calle = calle;
		//this.edad = edad;
		setEdad(edad);
		//this.email = email;
		setEmail(email);
		//this.dni = dni;
		setDni(dni);
		this.oficio = oficio;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellido=" + apellido + ", calle=" + calle + ", edad=" + edad
				+ ", email=" + email + ", dni=" + dni + ", oficio=" + oficio + "]";
	}
	
	
}

package es.indra.aerolineas.beans.impl;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String id;
	
	public Persona() {
		super();
	}
	
	/**
	 * @return el nombre en mayuscula para el pasajero
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String solicitarInformacion();

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", id=" + id + "]";
	}
	
	
}

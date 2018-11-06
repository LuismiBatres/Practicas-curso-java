/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private int id;
	
	private Vuelo[] vuelos;

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param id
	 * @param vuelos
	 */
	public Pasajero(int id, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.vuelos = vuelos;
	}

	/**
	 * 
	 */
	public Pasajero() {
		super();
	}
	public String getApellido() {
		return apellido.toUpperCase();
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String solicitarInformacion() {
		return "Pasajero";
	}
	
	
}
/**
 * 
 */
package es.indra.aerolineas.beans.impl;
import java.util.List;
/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private int id;
	
	private List<Vuelo> vuelos;

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param id
	 * @param vuelos
	 */
	public Pasajero(int id,  List<Vuelo> vuelos) {
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

	public  List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return id + ";" + nombre + ";" + apellido + ";" + dni;
	}

	@Override
	public String solicitarInformacion() {
		return "Pasajero";
	}
	
	
}
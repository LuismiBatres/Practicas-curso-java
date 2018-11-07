/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author Luismi
 *
 */
public class Billete {
	
	private Persona persona;
	private String Fecha;
	private String Asiento;
	private Vuelo vuelo;
	
	
	public Billete(Persona persona, String fecha, String asiento, Vuelo vuelo) {
		super();
		this.persona = persona;
		Fecha = fecha;
		Asiento = asiento;
		this.vuelo = vuelo;
	}
	
	public Billete() {
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getAsiento() {
		return Asiento;
	}

	public void setAsiento(String asiento) {
		Asiento = asiento;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	@Override
	public String toString() {
		return "Billete [persona=" + persona + ", Fecha=" + Fecha + ", Asiento=" + Asiento + ", vuelo=" + vuelo + "]";
	}

	
}

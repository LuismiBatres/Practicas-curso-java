/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author Luismi
 *
 */
public class Billete {
	
	private int id;
	private Pasajero pasajero;
	private String Fecha;
	private String Asiento;
	private Vuelo vuelo;
	
	
	public Billete(Pasajero pasajero, String fecha, String asiento, Vuelo vuelo) {
		super();
		this.pasajero = pasajero;
		Fecha = fecha;
		Asiento = asiento;
		this.vuelo = vuelo;
	}
	
	public Billete() {
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
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
		return "Billete [persona=" + pasajero + ", Fecha=" + Fecha + ", Asiento=" + Asiento + ", vuelo=" + vuelo + "]";
	}

	
}

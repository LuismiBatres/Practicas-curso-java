package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolineas {
	public void consultarVuelos(String origen);
	public void consultarVuelos(String origen,String destino);
	public void anularVuelos(String...vuelos);
	public Vuelo[] getVuelos();
	public String getNombre();
	
}

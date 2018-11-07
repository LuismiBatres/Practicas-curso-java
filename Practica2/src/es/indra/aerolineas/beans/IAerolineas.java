package es.indra.aerolineas.beans;

import java.io.IOException;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolineas {
	public void consultarVuelos(String origen);
	public void consultarVuelos(String origen,String destino) throws IOException;
	public void anularVuelos(String...vuelos);
	public Vuelo[] getVuelos();
	public String getNombre();
	
}

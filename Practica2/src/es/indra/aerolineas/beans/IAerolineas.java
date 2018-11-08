package es.indra.aerolineas.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Persona;
import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolineas {
	public void consultarVuelos(String origen);
	public void consultarVuelos(String origen,String destino) throws IOException;
	public void anularVuelos(String...vuelos);
	public List<Vuelo> getVuelos();
	public String getNombre();
	void setLista(Map<String, List<Billete>> billetes);
	void verBilletesFecha(String fechaBillete);
}

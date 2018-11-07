package es.indra.aerolineas.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Persona;
import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolineas {
	public void consultarVuelos(String origen);
	public void consultarVuelos(String origen,String destino) throws IOException;
	public void anularVuelos(String...vuelos);
	public Vuelo[] getVuelos();
	public String getNombre();
	public Map<String,ArrayList> cargarHashMap(ArrayList<Billete>billetes,String fecha);
	public void crearBillete(Persona p,String fecha,String asiento,Vuelo vuelo);
	public ArrayList<Billete> getBilletes() ;
}

package es.indra.aerolineas.beans;

public interface IAerolineas {
	public void consultarVuelos(String origen);
	public void consultarVuelos(String origen,String destino);
	public void anularVuelos(String...vuelos);
}

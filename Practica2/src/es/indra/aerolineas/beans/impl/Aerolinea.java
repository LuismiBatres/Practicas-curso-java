/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolineas;
import es.indra.aerolineas.exceptions.ErrorLecturadeVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolineas {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	private ArrayList<Billete> billetes=new ArrayList<Billete>();
	
	
	public ArrayList<Billete> getBilletes() {
		return billetes;
	}

	public void setBilletes(ArrayList<Billete> billetes) {
		this.billetes = billetes;
	}

	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos,ArrayList<Billete>billetes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
		this.billetes=billetes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Aerolinea [id=" + id + ", nombre=" + nombre + ", vuelos=" + Arrays.toString(vuelos) + "]";
	}
	
	@Override
	public void consultarVuelos(String origen) {
		/*boolean existe=false;
		for (int i=0;i<this.vuelos.length;i++) {
			if(this.vuelos[i].getOrigen().equals(origen)) {
				System.out.println(this.vuelos[i].toString());
				existe=true;
			}
		}
		if(existe==false) {
			System.out.println("Origen no valido");
		}*/
		ReadFile r=new ReadFile();
		List<String> lista = new ArrayList<>();
		try {
			lista = r.retornarVuelos();
			if(!lista.isEmpty() && lista !=null) {
				for(String s:lista) {
					System.out.println(s);
				}
			}else {
				System.out.println("No se han encontrado vuelos");
			}
		} catch (ErrorLecturadeVuelosException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public void consultarVuelos(String origen,String destino) throws IOException{
		/*boolean existe=false;
		for (int i=0;i<this.vuelos.length;i++) {
			if(this.vuelos[i].getOrigen().equals(origen) && this.vuelos[i].getDestino().equals(destino)) {
				System.out.println(this.vuelos[i].toString());
				existe=true;
			}
		}
		if(existe==false) {
			System.out.println("Origen o destino no validos");
		}*/
		ReadFile r=new ReadFile();
		List<String>lista=r.retornarVuelos1();
		if(!lista.isEmpty() && lista !=null) {
			for(String s:lista) {
				System.out.println(s);
			}
		}else {
			System.out.println("No se han encontrado vuelos");
		}
	}


	@Override
	public void anularVuelos(String...vuelos) {
		System.out.println("Numeo de vuelos a anular: "+ vuelos.length);
	}
	
	/*public ArrayList<Billete> cargarArrayFechas(){
		Arr
	}*/
	
	public void crearBillete(Persona p,String fecha,String asiento,Vuelo vuelo) {
		Billete b=new Billete(p,fecha,asiento,vuelo);
		this.billetes.add(b);
	}
	
	public Map<String,ArrayList> cargarHashMap(ArrayList<Billete>billetes){
		Map<String,ArrayList> lista= new HashMap<String,ArrayList>();
		ArrayList<Billete>array=new ArrayList<>();
		String fecha;
		for(Billete b: billetes) {
			for(Billete bille:billetes){
				if(b.getFecha().equals(bille.getFecha())){
					array.add(bille);
				}
			}
			
			if(!array.isEmpty()){
				lista.put(b.getFecha(),array);
				array.clear();
			}else{
				System.out.println("Fallo");
			}
			
		}
		
		return lista;
	}

}

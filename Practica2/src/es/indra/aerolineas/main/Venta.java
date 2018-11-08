/**
 * 
 */
package es.indra.aerolineas.main;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import es.indra.aerolineas.beans.*;
import es.indra.aerolineas.beans.impl.*;
import es.indra.aerolineas.services.WriteFile;

/**
 * @author josejarizav
 *
 */
public class Venta {
	
	private static List<Vuelo> creaVuelos() {
		List<Vuelo> vuelos = new ArrayList<>();
		for (int i = 0; i < 100; i++) {	
			int a = new Random().nextInt(500);
			vuelos.add(new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   ));
		}
		return vuelos;
	}
	
	private static List<Billete> generarBilletes(String fecha, Pasajero p){
		List<Billete> billetes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Billete billete = new Billete();
			billete.setId(i);
			billete.setFecha(fecha);
			
			char c1 = (char)new Random().nextInt(50);
			char c2 = (char)new Random().nextInt(50);
			
			billete.setAsiento("" + c1 + c2 + new Random().nextInt(100) + new Random().nextInt(50));
			billete.setPasajero(p);
			billete.setVuelo(p.getVuelos().get(new Random().nextInt(p.getVuelos().size())));
			
			billetes.add(billete);
		}
		
		return billetes;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Vuelo> vuelos = creaVuelos();
		ArrayList<Billete>billete=new ArrayList<>();
		IAerolineas aa = new Aerolinea(10, "American Airlines",vuelos);
		
		ArrayList<Pasajero>pasajeros=new ArrayList<>();
		
		Empleado emp=new Empleado();
		emp.setNombre("Juan Alberto");
		
		Pasajero p = new Pasajero();
		List<Vuelo> vuelosPasajero = new ArrayList<>();
		vuelosPasajero.add(vuelos.get(0));
		vuelosPasajero.add(vuelos.get(4));
		p.setId(10);
		p.setDni("10");
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		
		
		Pasajero p1 = new Pasajero();
		List<Vuelo> vuelosPasajero2 = new ArrayList<>();
		vuelosPasajero.add(vuelos.get(0));
		vuelosPasajero.add(vuelos.get(4));
		p1.setId(12);
		p1.setDni("15");
		p1.setNombre("Luismi");
		p1.setApellido("Sanchez");
		p1.setVuelos(vuelosPasajero2);
		

		Pasajero p3 = new Pasajero();
		List<Vuelo> vuelosPasajero3 = new ArrayList<>();
		vuelosPasajero.add(vuelos.get(0));
		vuelosPasajero.add(vuelos.get(4));
		p3.setId(24);
		p3.setDni("18");
		p3.setNombre("Juan");
		p3.setApellido("Perez");
		p3.setVuelos(vuelosPasajero3);
		
		/*Map<String, List<Billete>> billetesEmitidos = new HashMap<>();
		
		billetesEmitidos.put("08/11/2018", generarBilletes("08/11/2018", p));
		billetesEmitidos.put("01/01/2019", generarBilletes("01/01/2019", p));
		
		aa.setLista(billetesEmitidos);
		
		aa.verBilletesFecha("08/11/2018");*/
		
		
		pasajeros.add(p1);
		pasajeros.add(p);
		pasajeros.add(p3);
		
		
		WriteFile wr=new WriteFile();
		wr.escribirPasajeros(pasajeros);
		
		/*aa.consultarVuelos("MAD");
		p.id=10;
		p.dni="1050K";
		p.nombre="Jose Julian";
		p.apellido="Ariza";
		p.vuelos=vuelosPasajero;
		
		
		
		//aa.consultarVuelos("VLC");
		//consultar1(aa,"NAR");
		System.out.println("***************************************");
		aa.anularVuelos();
		aa.anularVuelos("hola");
		aa.anularVuelos("hola","vuelos");
		//anular(aa);
		System.out.println("***************************************");
		
		try {
			aa.consultarVuelos("MAD", "NAR");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//consultar2(aa, "MAD","VLC");
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		//System.out.println("|\tBienvenidos a aerolineas ".concat(aa.nombre));
		
		System.out.println("|\tLe atiende ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		//System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.vuelos.length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),p.getVuelos().length );
		//System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.nombre,p.vuelos.length );
		
		System.out.println("*************************************************************************");
		
		System.out.println(p.solicitarInformacion());
		System.out.println("*************************");
		System.out.println(emp.solicitarInformacion());*/

	}

	public static void anular(IAerolineas a) {
		a.anularVuelos("asas","hola");
	}
		
	public static void consultar1(IAerolineas a,String origen) {
		a.consultarVuelos(origen);
	}
	
	/*public static void consultar2(IAerolineas a,String origen,String destino) {
		a.consultarVuelos(origen, destino);
	}*/
}

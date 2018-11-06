/**
 * 
 */
package es.indra.aerolineas.main;
import es.indra.aerolineas.beans.*;
import es.indra.aerolineas.beans.impl.*;

/**
 * @author josejarizav
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		Aerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		Empleado emp=new Empleado();
		emp.setNombre("Juan Alberto");
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		/*p.id=10;
		p.dni="1050K";
		p.nombre="Jose Julian";
		p.apellido="Ariza";
		p.vuelos=vuelosPasajero;*/
		
		p.setId(10);
		p.setDni("10");
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		//aa.consultarVuelos("VLC");
		consultar1(aa,"NAR");
		System.out.println("***************************************");
		/*aa.anularVuelos();
		aa.anularVuelos("hola");
		aa.anularVuelos("hola","vuelos");*/
		anular(aa);
		System.out.println("***************************************");
		
		//aa.consultarVuelos("MAD", "NAR");
		consultar2(aa, "MAD","VLC");
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
		System.out.println(emp.solicitarInformacion());

	}

	public static void anular(IAerolineas a) {
		a.anularVuelos("asas","hola");
	}
		
	public static void consultar1(IAerolineas a,String origen) {
		a.consultarVuelos(origen);
	}
	
	public static void consultar2(IAerolineas a,String origen,String destino) {
		a.consultarVuelos(origen, destino);
	}
}

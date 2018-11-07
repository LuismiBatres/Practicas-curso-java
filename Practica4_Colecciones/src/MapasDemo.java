import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapasDemo {

	
	public static void main(String[] args) {
		Map<String, String> estudiantes=new HashMap<>();
		
		estudiantes.put("Batres", "Luismi");
		estudiantes.put("Perez", "Jorge");
		estudiantes.put("Gonzalez", "Andres");
		
		String prueba="hola";
		
		System.out.println("Tamaño: "+ estudiantes.size());
		
		for(Map.Entry<String, String> elemento: estudiantes.entrySet()) {
			System.out.println("Key: "+elemento.getKey() + " Value: "+ elemento.getValue());
		}
			
		
	}

}

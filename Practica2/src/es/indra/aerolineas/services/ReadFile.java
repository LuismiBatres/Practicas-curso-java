/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luismi	
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() {
		Path path= Paths.get("C:/Users/aula3/repositorios/Luismi/Practicas-curso-java/vuelos1.txt");
		//Path path =Paths.get("C:/Users/aula3/repositorios/CursoJava/vuelos1.txt");
		List<String>lista=new ArrayList<String>();
		try {
			lista=Files.readAllLines(path);
			//System.out.println(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finalizada lectura de archivos");
		}
		return lista;
	}
	
	public static void main(String[] args) {
		ReadFile r= new ReadFile();
		r.retornarVuelos();
	}
}

/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Luismi	
 *
 */
public class ReadFile {
	
	public void retornarVuelos() {
		Path path= Paths.get("C:/Users/aula2/repositorios/CursoJava/vuelos.txt");
		//Path path =Paths.get("C:/Users/aula2/repositorios/CursoJava/vuelos1.txt");
		try {
			List<String>lista=Files.readAllLines(path);
			System.out.println(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadFile r= new ReadFile();
		r.retornarVuelos();
	}
}

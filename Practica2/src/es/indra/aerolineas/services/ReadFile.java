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

import es.indra.aerolineas.exceptions.ErrorLecturadeVuelosException;

/**
 * @author Luismi	
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() throws ErrorLecturadeVuelosException {
		Path path= Paths.get("C:/Users/aula3/repositorios/Luismi/Practicas-curso-java/vuelos.txt");
		//Path path =Paths.get("C:/Users/aula3/repositorios/CursoJava/vuelos1.txt");
		List<String>lista=new ArrayList<String>();
		try {
			lista=Files.readAllLines(path);
			//System.out.println(lista);
		} catch (IOException e) {
			throw new ErrorLecturadeVuelosException("Fallo leyendo archivo",e);
		}finally {
			System.out.println("Finalizada lectura de archivos");
		}
		return lista;
	}
	
	public List<String> retornarVuelos1() throws IOException{
		Path path= Paths.get("C:/Users/aula3/repositorios/Luismi/Practicas-curso-java/vuelo.txt");
		//Path path =Paths.get("C:/Users/aula3/repositorios/CursoJava/vuelos1.txt");
		List<String>lista=new ArrayList<String>();
		lista=Files.readAllLines(path);
		//System.out.println(lista);
		return lista;
	}
	
}

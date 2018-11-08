package es.indra.aerolineas.services;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import es.indra.aerolineas.beans.impl.Pasajero;

public class WriteFile {
	
	public void escribirPasajeros(ArrayList<Pasajero>array) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fichero_pasajeros.txt"), "UTF-8"));
			//out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/aula10/repositorios/fichero_pasajeros.txt"), "UTF-8"));
			// Escribimos linea a linea en el fichero
			System.out.println("Inicio de escritura");
			for (Pasajero p : array) {
				try {
					out.write(p.toString());
					out.newLine();
				} catch (IOException ex) {
					System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
				}
			}

		} catch (UnsupportedEncodingException | FileNotFoundException ex2) {
			System.out.println("Mensaje error 2: " + ex2.getMessage());
		} finally {
			try {
				out.close();
				System.out.println("Escritura finalizada");
			} catch (IOException ex3) {
				System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
			}
		}
	}
}

package es.indra.practica1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaDatosConsola {
	
	public static void escribirScanner() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un mensaje");
		String mensaje=sc.nextLine();
		
		System.out.println("Introduce el numero de veces que quieres que aparezca");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(mensaje);
		}
	}
	
	public static void escribirInputStreamReader() {
		InputStreamReader cin = null;
		try {
				cin = new InputStreamReader(System.in);
				System.out.println("Ingrese texto!, 'q' para salir.");
				char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			} while(c != 'q');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		if (cin != null) {
		try {
			cin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			}
		}
	}
	
	public static void main(String[] margs) {
		escribirScanner();
	}
}

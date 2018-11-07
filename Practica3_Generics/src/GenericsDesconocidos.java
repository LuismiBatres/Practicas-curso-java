import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDesconocidos {
	
	public static void main(String[] args) {
		List<Integer> listado= new ArrayList<>();
		
		listado.add(35);
		listado.add(18);
		
		List<? extends Number> listadoDesconocido=new ArrayList<>();
		
		/*listadoDesconocido.add(new Integer(15));
		listadoDesconocido.add(new Integer(1),null);
		for(Number n: listadoDesconocido) {
			System.out.println(n);
		}*/
		
		ArrayList<Integer> listadoInteger=new ArrayList<>();
		listadoInteger.add(12);
		listadoInteger.add(15);
		listadoInteger.add(88);
		listadoInteger.add(100);
		//listadoInteger.add(15d);
		
		
		for(int i=0;i<listadoInteger.size();i++) {
			System.out.println(listadoInteger.get(i));
		}
		
	} 

}
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static List<Integer> cargaArrayList(){
		List<Integer>lista=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++) {
			lista.add(i*2);
		}
		return lista;
	}

	public static void main(String[] args) {
		List<Integer>listaGenerada=cargaArrayList();
		
		System.out.println(listaGenerada.size());
		
		for(int elemento:listaGenerada) {
			System.out.println("Elemento: " + elemento);
		}
		
		System.out.println(listaGenerada.get(0));
		
		if (listaGenerada.contains(50)){
			System.out.println("Contiene el elemento 50");
		}
		
		if(!listaGenerada.isEmpty()) {
			listaGenerada.clear();
		}
		
		System.out.println("Tama�o actual de la lista: "+ listaGenerada.size());
	}

}

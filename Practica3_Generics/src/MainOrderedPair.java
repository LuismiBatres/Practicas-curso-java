public class MainOrderedPair {

	public static void main(String[] args) {
		Pair<Integer,String>p1=new OrderedPair<>(10,"amarillo");
		System.out.println("Clave:"+p1.getKey() + " Valor:"+p1.getValue());
		System.out.println(p1.getKey().getClass().getName());

		
		Pair<Integer,String>p2=new OrderedPair<>(2,"verde");
		System.out.println("Clave:"+p2.getKey() + " Valor:"+p2.getValue() );
		System.out.println(p2.getKey().getClass().getName());

		
		Pair<String,Integer>p3=new OrderedPair<>("Azul",3);
		System.out.println("Clave:"+p3.getKey() + " Valor:"+p3.getValue() );
		System.out.println(p3.getKey().getClass().getName());

		Pair<Float,Integer>p4=new OrderedPair<>(10.25f,3);
		System.out.println("Clave:"+p4.getKey() + " Valor:"+p4.getValue() );
		System.out.println(p4.getKey().getClass().getName());

	}

}

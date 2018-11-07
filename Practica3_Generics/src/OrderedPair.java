
public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<Integer,String>p1=new OrderedPair<>(1,"rojo");
		System.out.println("Clave:"+p1.getKey() + " Valor:"+p1.getValue() );
		
		Pair<Integer,String>p2=new OrderedPair<>(2,"verde");
		System.out.println("Clave:"+p2.getKey() + " Valor:"+p2.getValue() );
		
		Pair<String,Integer>p3=new OrderedPair<>("Azul",3);
		System.out.println("Clave:"+p3.getKey() + " Valor:"+p3.getValue() );
	}

}

public class Limite<T> {

	private T t;
		
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		Limite<Integer>caja1=new Limite<>();
		caja1.set(34);
		System.out.println(caja1.get());
		
		Limite<String>caja2=new Limite<>();
		caja2.set("Hola");
		System.out.println(caja2.get());
	}
}

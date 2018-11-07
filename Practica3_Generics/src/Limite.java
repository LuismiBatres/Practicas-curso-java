
public class Limite<T> {

	private T t;
		
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		Limite<Integer>caja1=new Limite<Integer>();
		Limite<Integer>caja2=new Limite<>();
	}
}

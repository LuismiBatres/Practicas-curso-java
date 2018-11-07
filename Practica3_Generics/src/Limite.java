public class Limite<T> {

	private T t;
		
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public <U extends Number> void revision(U u){
		 System.out.println("T: " + t.getClass().getName());
	}
		
	
	public static void main(String[] args) {
		Limite<Integer>caja1=new Limite<>();
		caja1.set(34);
		System.out.println(caja1.get());
		caja1.revision(34);
		
		Limite<Double>caja2=new Limite<>();
		caja2.set(25d);
		System.out.println(caja2.get());
		caja2.revision(28d);
		
		/*Limite<String> obj = new Limite<>();
		obj.set("CadenaEjemplo");
		obj.revision("Cadena ejemplo"); // error!!*/
	}
}

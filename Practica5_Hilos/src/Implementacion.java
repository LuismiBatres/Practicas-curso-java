
public class Implementacion implements Runnable {

	@Override
	public void run() {
		System.out.println("Dentro del runnable");
	}
	
	public static void main(String[]args) {
		Implementacion i=new Implementacion();
		i.run();
	}

}

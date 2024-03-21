import java.util.LinkedList;
import java.util.Queue;

public class ejercicio4 {
	public static void main(String[] args) {

		Queue<String> juegos = new LinkedList<String>();

		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipun");
		juegos.add("Pillarse");

		System.out.println("La cantidad de juegos es: " + juegos.size() + " y los juegos eran" + juegos);
	}
}

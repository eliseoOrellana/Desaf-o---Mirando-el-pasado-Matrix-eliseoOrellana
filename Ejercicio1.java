import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Tazos");
		marcas.add("Chester");
		marcas.add("Kegol");
		marcas.add("Gatolate");
		marcas.add("Kapo");
		marcas.add("Negrita");
		marcas.add("Baltiloca");
		marcas.add("Media hora");
		marcas.add("Calugon Pelayo");
		marcas.add("Cocacola");

		System.out.println(marcas);

		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		// �Blokbaster�, �Carrefour� y �Jetix�.

		System.out.println(marcas);
		marcas.set(10, "Blockbuster"); // modificar
		System.out.println(marcas);

		boolean valor = marcas.remove("Carrefour");
		System.out.println(valor);
		System.out.println(marcas);

		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Palm");
		posiblesMarcas.add("Dos Caballos");
		posiblesMarcas.add("BlackBerry");
		posiblesMarcas.add("Nokia");

		marcas.addAll(posiblesMarcas);

		System.out.println("Cantidad de elementos de la lista es: " + marcas.size());
	}
}

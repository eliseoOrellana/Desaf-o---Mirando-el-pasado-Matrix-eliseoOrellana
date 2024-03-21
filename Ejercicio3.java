import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {

		Map<String, Integer> golosinas = new TreeMap();

		golosinas.put("chocman", 100);
		golosinas.put("Trululu", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tableton", 5);

		System.out.println(golosinas);

		// golosinas.entrySet().stream().filter(x -> x.getValue() <
		// 100).forEach(System.out::println);

		for (Map.Entry<String, Integer> cosa : golosinas.entrySet()) {
			if (cosa.getValue() < 100) {
				System.out.println(cosa.getKey() + " con valor " + cosa.getValue());
			}
		}

	}

}

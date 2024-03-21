import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> invitados = new TreeSet<String>();
		invitados.add("Daniel"); // “Daniel”, “Paola”, “Facundo”, “Pedro”, ”Jacinta”, “Florencia” y “Juan Pablo”.
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro"); // treeset orden alfabetico
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("juan Pablo");

		Set<String> posiblesInvitados = new TreeSet<String>();
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Fracisco");
		posiblesInvitados.add("Marcos");
		invitados.addAll(posiblesInvitados);
		System.out.println(invitados);

		invitados.remove("Jorge");

		System.out.println("El listado final de invitados: " + invitados);

	}

}

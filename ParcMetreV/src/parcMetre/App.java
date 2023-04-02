package parcMetre;
import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.of(2023, 3, 2, 18, 0);
		Voiture v = new Voiture("AX-141-XD");
		Parcmetre parc = new Parcmetre(v, 3.0, now);
		Ticket ticket = new Ticket(parc);
		Imprimante imprimante = new Imprimante();
		imprimante.imprimer(ticket);
	}
}
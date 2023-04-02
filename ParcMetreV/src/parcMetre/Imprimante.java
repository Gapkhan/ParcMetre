package parcMetre;
public class Imprimante {

	public Imprimante() {
		
	}
	
	public void imprimer(Ticket ticket) {
		System.out.println("impression du ticket \n\n" + ticket.text() + "\nBonne soiree");
	}
}
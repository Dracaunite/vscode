package ag56.tests;

import ag56.modele.Client;
import ag56.utils.AffichageModele;

public class ClientTest {

	public static void main(String[] args) {
		Client dujardin;
		dujardin = new Client("P1", "Dujardin", "Jean", "10 rue des Lilas", "56100", "Lorient", "France", "02 97 04 36 10");
		dujardin.incrementerNbVoyages();
		dujardin.incrementerNbVoyages();
		dujardin.incrementerNbVoyages();
		AffichageModele.afficher(dujardin);
	}
}

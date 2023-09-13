package sec.tests;

import sec.modele.Client;
import sec.utils.AffichageModele;

public class ClientTest {

	public static void main(String[] args) {
		// Création d'une instance de Client
		Client unClient = new Client("C01", "Truel", "Jacky", "3 rue des Travailleurs", "56400", "Lanester", "06 04 56 95 75", "jacky.truel.pro@gmail.com");
		
		AffichageModele.afficherClient(unClient);
	}

}

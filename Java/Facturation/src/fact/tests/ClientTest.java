package fact.tests;

import fact.utils.AffichageModele;
import fact.modele.Client;

public class ClientTest {
	public static void main(String[] args) {
		Client unClient = new Client("000001", "Dupont", "Louis", "adresseClient", "villeClient",
				"cpClient", "Louis.Dupont@societe.fr", "02 97 02 97 02");
		AffichageModele.afficherClient(unClient);
	}
}

/*
 * Créé le 29 dec. 2011
 * Auteur Thieblemont Isabelle
 * Modifié le 31 jan. 2012
 */
package ag56.tests;

import ag56.modele.Personne;
import ag56.utils.AffichageModele;

public class PersonneTest {

	public static void main(String[] args) {
		Personne dujardin;
		dujardin = new Personne("P1", "Dujardin", "Jean", "10 rue des Lilas", "56100", "Lorient", "France", "02 97 04 36 10");
		AffichageModele.afficher(dujardin);
	}
	


}

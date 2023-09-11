/*
 * Créé le 31 jan. 2012
 * Auteur Thieblemont Isabelle
 * Modifié le 10/01/2015
 */
package ag56.tests;

import ag56.modele.Pays;
import ag56.modele.Guide;
import ag56.utils.AffichageModele;

public class GuideTest {

	public static void main(String[] args) {
		Pays turquie;
		turquie = new Pays("TU1","Turquie", "carte nationalité d'identité ou le passeport","pas de vaccin obligatoire","médicaments de base"); // instanciation d'un objet Pays
		Guide martin = new Guide("G1", "Martin", "Nicolas", "30 rue Gal Leclerc", "56100", "Lorient", "France", "02 97 31 36 78","Guide touristique moyenne montagne" ,turquie, 60);
		martin.setPrimeJournaliere(80);
		martin.augmenterPrime(10);
		AffichageModele.afficher(martin);
	}
	
}

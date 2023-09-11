/*
 * Cr�� le 31 jan. 2012
 * Auteur Thieblemont Isabelle
 * Modifi� le 10/01/2015
 */
package ag56.tests;

import ag56.modele.Pays;
import ag56.utils.AffichageModele;

public class PaysTest {

	public static void main(String[] args) { // obligatoire pour que la classe puisse �tre ex�cutable
		Pays maroc;  // d�claration d'un objet Pays : maroc
		maroc = new Pays(); // instanciation d'un objet Pays : attributs non valoris�s
		Pays turquie;
		turquie = new Pays("TU1","Turquie", "carte nationalit� d'identit� ou le passeport","pas de vaccin obligatoire","m�dicaments de base"); // instanciation d'un objet Pays
		AffichageModele.afficher(turquie);
		maroc.setCodePays("MA1");  // affectation d�une code � la Pays maroc
		maroc.setLibPays("Maroc"); // affectation d�un libell� � la Pays maroc
		maroc.setFormalites("passeport");
		maroc.setVaccins("pas de vaccin obligatoire");
		maroc.setConseils("m�dicaments de base");
		AffichageModele.afficher(maroc);
	}

}

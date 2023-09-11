/*
 * Créé le 31 jan. 2012
 * Auteur Thieblemont Isabelle
 * Modifié le 10/01/2015
 */
package ag56.tests;

import ag56.modele.Pays;
import ag56.utils.AffichageModele;

public class PaysTest {

	public static void main(String[] args) { // obligatoire pour que la classe puisse être exécutable
		Pays maroc;  // déclaration d'un objet Pays : maroc
		maroc = new Pays(); // instanciation d'un objet Pays : attributs non valorisés
		Pays turquie;
		turquie = new Pays("TU1","Turquie", "carte nationalité d'identité ou le passeport","pas de vaccin obligatoire","médicaments de base"); // instanciation d'un objet Pays
		AffichageModele.afficher(turquie);
		maroc.setCodePays("MA1");  // affectation d’une code à la Pays maroc
		maroc.setLibPays("Maroc"); // affectation d’un libellé à la Pays maroc
		maroc.setFormalites("passeport");
		maroc.setVaccins("pas de vaccin obligatoire");
		maroc.setConseils("médicaments de base");
		AffichageModele.afficher(maroc);
	}

}

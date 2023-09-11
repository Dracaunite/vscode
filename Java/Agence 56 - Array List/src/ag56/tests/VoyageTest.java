/*
 * Créé le 31 jan. 2012
 * Auteur Thieblemont Isabelle
 * Modifié le 10/01/2015
 */

package ag56.tests;

import ag56.modele.Pays;
import ag56.modele.Guide;
import ag56.modele.Voyage;
import ag56.utils.AffichageModele;

public class VoyageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instanciation des Payss et opérations sur les Pays
		Pays maroc;
		Pays turquie;
		maroc = new Pays(); // instanciation d'un objet Pays : attributs non valorisés
		turquie = new Pays("TUR","Turquie", "carte nationalité d'identité ou le passeport","pas de vaccin obligatoire","médicaments de base"); // instanciation d'un objet Pays
		maroc.setCodePays("MAR");
		maroc.setLibPays("Maroc");
		maroc.setFormalites("passeport");
		maroc.setVaccins("pas de vaccin obligatoire");
		maroc.setConseils("médicaments de base");
		
		Guide martin = new Guide("G1", "Martin", "Nicolas", "30 rue Gal Leclerc", "56100", "Lorient", "France", "02 97 31 36 78","Guide touristique moyenne montagne" ,turquie, 60);
		Guide renaud = new Guide("G2", "Renaud", "Louis", "10 rue des ormes", "56270", "Ploemeur", "France", "02 97 88 99 66","Guide touristique moyenne montagne" ,maroc, 60);
		
		// instanciation des voyages
		//String codeVoyage, String libVoyage, String dateDebut,String dateFin, int nbPlaces,Pays laPays
		Voyage essaouira=new Voyage("MA1","Détente à Essaouira","08/03/2012","15/03/2012",30, maroc);
		essaouira.setLeGuide(renaud);
		Voyage cappadoce=new Voyage("TUR1","Tour Cappadoce","01/03/2012","08/03/2012",15,turquie);
		cappadoce.setLeGuide(martin);
		
		// opérations sur les voyages
		cappadoce.ajouterInscrits(10);
		cappadoce.retirerInscrits(5);
		AffichageModele.afficher(cappadoce);
		System.out.println("--------------------------------------------------");
		essaouira.ajouterInscrits(20);
		essaouira.retirerInscrits(10);
		AffichageModele.afficher(essaouira);
		System.out.println("--------------------------------------------------");
	}

}

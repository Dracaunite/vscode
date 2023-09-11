package ag56.tests;

import java.util.ArrayList;

import ag56.modele.Pays;
import ag56.modele.Guide;
import ag56.modele.Randonnee;
import ag56.modele.Randonneur;

import ag56.utils.AffichageModele;

public class RandonneeTest {
	public static void main(String[] args) {
		Pays maroc;
		Pays turquie;
		maroc = new Pays();
		turquie = new Pays("TUR", "Turquie", "carte nationalité d'identité ou le passeport", "pas de vaccin obligatoire", "médicaments de base");
		ArrayList<Randonnee> colRando = new ArrayList<Randonnee> ();
		
		maroc.setCodePays("MAR");
		maroc.setLibPays("Maroc");
		maroc.setFormalites("Passeport");
		maroc.setVaccins("Pas de vaccin obligatoire");
		maroc.setConseils("Médicaments de base");
		
		Randonneur dujardin;
		dujardin = new Randonneur("P1", "Dujardin", "Jean", "10 rue des Lilas", "56100", "Lorient", "France", "02 97 04 36 10");
		dujardin.incrementerNbVoyages();
		dujardin.setDenivelePositiveParJour(500);
		dujardin.setNbHeureMarcheMoyenParJour(8);
		dujardin.setNbKmMoyenParJour(15);
		AffichageModele.afficher(dujardin);
		
		Randonneur martin;
		martin = new Randonneur("P2", "Martin", "Nicolas", "60 rue des Thermes", "56000", "Vannes", "France", "02 97 64 11 12");
		martin.setDenivelePositiveParJour(300);
		martin.setNbHeureMarcheMoyenParJour(8);
		martin.setNbKmMoyenParJour(9);
		AffichageModele.afficher(martin);
		
		Randonneur jules;
		jules = new Randonneur("P3", "jules", "Montini", "10 rue des Fleurs", "56100", "Lorient", "France", "02 97 84 65 32");
		jules.setDenivelePositiveParJour(200);
		jules.setNbHeureMarcheMoyenParJour(7);
		jules.setNbKmMoyenParJour(10);
		AffichageModele.afficher(jules);
		
		Randonneur justine;
		justine = new Randonneur("P4", "Justine", "Boulier", "18 rue des Accacia", "29100", "Brest", "France", "02 97 54 85 12");
		justine.setDenivelePositiveParJour(600);
		justine.setNbHeureMarcheMoyenParJour(10);
		justine.setNbKmMoyenParJour(18);
		AffichageModele.afficher(justine);
		
		// instanciation des randonnées
		Randonnee essaouira = new Randonnee("MA1", "Détente d'Essaouira",
				"08/03/2012", "15/03/2012", 30, maroc, dujardin, 5);
		AffichageModele.afficher(essaouira);
		
		Randonnee cappadoce = new Randonnee("TUR1", "Tour de la Cappadoce",
				"01/03/2012", "08/03/2012", 15, turquie, martin, 3);
		AffichageModele.afficher(cappadoce);
		
		Randonnee marrakech = new Randonnee("MA2", "Visite de Marrakech",
				"24/08/2015", "31/08/2015", 20, maroc, jules, 6);
		AffichageModele.afficher(marrakech);
		
		Randonnee istanbul = new Randonnee("TUR2", "Promenade à Istanbul",
				"22/04/2017", "29/04/2017", 40, turquie, justine, 10);
		AffichageModele.afficher(istanbul);
		
		// Ajout des randonneurs dans la collection
		essaouira.ajouterRandonneur(dujardin);
		cappadoce.ajouterRandonneur(martin);
		marrakech.ajouterRandonneur(jules);
		istanbul.ajouterRandonneur(justine);
		
		//  Vérifier si un randonneur existe dans la collection et afficher à quel index il se trouve dans la collection
		
	}
}
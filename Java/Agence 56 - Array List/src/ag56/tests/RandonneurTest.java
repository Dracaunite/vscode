/*
 * Cr�� le 31 jan. 2012
 * Auteur Thieblemont Isabelle
 * Modifi� le 
 */
package ag56.tests;

import ag56.modele.Randonneur;
import ag56.utils.AffichageModele;

public class RandonneurTest {

	public static void main(String[] args) {
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
	}
}
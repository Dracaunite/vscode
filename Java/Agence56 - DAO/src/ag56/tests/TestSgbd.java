package ag56.tests;

import java.util.ArrayList;

import ag56.modele.Pays;
import ag56.modele.dao.*;
import ag56.utils.AffichageModele;


public class TestSgbd {

	public static void main(String[] args) {
		
		//tests sans curseur avec des méthodes spécifiques pour chaque requête
		// Sélection d'un Pays en fonction de son code
		Pays australie = PaysDao.rechercher("AUS");
		AffichageModele.afficher(australie);
		
		//Pays unNouveauPays = new Pays("MAD", "Madagascar", "Passeport validité 6 mois après date retour", "neant", "Traitement anti-pludisme");
		
		// TEST SELECTION D'UN GUIDE EN FONCTION DE SON CODE
		GuideDao.rechercher("G0007");
		
		// TEST SELECTION D'UN VOYAGE EN FONCTION DE SON CODE
		VoyageDao.rechercher("NOR002");
		
		// Sélection de tous les Pays
		ArrayList<Pays> desPays = new ArrayList<Pays>();
		desPays.addAll(PaysDao.retournerLesPays());
		
		// Boucle
	}
}

package sec.tests;

import sec.modele.Tache;
import sec.utils.AffichageModele;
import sec.modele.Employe;

public class TacheTest {

	public static void main(String[] args) {
		// Création d'un developpeur
		Employe unEmploye = new Employe("E02", "David", "Johnson", "david.johnson01@gmail.com", "06 05 65 94 82", "10 Mars 2018", "Développeur");
		
		// Création d'une tâche
		Tache uneTache = new Tache(1, "Relier la BDD au site web", "Utilisation du langage PHP", "13 Septembre 2023", unEmploye);
	
		AffichageModele.afficherTache(uneTache);
	}
}

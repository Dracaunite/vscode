package sec.tests;

import sec.modele.Affaire;
import sec.modele.Employe;
import sec.modele.Tache;
import sec.utils.AffichageModele;
import sec.modele.Client;

public class AffaireTest {

	public static void main(String[] args) {

		// une Tache est suivie par une Developpeur, il faut donc en instancier avant d'instancier chaque Tache

		Employe unDeveloppeur1 = new Employe("nomDev1", "prenomDev1", "emailDev1", "02 97 44 33 22", "matriculeDev1", "01/09/2011", "Developpeur");
		
		Tache uneTache1 = new Tache(1, "nom1", "specification Technique1", "date Limite Realisation1", unDeveloppeur1);
		
		Employe unDeveloppeur2 = new Employe("nomDev2", "prenomDev2", "emailDev2", "02 97 44 33 22", "matriculeDev2", "01/09/2011", "Developpeur");
		
		Tache uneTache2 = new Tache(2, "nom2", "specification Technique2", "date Limite Realisation2", unDeveloppeur2);

		Tache uneTache3 = new Tache(3, "nom3", "specification Technique3", "date Limite Realisation3", unDeveloppeur2);

		// une Affaire est suivie par une Chef de projet,  il faut donc en instancier avant d�instancier une Affaire
		Employe unChefDeProjet = new Employe("nomChefProjet", "prenomChefProjet", "emailChefProjet", "telChefProjet", "matriculeChefProjet", "03/09/2001", "Chef de projet");

		// une Affaire concerne un Client,  il faut donc en instancier avant d'instancier une Affaire
		Client unClient = new Client("LOR00001", "Dupont", "Julien", "3 rue des Travailleurs", "56400", "Lanester", "02 97 09 55 44", "julien.dupont@orange.fr");
		
		// instanciation d'une nouvelle affaire
		Affaire uneAffaire = new Affaire(1,"nomAffaire", "02/20.2011", "code Etat", unClient, unChefDeProjet);
		
		// insertion des taches, pour un jeu d'essai significatif, il faut insérer plusieurs Tache dans la collection
		// cela permettra d'effectuer des tests plus fonctionnels
		uneAffaire.ajouterTache(uneTache1);
		uneAffaire.ajouterTache(uneTache2);
		uneAffaire.ajouterTache(uneTache3);
		
		// affichage des données concernant une affaire : numero, nom, descriptif, dateAffaire, codeEtat, 
		// données du client et du chef de projet
		AffichageModele.afficherAffaire(uneAffaire);
		
		// pour atteindre directement la collection on peut utiliser la méthode getLesTaches
		System.out.println("Nombre de tâches : " + uneAffaire.getLesTaches().size());
		
		// parcours la collection lesTaches et affiche les renseignements concernant chaque Tache
		for(Tache uneTache : uneAffaire.getLesTaches()) {
			System.out.println("Tâche : " + uneTache.getNumero());;
		}

		// test de la méthode retournerIndexTache --------------------------------------------------------------------
		// 2 tests sont à envisager, car 2 cas sont possibles
		System.out.println("--------------test retournerIndexTache---------------------------");
		// cas 1 : la Tache existe dans la collection --> retourne l'index de la tache
		int index = uneAffaire.retournerIndexTache(1);
		
		if(index == -1) {
			System.out.println("Le numéro de la tâche : " + 1 + " est incorrect.");
		}
		
		else {
			System.out.println("Le numéro de la tâche : " + uneAffaire.getLesTaches().get(index).getNumero() + " est correct.");
		}
		
		
		// cas 2 : la Tache n�existe pas dans la collection--> retourne -1
		index = uneAffaire.retournerIndexTache(4);
		
		if(index == -1) {
			System.out.println("Le numéro de la tâche : " + 4 + " est incorrect.");
		}
		
		else {
			System.out.println("Le numéro de la tâche : " + uneAffaire.getLesTaches().get(index).getNumero() + " est correct.");
		}
		
		// test de la m�thode supprimerTache --------------------------------------------------------------------
		// 2 tests sont � envisager, car 2 cas sont possibles
		System.out.println("--------------test supprimerTache---------------------------");
		// cas 1 : la Tache existe dans la collection --> retourne 1
		int supprOk = uneAffaire.supprimerTache(1);
		
		if(supprOk == 1) {
			System.out.println("La tâche : " + 1 + " a bien été supprimée.");
		}
		
		else {
			System.out.println("La tâche : " + 1 + "n'existe pas.");
		}

		// cas 2 : la Tache n’existe pas dans la collection --> retourne 0
		supprOk = uneAffaire.supprimerTache(4);
		
		if(supprOk == 1) {
			System.out.println("La tâche : " + 4 + " a bien été supprimée.");
		}
		
		else {
			System.out.println("La tâche : " + 4 + " n'existe pas.");
		}
		
		// test de la méthode retournerTache --------------------------------------------------------------------
		// 2 tests sont à envisager, car 2 cas sont possibles
		System.out.println("--------------test retournerTache---------------------------");
		// cas 1 : la Tache existe dans la collection --> retourne la Tache
		Tache uneTache = uneAffaire.retournerTache(2);
		
		if(uneTache == null) {
			AffichageModele.afficherTache(uneTache);
		}
		
		else {
			System.out.println("La tâche : " + 2 + " n'existe pas.");
		}
		
		// cas 2 : la Tache existe dans la collection --> retourne null
		uneTache = uneAffaire.retournerTache(4);
		
		if(uneTache == null) {
			AffichageModele.afficherTache(uneTache);
		}
		
		else {
			System.out.println("La tâche : " + 4 + " n'existe pas.");
		}
	}
}

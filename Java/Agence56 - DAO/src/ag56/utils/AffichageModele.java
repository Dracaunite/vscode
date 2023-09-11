package ag56.utils;

import ag56.modele.Pays;
import ag56.modele.Salarie;
import ag56.modele.Personne;
import ag56.modele.Voyage;


public class AffichageModele {

	public static void afficherPersonne(Personne unePersonne){
		System.out.println(unePersonne.getCode() + " - " + unePersonne.getNom() + " " + unePersonne.getPrenom());
		System.out.println("Adresse : " + unePersonne.getRue() + " - " + unePersonne.getCp() + " " + unePersonne.getVille());
		System.out.println("Pays : " + unePersonne.getPays());
		System.out.println("Telephone : " + unePersonne.getTel());
		System.out.println("--------------------------------------------------");
	}
	
	
	public static void afficher(Salarie unGuide){
		System.out.println("Guide accompagnant un voyage");
		afficherPersonne(unGuide);
		System.out.println("Spécialites : " + unGuide.getSpecialites());
		System.out.println("Prime journali�re : " + unGuide.getPrimeJournaliere());
		System.out.println("Nombre de voyages d�j� encadr�s : " + unGuide.getNbVoyagesEncadres());
	}
	
	
	public static void afficherVoyage(Voyage unVoyage){
		System.out.println("Voyage : " + unVoyage.getCodeVoyage() + " - " + unVoyage.getLibVoyage());
		System.out.println("Dates de début et de fin : " + unVoyage.getDateDebut() +  " - " + unVoyage.getDateFin());
		System.out.println("Nombres de places totales : " + unVoyage.getNbPlaces() + " - Places r�serv�es : " + unVoyage.getNbInscrits());
		afficher(unVoyage.getlePays());
		afficher(unVoyage.getLeGuide());
	}
	
	public static void afficher(Pays unPays){ 
		// méthode permettant d'afficher les valeurs du Pays pass�e en paramètres
		System.out.println("Renseignements sur le Pays de code : " + unPays.getCodePays());
		System.out.println("--------------------------------------------------");
		System.out.println("Pays : " + unPays.getLibPays());
		System.out.println("Formalités : " + unPays.getFormalites());
		System.out.println("Vaccins : " + unPays.getVaccins());
		System.out.println("Conseils : " + unPays.getConseils());
		System.out.println("__________________________________________________");
	}
	
	
}

package ag56.utils;

import ag56.modele.*;


public class AffichageModele {

	public static void afficher(Personne unePersonne){
		System.out.println(unePersonne.getCode() + " - "+unePersonne.getNom() + " " + unePersonne.getPrenom());
		System.out.println("Adresse : " + unePersonne.getRue() + " - " + unePersonne.getCp() + " " + unePersonne.getVille());
		System.out.println("Pays : " + unePersonne.getPays());
		System.out.println("Telephone : " + unePersonne.getTel());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Client unClient) {
		System.out.println(unClient.getCode() + " - " + unClient.getNom() + " " + unClient.getPrenom());
		System.out.println("Adresse : " + unClient.getRue() + " - " + unClient.getCp() + " "+unClient.getVille());
		System.out.println("Pays : " + unClient.getPays());
		System.out.println("Telephone : " + unClient.getTel());
		System.out.println("--------------------------------------------------");
		System.out.println("Nombre de voyages :" + unClient.getNbVoyages());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Guide unGuide){
		System.out.println("Guide accompagnant un voyage");
		System.out.println(unGuide.getCode() + " - " + unGuide.getNom() + " " + unGuide.getPrenom());
		System.out.println("Adresse : " + unGuide.getRue() + " - " + unGuide.getCp()+" " + unGuide.getVille());
		System.out.println("Pays : " + unGuide.getPays());
		System.out.println("Telephone : " + unGuide.getTel());
		System.out.println("--------------------------------------------------");
		System.out.println("Spécialites : " + unGuide.getSpecialites());
		System.out.println("Prime journalière : " + unGuide.getPrimeJournaliere());
		System.out.println("Nombre de voyages déjà encadrés : " + unGuide.getNbVoyagesEncadres());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Randonnee uneRandonnee) {
		System.out.println("Voyage : " + uneRandonnee.getCodeVoyage()+ " - " + uneRandonnee.getLibVoyage());
		System.out.println("Dates de début et de fin : " + uneRandonnee.getDateDebut() + " - "+uneRandonnee.getDateFin());
		System.out.println("Nombres de places totales : " + uneRandonnee.getNbPlaces() + " - Places réservées : " + uneRandonnee.getNbInscrits());
		afficher(uneRandonnee.getLePays());
		afficher(uneRandonnee.getLeGuide());
		System.out.println("Niveau : " + uneRandonnee.getNiveau());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Randonneur unRandonneur) {
		System.out.println(unRandonneur.getCode() + " - " + unRandonneur.getNom() + " " + unRandonneur.getPrenom());
		System.out.println("Adresse : " + unRandonneur.getRue() + " - " + unRandonneur.getCp() + " " + unRandonneur.getVille());
		System.out.println("Pays : " + unRandonneur.getPays());
		System.out.println("Telephone : " + unRandonneur.getTel());
		System.out.println("--------------------------------------------------");
		System.out.println("Nombre de voyages :" + unRandonneur.getNbVoyages());
		System.out.println("Niveau : " + unRandonneur.donnerNiveau());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Voyage unVoyage){
		System.out.println("Voyage : "+unVoyage.getCodeVoyage()+ " - "+unVoyage.getLibVoyage());
		System.out.println("Dates de début et de fin : " + unVoyage.getDateDebut()+ " - " + unVoyage.getDateFin());
		System.out.println("Nombres de places totales : " + unVoyage.getNbPlaces()+ " - Places réservées : " + unVoyage.getNbInscrits());
		afficher(unVoyage.getLePays());
		afficher(unVoyage.getLeGuide());
		System.out.println("__________________________________________________");
	}
	
	public static void afficher(Pays unPays){ 
		// methode permettant d’afficher les valeurs du Pays passé en paramètres
		System.out.println("Renseignements sur la destination de code : "+unPays.getCodePays());
		System.out.println("--------------------------------------------------");
		System.out.println("Pays : " + unPays.getLibPays());
		System.out.println("Formalités : " + unPays.getFormalites());
		System.out.println("Vaccins : " + unPays.getVaccins());
		System.out.println("Conseils : " + unPays.getConseils());
		System.out.println("__________________________________________________");
	}
}
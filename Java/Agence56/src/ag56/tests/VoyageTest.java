package ag56.tests;

import ag56.modele.*; // Importation des fichiers Voyage et Pays

public class VoyageTest {

	public static void main(String[] args) {
		Pays maroc;
		Pays turquie;
		Voyage marrakech;
		Voyage istanbul;
		
		// Création des instances
		maroc = new Pays();
		turquie = new Pays("TU1", "Turquie", "Passeport et carte d'identité", "Hépatite, Covid-19, Typhoïde", "Prévoir un hébergement");
		marrakech = new Voyage();
		istanbul = new Voyage("IST1", "Istanbul", "18 Avril 2022", "25 Avril 2022", 200, 154, turquie);
		
		// Modification des valeurs
		maroc.setCodePays("MA1");
		maroc.setLibPays("Maroc");
		maroc.setFormalites("Passeport, autorisation de sortie du territoire de votre pays et carte d'identité");
		maroc.setVaccins("Covid-19, Hépatite, Téthanos");
		maroc.setConseils("Eviter tout contact avec les animaux");
		
		marrakech.setCodeVoyage("MARR1");
		marrakech.setLibVoyage("Marrakech");
		marrakech.setDateDebut("6 Juin 2022");
		marrakech.setDateFin("14 Juin 2022");
		marrakech.setNbPlaces(120);
		marrakech.setNbInscrits(94);
		marrakech.setLePays(maroc);
		
		istanbul.setNbInscrits(124);
		
		afficher(marrakech);
		afficher(istanbul);
		
		marrakech.ajouterInscrits(20);
		istanbul.ajouterInscrits(64);
		
		afficher(marrakech);
		afficher(istanbul);
	}
	
	public static void afficher(Voyage unVoyage) 
	{
		System.out.println("Code du voyage : " + unVoyage.getCodeVoyage());
		System.out.println("---------------------------------");
		System.out.println("Ville de destination : " + unVoyage.getLibVoyage());
		System.out.println("---------------------------------");
		System.out.println("Date de début : " + unVoyage.getDateDebut());
		System.out.println("---------------------------------");
		System.out.println("Date de fin : " + unVoyage.getDateFin());
		System.out.println("---------------------------------");
		System.out.println("Nombres de places disponibles : " + unVoyage.getNbPlaces());
		System.out.println("---------------------------------");
		System.out.println("Nombre d'inscrits : " + unVoyage.getNbInscrits());
		System.out.println("---------------------------------");
		System.out.println("Pays : " + unVoyage.getLePays());
		System.out.println("__________________________________________________");
	}
}

package ag56.modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import ag56.modele.Salarie;
import ag56.modele.Pays;
import ag56.modele.Voyage;


public class VoyageDao {
	
	public static Voyage rechercher(String unCodeVoyage) {
		Voyage unVoyage = null;
		try {
			// Statement : C'est une classe que l'application
			// emploie pour transmettre des instructions à la base
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Voyage where codeVoyage ='"
							+ unCodeVoyage + "'");
			Pays unPays = PaysDao.rechercher(resultatReq.getString(7)); // clé étrangère de la table Pays
			Salarie unGuide = GuideDao.rechercher(resultatReq.getString(8)); // clé etrangère de la table Guide
			if (resultatReq.next()) {
				unVoyage = new Voyage(resultatReq.getString(1), resultatReq.getString(2), resultatReq.getString(3),
						resultatReq.getString(4), resultatReq.getInt(5), unPays, unGuide);
			}
		} // fin try
		catch (Exception e) {
			System.out.println("Erreur requête : select * from Pays where codePays ='"
							+ unCodeVoyage + "'");
		}
		return unVoyage;
	}

	public static void creer(Voyage unVoyage) {
		String requeteInsertion;
		String code = unVoyage.getCodeVoyage();
		String lib = unVoyage.getLibVoyage();
		String dateDebut = unVoyage.getDateDebut();
		String dateFin = unVoyage.getDateFin();
		int nbPlaces = unVoyage.getNbPlaces();
		int nbInscrits = unVoyage.getNbInscrits();
		Pays lePays = unVoyage.getlePays();
		Salarie leGuide = unVoyage.getLeGuide();
		
		requeteInsertion = "insert into Pays values('" + code + "','" + lib + "','" + dateDebut + "','" + dateFin + "','" + nbPlaces +
				"','" + nbInscrits + "','" + lePays + "','" + leGuide + "')";
		System.out.println(requeteInsertion);
		int result = ConnexionMySql.execReqMaj(requeteInsertion);
		System.out.println(result);
		ConnexionMySql.fermerConnexionBd();
	}

	public static ArrayList<Voyage> retournerLesVoyages() {
		// cette methode doit retourner une ArrayList de Guide
		// déclaration et instanciation de L'arrayList à retourner
		ArrayList<Voyage> colVoyage = new ArrayList<Voyage>();
		try {
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Guide");
			Pays unPays = PaysDao.rechercher(resultatReq.getString(7)); // clé étrangère de la table Pays
			Salarie unGuide = GuideDao.rechercher(resultatReq.getString(8)); // clé etrangère de la table Guide
			// la requête permet de récupérer dans le ResultSet plusieurs lignes de la table Pays
			// il va donc falloir la parcourir, et pour chaque ligne créer un objet Pays
			// qui va être rajouté à la collection de Pays
			while (resultatReq.next()) { // parcours du ResultaSet resultReq
				// instanciation d'un objet Pays à partir d'une ligne du ResultSet
				Voyage unVoyage = new Voyage(resultatReq.getString(1), resultatReq.getString(2), resultatReq.getString(3),
						resultatReq.getString(4), resultatReq.getInt(5), unPays, unGuide);
				colVoyage.add(unVoyage); // ajout d'un objet Guide à la collection
			}
		} // fin try
		catch (Exception e) {
			System.out.println("Erreur requete : select * from Pays");
		}
		return colVoyage; 
	}
}
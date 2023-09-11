package ag56.modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import ag56.modele.Salarie;
import ag56.modele.Pays;


public class GuideDao {
	
	public static Salarie rechercher(String unCodeGuide) {
		Salarie unGuide = null;
		try {
			// Statement : C'est une classe que l'application
			// emploie pour transmettre des instructions à la base
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Guide where codeGuide ='"
							+ unCodeGuide + "'");
			Pays unPays = PaysDao.rechercher(resultatReq.getString(12)); // clé étrangère
			if (resultatReq.next()) {
				unGuide = new Salarie(resultatReq.getString(1),
						resultatReq.getString(2), resultatReq.getString(3), resultatReq.getString(4), resultatReq.getString(5),
						resultatReq.getString(6), resultatReq.getString(7), resultatReq.getString(8), resultatReq.getString(9),
						unPays, resultatReq.getDouble(11));
			}
		} // fin try
		catch (Exception e) {
			System.out.println("Erreur requête : select * from Pays where codePays ='"
							+ unCodeGuide + "'");
		}
		return unGuide;
	}

	public static void creer(Salarie unGuide) {
		String requeteInsertion;
		String code = unGuide.getCode();
		String nom = unGuide.getNom();
		String prenom = unGuide.getPrenom();
		String rue = unGuide.getRue();
		String cp = unGuide.getCp();
		String ville = unGuide.getVille();
		String pays = unGuide.getPays();
		String tel = unGuide.getTel();
		String specialites = unGuide.getSpecialites();
		double primeJournaliere = unGuide.getPrimeJournaliere();
		Pays lePays = unGuide.getlePays();
		
		requeteInsertion = "insert into Pays values('" + code + "','" + nom + "','" + prenom + "','" + rue + "','" + cp +
				"','" + ville + "','" + pays + "','" + tel + "','" + specialites + "','" + primeJournaliere + "','" + lePays + "')";
		System.out.println(requeteInsertion);
		int result = ConnexionMySql.execReqMaj(requeteInsertion);
		System.out.println(result);
		ConnexionMySql.fermerConnexionBd();
	}

	public static ArrayList<Salarie> retournerLesGuides() {
		// cette methode doit retourner une ArrayList de Guide
		// déclaration et instanciation de L'arrayList à retourner
		ArrayList<Salarie> colGuide = new ArrayList<Salarie>();
		try {
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Guide");
			Pays unPays = PaysDao.rechercher(resultatReq.getString(12)); // clé étrangère
			// la requête permet de récupérer dans le ResultSet plusieurs lignes de la table Pays
			// il va donc falloir la parcourir, et pour chaque ligne créer un objet Pays
			// qui va être rajouté à la collection de Pays
			while (resultatReq.next()) { // parcours du ResultaSet resultReq
				// instanciation d'un objet Pays à partir d'une ligne du ResultSet
				Salarie unGuide = new Salarie(resultatReq.getString(1),
						resultatReq.getString(2), resultatReq.getString(3), resultatReq.getString(4), resultatReq.getString(5),
						resultatReq.getString(6), resultatReq.getString(7), resultatReq.getString(8), resultatReq.getString(9),
						unPays, resultatReq.getDouble(11));
				colGuide.add(unGuide); // ajout d'un objet Guide à la collection
			}
		} // fin try
		catch (Exception e) {
			System.out.println("Erreur requete : select * from Pays");
		}
		return colGuide; 
	}
}


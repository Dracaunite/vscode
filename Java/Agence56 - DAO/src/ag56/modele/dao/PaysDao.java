package ag56.modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;


import ag56.modele.Pays;


public class PaysDao {

	public static Pays rechercher(String unCodePays) {
		Pays unPays = null;
		try {
			// Statement : C'est une classe que l'application
			// emploie pour transmettre des instructions à la base
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Pays where codePays ='"
							+ unCodePays + "'");
			if (resultatReq.next()) {
				unPays = new Pays(resultatReq.getString(1),
						resultatReq.getString(2), resultatReq.getString(3),
						resultatReq.getString(4), resultatReq.getString(5));
			}
		} // fin try
		catch (Exception e) {
			System.out
					.println("Erreur requête : select * from Pays where codePays ='"
							+ unCodePays + "'");
		}
		return unPays;
	}

	public static void creer(Pays unePays) {
		String requeteInsertion;
		String code = unePays.getCodePays();
		String lib = unePays.getLibPays();
		String formal = unePays.getFormalites();
		String vac = unePays.getVaccins();
		String cons = unePays.getConseils();
		// code libelle formalités vaccins conseils
		requeteInsertion = "insert into Pays values('" + code + "','"
				+ lib + "','" + formal + "','" + vac + "','" + cons + "')";
		System.out.println(requeteInsertion);
		int result = ConnexionMySql.execReqMaj(requeteInsertion);
		System.out.println(result);
		ConnexionMySql.fermerConnexionBd();
	}

	public static ArrayList<Pays> retournerLesPays() {
		// cette methode doit retourner une ArrayList de Pays
		// déclaration et instanciation de L'arrayList à retourner
		ArrayList<Pays> colPays = new ArrayList<Pays>();
		try {
			ResultSet resultatReq = ConnexionMySql
					.execReqSelection("select * from Pays");
			// la requête permet de récupérer dans le ResultSet plusieurs lignes de la table Pays
			// il va donc falloir la parcourir, et pour chaque ligne créer un objet Pays
			// qui va être rajouté à la collection de Pays
			while (resultatReq.next()) { // parcours du ResultaSet resultReq
				// instanciation d'un objet Pays � partir d'une ligne du ResultSet
				Pays unPays = new Pays(
						resultatReq.getString(1), resultatReq.getString(2),
						resultatReq.getString(3), resultatReq.getString(4),
						resultatReq.getString(5)); 
				colPays.add(unPays); // ajout d'un objet Pays à la collection
			}
		} // fin try
		catch (Exception e) {
			System.out.println("Erreur requete : select * from Pays");
		}
		return colPays; 
	}
}

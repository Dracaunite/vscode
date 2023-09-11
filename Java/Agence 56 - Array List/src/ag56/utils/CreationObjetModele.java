package ag56.utils;

import ag56.modele.Pays;
import ag56.modele.Guide;
import ag56.modele.Voyage;


public class CreationObjetModele {
	
	public static Pays creerMaroc(){
		Pays maroc = new Pays(); // instanciation d'un objet Pays : attributs non valorisés
		maroc.setCodePays("MA1");  // affectation d’une code à la Pays maroc
		maroc.setLibPays("Maroc"); // affectation d’un libellé à la Pays maroc
		maroc.setFormalites("passeport");
		maroc.setVaccins("pas de vaccin obligatoire");
		maroc.setConseils("médicaments de base");
		return maroc;
	}
	
	public static Pays creerTurquie(){
		Pays turquie = new Pays("TU1","Turquie", "carte nationalité d'identité ou le passeport","pas de vaccin obligatoire","médicaments de base");
		return turquie;
	}
	
	public static Voyage creerEssaouira(){
		//String codeVoyage, String libVoyage, String dateDebut,String dateFin, int nbPlaces,Pays laPays
		Voyage essaouira=new Voyage("MA1","Détente à Essaouira","08/03/2012","15/03/2012",30,creerMaroc());
		essaouira.setLeGuide(creerRenaud());
		essaouira.ajouterInscrits(20);
		essaouira.retirerInscrits(10);
		return essaouira;
	}
	
	public static Voyage creerCappadoce(){
		Pays turquie = creerTurquie();
		Voyage cappadoce=new Voyage("TUR1","Tour Cappadoce","01/03/2012","08/03/2012",15,turquie);
		cappadoce.setLeGuide(creerMartin());
		cappadoce.ajouterInscrits(10);
		cappadoce.retirerInscrits(5);
		return cappadoce;
	}
	
	public static Guide creerMartin(){
		Pays turquie = creerTurquie();
		Guide martin = new Guide("G1", "Martin", "Nicolas", "30 rue Gal Leclerc", "56100", "Lorient", "France", "02 97 31 36 78","Guide touristique moyenne montagne" ,turquie, 60);
		return martin;
	}
	
	public static Guide creerRenaud(){
		Pays turquie = creerTurquie();
		Guide renaud = new Guide("G2", "Renaud", "Louis", "10 rue des ormes", "56270", "Ploemeur", "France", "02 97 88 99 66","Guide touristique moyenne montagne" ,turquie, 60);
		return renaud;
	}
	
}

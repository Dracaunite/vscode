package ski.utils;

import ski.modele.Skieur;
import ski.modele.Station;

public class AffichageModele {
	public static void afficherSkieur(Skieur unSkieur){
		  System.out.println("Num : "+unSkieur.getNoSkieur()+" - Nom : "+unSkieur.getNomSkieur()+" - Classement " + unSkieur.getNoClassement());
		  afficherStation(unSkieur.getLaStation());
	}
	
	public static void afficherStation(Station uneStation){
		System.out.println("Numéro : "+uneStation.getNoStation()+" - Nom : "+uneStation.getNomStation());
		System.out.println("Altitude : "+uneStation.getAltitude());
	}

}

package ski.tests;


import ski.modele.Competition;
import ski.modele.Skieur;
import ski.modele.Station;
import ski.utils.AffichageModele;

public class CompetitionTest {

	public static void main(String[] args) {
		Competition uneCompet;
		Station sta1 = new Station(1, "Alberville", "France", 1800);
		Station sta2 = new Station(1, "Sauze", "France", 1700);
		Station sta3 = new Station(1, "Chamonix", "France", 1035);
		uneCompet = new Competition(1, "Saut", "10/12/2004", sta1);
		uneCompet.ajoutSkieur(new Skieur(1, "Gropirron", sta1));
		uneCompet.ajoutSkieur(new Skieur(2, "Merle", sta2));
		uneCompet.ajoutSkieur(new Skieur(3, "Lafleche", sta1));
		uneCompet.ajoutSkieur(new Skieur(4, "Letoile", sta2));
		uneCompet.ajoutSkieur(new Skieur(5, "Leflocon", sta1));
		uneCompet.ajoutSkieur(new Skieur(6, "Superge", sta2));
		uneCompet.ajoutSkieur(new Skieur(7, "Sauteloin", sta1));
		uneCompet.ajoutSkieur(new Skieur(8, "Glissevite", sta2));
		uneCompet.ajoutSkieur(new Skieur(9, "PlongeLoin", sta3));

		uneCompet.classer(1, 2);
		uneCompet.classer(2, 4);
		uneCompet.classer(3, 6);
		uneCompet.classer(4, 7);
		uneCompet.classer(5, 8);
		uneCompet.classer(6, 6);
		uneCompet.classer(7, 5);
		uneCompet.classer(8, 3);

		for(int i = 0; i < uneCompet.getLesSkieurs().size(); i++) {
			AffichageModele.afficherSkieur(uneCompet.getLesSkieurs().get(i));
			System.out.println(uneCompet.retourneClassement(i));
		}
		
		uneCompet.getLesSkieurs().remove(1);

		for(int i = 0; i < uneCompet.getLesSkieurs().size(); i++) {
			AffichageModele.afficherSkieur(uneCompet.getLesSkieurs().get(i));
		}
		
		System.out.println("Classement du skieur n°6 : " + uneCompet.retourneClassement(5) + "ème.");
		
		System.out.println(uneCompet.retournerPodium());
	}
}

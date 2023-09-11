package dvd.tests;

import dvd.modele.Dvd;
import dvd.utils.AffichageModele;


public class DvdTest {
	
	public static void main(String[] args) {
		Dvd unDvd = new Dvd(1, "Star War - épisode IV", "Lucas Film", "09/09/2004", 10, 2, 10.20, 131, "Science Fiction", 1977, 2);
		Dvd deuxDvd = new Dvd(2, "Star War - épisode V", "Lucas Film", "09/09/2004", 10, 2, 10.20, 124, "Science Fiction", 1980, 2);
		Dvd troisDvd = new Dvd(3, "Star War - épisode VI", "Lucas Film", "09/09/2004", 10, 2, 10.20, 134, "Science Fiction", 1983, 2);
		Dvd quatreDvd = new Dvd(4,  "Le Seigneur des Anneaux 1 : La communauté de l'Anneau - blu ray"," New Line Cinema", "1/04/2010", 3, 5, 25.43, 178 , "Fantastique", 2001, 1);
		
		AffichageModele.afficherDvd(unDvd);
		System.out.println("****************************************************************************************************");
		AffichageModele.afficherDvd(deuxDvd);
		System.out.println("****************************************************************************************************");
		AffichageModele.afficherDvd(troisDvd);
		System.out.println("****************************************************************************************************");
		AffichageModele.afficherDvd(quatreDvd);
	}
}
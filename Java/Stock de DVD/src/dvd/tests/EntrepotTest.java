package dvd.tests;

// import java.util.ArrayList;

import dvd.modele.Dvd;
import dvd.modele.Entrepot;
import dvd.utils.AffichageModele;


public class EntrepotTest {

	public static void main(String[] args) {
		Dvd unDvd = new Dvd(1, "Star War - épisode IV", "Lucas Film", "09/09/2004", 10, 2, 10.20, 131, "Science Fiction", 1977, 2);
		Dvd deuxDvd = new Dvd(2, "Star War - épisode V", "Lucas Film", "09/09/2004", 10, 2, 10.20, 124, "Science Fiction", 1980, 2);
		Dvd troisDvd = new Dvd(3, "Star War - épisode VI", "Lucas Film", "09/09/2004", 10, 2, 10.20, 134, "Science Fiction", 1983, 2);
		Dvd quatreDvd = new Dvd(4,  "Le Seigneur des Anneaux 1 : La communauté de l'Anneau - blu ray"," New Line Cinema", "1/04/2010", 3, 5, 25.43, 178 , "Fantastique", 2001, 1);
		
		Entrepot unEntrepot = new Entrepot("Entrepot1", "Rue des Lilas - Lorient");
		unEntrepot.ajoutDvd(unDvd);
		unEntrepot.ajoutDvd(deuxDvd);
		unEntrepot.ajoutDvd(troisDvd);
		unEntrepot.ajoutDvd(quatreDvd);
		
		System.out.println("Nombre de Dvd dans la collection : "  + unEntrepot.getLesDvd().size());
		System.out.println("---------------------------------------");
		
		System.out.println("---------------film en fonction du num fil N° 2------------------------");

		// ajouter 10 au stock du film placé à l'index 1
		unEntrepot.ajouterStock(1, 10);
		
		System.out.println("nouveau stock après + 10 : " + unEntrepot.getLesDvd().get(unEntrepot.indexDvdFilm(2)).getQteStock());
		
		// retirer 5 au stock du film placé à l'index 1
		unEntrepot.retirerStock(1, 5);

		System.out.println("nouveau stock après - 5 : " + unEntrepot.getLesDvd().get(unEntrepot.indexDvdFilm(2)).getQteStock());
		System.out.println("--- tous les dvd -------------"); 
		for(Dvd leDvd : unEntrepot.getLesDvd()){
			AffichageModele.afficherDvd(leDvd);
		}
		
		// lister les films de SF
		System.out.println("--------- dvd genre SF ---------");
		System.out.println(unEntrepot.retourneGenreDvd("Science Fiction"));
		
		// lister les films de la zone 1
		System.out.println("--------- dvd zone1 ---------");
		System.out.println(unEntrepot.retourneZoneDvd(1));

		//Lister les dvd à reapproviovisionner
		System.out.println("--------- dvd à reappro ---------");
		System.out.println(unEntrepot.dvdAReapprovisionner());
		
		// Penser à utiliser AffichageModele pour afficher le dvd et non objet
	}
}

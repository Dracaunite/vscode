package ag56.tests;

import ag56.modele.Guide;

public class GuideTest {

	public static void main(String[] args) {
		Guide guest, guest2, guest3;

		guest = new Guide();
		guest2 = new Guide("FE1", "Bazac", "Aurélie");
		guest3 = new Guide("HO1", "Briez", "Youssouf", "3 rue des Boulangers", "56660", "Lanester", "France", "06 05 87 48 64", "Guide haute montagne");

		// Modification de certaines valeurs
		guest.setUnCode("HO2");
		guest.setUnNom("Porchy");
		guest.setUnPrenom("Mattheus");
		guest.setUneRue("7 avenue du Colisée");
		guest.setUnCp("48499"); // Code postal inventé
		guest.setUneVille("Rome");
		guest.setUnPays("Italie");
		guest.setUnTel("01 74 08 44 23");
		guest.setSpecialite("Guide touristique");
		guest.setPrimeJournaliere(35);

		guest2.setUneRue("22 avenue des Palmiers");
		guest2.setUnCp("56660");
		guest2.setUneVille("Lanester");
		guest2.setUnPays("France");
		guest2.setUnTel("06 65 87 48 31");
		guest2.setSpecialite("Encadrement VTT et encadrement ski de randonnée");
		guest2.setPrimeJournaliere(55);

		guest3.setPrimeJournaliere(25);

		afficher(guest);
		afficher(guest2);
		afficher(guest3);
	}

	public static void afficher(Guide unGuide){
		// Affiche la personne concerné
		System.out.println("Code du guide : " + unGuide.getUnCode());
		System.out.println("---------------------------------");
		System.out.println("Nom du guide : " + unGuide.getUnNom());
		System.out.println("---------------------------------");
		System.out.println("Prénom du guide : " + unGuide.getUnPrenom());
		System.out.println("---------------------------------");
		System.out.println("Adresse : " + unGuide.getUneRue());
		System.out.println("---------------------------------");
		System.out.println("Code postal : " + unGuide.getUnCp());
		System.out.println("---------------------------------");
		System.out.println("Ville : " + unGuide.getUneVille());
		System.out.println("---------------------------------");
		System.out.println("Pays : " + unGuide.getUnPays());
		System.out.println("---------------------------------");
		System.out.println("Numéro de téléphone : " + unGuide.getUnTel());
		System.out.println("---------------------------------");
		System.out.println("Spécialité(s) : " + unGuide.getSpecialite());
		System.out.println("---------------------------------");
		System.out.println("Prime journalière " + unGuide.getPrimeJournaliere() + " euros ");
		System.out.println("__________________________________________________");
	}
}

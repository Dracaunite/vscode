package ag56.tests;

import ag56.modele.Personne;

public class PersonneTest {

	public static void main(String[] args) {
		Personne guest, guest2, guest3;

		// Création de l'instance
		guest = new Personne();
		guest2 =  new Personne("HO1", "Bertrand", "Jean-Jacques");
		guest3 = new Personne("FE1", "Montagner", "Julie", "8 rue des Sentinelles", "56660", "Lanester", "France", "06 57 65 48 56");

		// Modification de certaines valeurs
		afficher(guest2);
		afficher(guest3);

		guest.setUnCode("HO2");
		guest.setUnNom("Whyte");
		guest.setUnPrenom("Douglas");
		guest.setUneRue("5 avenue de la Tour");
		guest.setUnCp("48499"); // Code postal inventé
		guest.setUneVille("Manchester");
		guest.setUnPays("Angleterre");
		guest.setUnTel("09 05 45 94 67");

		guest2.setUneRue("12 rue des Sabliers");
		guest2.setUnCp("56660");
		guest2.setUneVille("Lanester");
		guest2.setUnPays("France");
		guest2.setUnTel("06 51 54 84 98");

		guest3.setUnNom("Salber");
		guest3.setUnPrenom("Rosélia");

		afficher(guest);
		afficher(guest2);
		afficher(guest3);
	}

	public static void afficher(Personne unePersonne) {
		// Affiche la personne concerné
		System.out.println("Code de la personne : " + unePersonne.getUnCode());
		System.out.println("---------------------------------");
		System.out.println("Nom de la personne : " + unePersonne.getUnNom());
		System.out.println("---------------------------------");
		System.out.println("Prénom de la personne : " + unePersonne.getUnPrenom());
		System.out.println("---------------------------------");
		System.out.println("Adresse : " + unePersonne.getUneRue());
		System.out.println("---------------------------------");
		System.out.println("Code postal : " + unePersonne.getUnCp());
		System.out.println("---------------------------------");
		System.out.println("Ville : " + unePersonne.getUneVille());
		System.out.println("---------------------------------");
		System.out.println("Pays : " + unePersonne.getUnPays());
		System.out.println("---------------------------------");
		System.out.println("Numéro de téléphone : " + unePersonne.getUnTel());
		System.out.println("__________________________________________________");
	}

}

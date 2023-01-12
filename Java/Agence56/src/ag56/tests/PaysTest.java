package ag56.tests;

import ag56.modele.Pays; // Importe fichier Pays

public class PaysTest {

	public static void main(String[] args) {
		Pays maroc, turquie;
		
		// Création des instances
		maroc = new Pays();
		turquie = new Pays("TU1", "Turquie", "Passeport et carte d'identité", "Hépatite, Covid-19, Typhoïde", "Prévoir un hébergement");
		
		// Modification de certaines valeurs + affichage
		afficher(turquie);
		maroc.setCodePays("MA1");
		maroc.setLibPays("Maroc");
		maroc.setFormalites("Passeport, autorisation de sortie du territoire de votre pays et carte d'identité");
		maroc.setVaccins("Covid-19, Hépatite, Téthanos");
		maroc.setConseils("Eviter tout contact avec les animaux");
		afficher(maroc);
		
	}
	
	private static void afficher(Pays unPays) {
		// Affiche le pays concerné
		System.out.println("Code du pays " + unPays.getCodePays());
		System.out.println("---------------------------------");
		System.out.println("Pays : " + unPays.getLibPays());
		System.out.println("---------------------------------");
		System.out.println("Papiers nécessaires : " + unPays.getFormalites());
		System.out.println("---------------------------------");
		System.out.println("Vaccins conseillés et/ou obligatoires : " + unPays.getVaccins());
		System.out.println("---------------------------------");
		System.out.println("Conseils : " + unPays.getConseils());
		System.out.println("__________________________________________________");
	}
}

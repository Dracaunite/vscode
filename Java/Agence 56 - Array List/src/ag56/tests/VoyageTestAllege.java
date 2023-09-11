package ag56.tests;

import ag56.modele.Voyage;
import ag56.utils.AffichageModele;
import ag56.utils.CreationObjetModele;

public class VoyageTestAllege {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instanciation des voyages
		// utilisation des methodes de CreationObjet pour créer les Destination et les Guides
				//String codeVoyage, String libVoyage, String dateDebut,String dateFin, int nbPlaces,Destination laDestination, Guide leGuide
				Voyage essaouira=new Voyage("MA1","Détente à Essaouira","08/03/2012","15/03/2012",30, CreationObjetModele.creerMaroc());
				essaouira.setLeGuide( CreationObjetModele.creerMartin());
				Voyage cappadoce=new Voyage("TUR1","Tour Cappadoce","01/03/2012","08/03/2012",15,CreationObjetModele.creerTurquie());
				cappadoce.setLeGuide(CreationObjetModele.creerRenaud());
				// opérations sur les voyages
				cappadoce.ajouterInscrits(10);
				cappadoce.retirerInscrits(5);
				AffichageModele.afficher(cappadoce);
				System.out.println("--------------------------------------------------");
				essaouira.ajouterInscrits(20);
				essaouira.retirerInscrits(10);
				AffichageModele.afficher(essaouira);
				System.out.println("--------------------------------------------------");
	}

}

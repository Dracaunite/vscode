package fact.utils;

import fact.modele.Article;
import fact.modele.Client;
import fact.modele.Facture;
import fact.modele.LigneCde;


public class AffichageModele {
	public static void afficherClient(Client unClient) {
		System.out.println("Code client : " + unClient.getCode());
		System.out.println("Nom client : " + unClient.getNom());
		System.out.println("Prenom client : " + unClient.getPrenom());
		System.out.println("Adresse rue : " + unClient.getAdresse());
		System.out.println("Ville : " + unClient.getCp() + " " + unClient.getVille());
		System.out.println("Téléphone : " + unClient.getTelephone());
		System.out.println("Email : " + unClient.getEmail());
	}
	
	public static void afficherArticle(Article unArticle) {
		System.out.println("Code article : " + unArticle.getCode());
		System.out.println("Libellé article : " + unArticle.getLibelle());
		System.out.println("Poids article : " + unArticle.getPoids() + "kg.");
		System.out.println("Prix HT article : " + unArticle.getPrixHt() + " euros.");
		System.out.println("Tva article : " + unArticle.getTva() + " euros.");
	}
	
	public static void afficherLigneCde(LigneCde uneLigne) {
		afficherArticle(uneLigne.getArticleCommande());
		System.out.println("Quantité commandée : " + uneLigne.getQuantite());
	}
	
	public static void afficherFacture(Facture uneFacture) {
		System.out.println("Code facture : " + uneFacture.getCode());
		System.out.println("Date facture : " + uneFacture.getDateFact());
		
		afficherClient(uneFacture.getAcheteur());
        
		for(LigneCde uneLig : uneFacture.getLesLignes()) {
        	afficherLigneCde(uneLig);
        }
        
        System.out.println("Total HT : " + uneFacture.totalPrixHt());
        System.out.println("Total TVA : " + uneFacture.totalTva());
        System.out.println("Total Prix TTC : " + uneFacture.totalPrixTtc());
        System.out.println("Total poids de la commande : " + uneFacture.totalPoidsCommande());
        System.out.println("Total prix du port de la commande : " + uneFacture.calculPrixPort());
	}
}

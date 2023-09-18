package fact.tests;

import fact.utils.AffichageModele;
import fact.modele.Article;
import fact.modele.LigneCde;

public class LigneCdeTest {
	
	public static void main(String[] args) {

		// instancier un article
		Article unArticle = new Article("code1", "libelle1", 20, 20.4, 0.200);
		AffichageModele.afficherArticle(unArticle);
		
		// instancier une ligneCDE
		LigneCde uneLigne = new LigneCde(unArticle, 8);
		
		// tester la méthode prixLigneHt
		System.out.println("Prix de la commande HT : " + uneLigne.prixLigneHt() + " euros.");
		
		// tester la méthode prixLigneTva
		System.out.println("Prix de la ligne TVA : " + uneLigne.prixLigneTva() + " euros.");

	}
}

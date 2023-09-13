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
		uneLigne.prixLigneHt();
		
		// tester la méthode prixLigneTva
		uneLigne.prixLigneTva();

	}
}

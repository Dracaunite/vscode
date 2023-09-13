package fact.modele;

public class LigneCde {
	
	protected Article articleCommande;
	protected int quantite;
	
	/**
	 * @param articleCommande
	 * @param quantite
	 */
	public LigneCde(Article articleCommande, int quantite) {
		super();
		this.articleCommande = articleCommande;
		this.quantite = quantite;
	}
	
	public Article getArticleCommande() {
		return articleCommande;
	}
	
	public void setArticleCommande(Article articleCommande) {
		this.articleCommande = articleCommande;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public double prixLigneTva() {
		// Prix Ligne commande TVA
		double prixLigneTvaCmd = getArticleCommande().getPrixHt() * getArticleCommande().getTva();
		return prixLigneTvaCmd;
	}
	
	public double prixLigneHt() {
		// Prix Ligne Commande (prixHt de l'article * quantité)
		double prixLigneHtCmd = getArticleCommande().getPrixHt() * quantite;
		return prixLigneHtCmd;
	}
	
	public int poidsLigne() {
		// Poids Ligne Commande (poids de l'article * quantité)
		int poidsLigneCmd = getArticleCommande().getPoids() * quantite;
		return poidsLigneCmd;
	}
}

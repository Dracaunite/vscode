package fact.modele;

public class Article {
	
	protected String code;
	protected String libelle;
	protected int poids;
	protected double prixHt;
	protected double tva;
	
	/**
	 * @param code caractères alphanumériques, pas de caractères spéciaux, limité à 6 caractères, non nul
	 * @param libelle intitulé du produit, non nul
	 * @param poids du produit, non null
	 * @param prixHt prix HT du produit, non nul
	 * @param tva du produit, non nul
	 */
	public Article(String code, String libelle, int poids, double prixHt, double tva) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.poids = poids;
		this.prixHt = prixHt;
		this.tva = tva;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public double getPrixHt() {
		return prixHt;
	}
	
	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
	}
	
	public double getTva() {
		return tva;
	}
	
	public void setTva(double tva) {
		this.tva = tva;
	}
}

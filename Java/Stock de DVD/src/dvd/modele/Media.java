package dvd.modele;

public class Media {
	protected int num;
	protected String titre;
	protected String editeur;
	protected String dateSortie;
	protected int qteStock;
	protected int stockMinimum;
	protected double prixUnitHT;
	
	/**
	 * constructeur de la classe
	 * @param num : numero 
	 * @param unTitre 
	 * @param unEditeur 
	 * @param uneDateSortie 
	 * @param unQteStock quantite en stock
	 * @param unStockMinimum quantité minimum à avoir en stock à partir de laquelle un réapprovisionnement est lancé
	 * @param unPrixUnitHT prix unitaire hor taxe
	 */
	public Media(int unNum, String unTitre, String unEditeur, String uneDateSortie,
			int uneQteStock, int unStockMinimum, double unPrixUnitHT) {
		this.num = unNum;
		this.titre = unTitre;
		this.editeur = unEditeur;
		this.dateSortie = uneDateSortie;
		this.qteStock = uneQteStock;
		this.stockMinimum = unStockMinimum;
		this.prixUnitHT = unPrixUnitHT;
	}
	
	/**
	 * @return Renvoie num.
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num num à définir.
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return Renvoie titre.
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre titre à définir.
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return Renvoie dateSortie.
	 */
	public String getDateSortie() {
		return dateSortie;
	}

	/**
	 * @param dateSortie dateSortie à définir.
	 */
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	/**
	 * @return Renvoie editeur.
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @param editeur 
	 */
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	/**
	 * @return Renvoie prixUnitHT.
	 */
	public double getPrixUnitHT() {
		return prixUnitHT;
	}

	/**
	 * @param prixUnitHT
	 */
	public void setPrixUnitHT(double unPrixUnitHT) {
		this.prixUnitHT = unPrixUnitHT;
	}

	/**
	 * @return Renvoie qteStock --> uantité en stock.
	 */
	public int getQteStock() {
		return qteStock;
	}

	/**
	 * @param qteStock quantité en stock
	 */
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	/**
	 * @return Renvoie stockMinimum
	 */
	public int getStockMinimum() {
		return stockMinimum;
	}

	/**
	 * @param stockMinimum stockMinimum
	 */
	public void setStockMinimum(int stockMinimum) {
		this.stockMinimum = stockMinimum;
	}

	/**
	 * calcule le prix total en stock
	 * @return qteStock*prixUnitHT
	 */
	public double prixStock() {  	
		double unPrixStock = 0;
		unPrixStock = qteStock * prixUnitHT ;
		return unPrixStock;
	}
	
	/**
	 * permet d’ajouter une quantite d'article du stock
	 * @param uneQte quantite à ajouter au stock
	 */
	public void entreeStock(int uneQte) {
		if(qteStock >= stockMinimum) {
			qteStock += uneQte;
		}
		
		else{
			System.out.println("La quantité de stock est inférieur à la quantité de stock minimum !");
		}
	}
	
	/**
	 * permet de retirer une quantite d'article du stock,  
	 * la vérification que la quantité en stock est supérieure ou égale à la quantité retirée doit avoir préalablement été effectuée   
	 * @param uneQte quantite à retirer du stock
	 */
	public void sortieStock(int uneQte){
		if(qteStock >= stockMinimum) {
			qteStock -= uneQte;
		}
		
		else{
			System.out.println("La quantité de stock est inférieur à la quantité de stock minimum !");
		}
	}
}
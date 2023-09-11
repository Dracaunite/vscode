package dvd.modele;

import java.util.ArrayList;


public class Entrepot {
	protected String nom;
	protected String adresse;
	protected ArrayList<Dvd> lesDvd;

	
	public Entrepot(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
		// Instancier une ArrayList dans le constructeur
		lesDvd = new ArrayList<Dvd>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return Renvoie lesDvd : collection des Dvd.
	 */
	public ArrayList<Dvd> getLesDvd() {
		return lesDvd;
	}

	/**
	 * @param lesDvd lesDvd collection de Dvd.
	 */
	public void setLesDvd(ArrayList<Dvd> lesDvd) {
		this.lesDvd = lesDvd;
	}

	/**
	 * jout d'un DvdFilm dans la collection lesDvd
	 * @param unDvdFilm
	 */
	public void ajoutDvd(Dvd unDvd){
		// Ajouter un DVD dans la collection
		lesDvd.add(unDvd);
	}
	
	/**
	 * retourne l'index (la position) du Dvd dans la collection
	 * (-1 si le Dvd n'est pas trouvé)	
	 * @param numDvd
	 * @return
	 */
	public int indexDvdFilm(int numDvd){
		int condition = 0;
		int indexDvd = -1;
		int i = 0;
		while ((condition == 0) && (i < lesDvd.size())){
			if (lesDvd.get(i).getNum() == numDvd) {
				condition = 1; // On sort de la boucle
				indexDvd = i;
			}
			i++;
		}
		return indexDvd;
	  }
	
	/**
	 * @param unNumDvd numéro du Dvd que la fonction doit retourner
	 * @return un objet Dvd dont le numéro est passé en paramètre de la fonction
	 * rq : se servir de la méthode "public int indexDvdFilm(int numDvd)"
	 */
	public Dvd retournerUnDvd(int unNumDvd) {
		int dvd = indexDvdFilm(unNumDvd);
		return lesDvd.get(dvd);
	}

	/**
	 * ajout d'une quantité de dvd au stock du DVD dont l’index dans la collection est passé en paramètre
	 * @param indexDvd index du Dvd dans la collection (on suppose qu'un test à été effectué pour vérifier que l'index correspond à un Dvd dans la collection
	 * @param qteAjout quantité à ajouter au stock concernant le Dvd dont l'index est passé en paramètre
	 */
	public void ajouterStock(int indexDvd, int qteAjout){
		// Proposition de solution d'erreur si la quantité du stock est négative
		if(lesDvd.get(indexDvd).getQteStock() < 0){
			System.out.println("Votre quantité de stock est actuellement négative, réinitialisation du stock à 0...");
			lesDvd.get(indexDvd).setQteStock(0);
		}
		
		int qteStockDvd = lesDvd.get(indexDvd).getQteStock() + qteAjout;
		lesDvd.get(indexDvd).setQteStock(qteStockDvd);
	}
	
	/**
	 * retrait d'une quantité de dvd au stock du DVD dont l’index est passé en paramètre
	 * @param indexDvd index du Dvd dans la collection (on suppose qu'un test à été effectué pour vérifier que l'index correspond à un Dvd dans la collection
	 * @param qteRetrait quantité à retirer du stock concernant le Dvd dont l'index est passé en paramètre
	 */
	public void retirerStock(int indexDvd, int qteRetrait){
		// Proposition de solution d'erreur si le résultat du calcul sera négatif
		if(lesDvd.get(indexDvd).getQteStock() < qteRetrait){
			System.out.println("Impossible de faire le calcul, car le résultat sera négatif.\nJe vais ajouter la valeur de la quantité de retrait à la quantité de stock du dvd souhaité pour avoir un stock non négatif.");
			lesDvd.get(indexDvd).setQteStock(qteRetrait);
		}
		
		int qteStockDvd = lesDvd.get(indexDvd).getQteStock() - qteRetrait;
		lesDvd.get(indexDvd).setQteStock(qteStockDvd);
	}
	
	/**
	 * retourne tous les Dvd appartenant à un genre passé en paramètre
	 * @param unGenre
	 */
	public ArrayList<Dvd> retourneGenreDvd(String unGenre){	
		ArrayList<Dvd> dvdGenre;
		dvdGenre = new ArrayList<Dvd>();
		
		for(Dvd unDvd : lesDvd) {
			if(unDvd.getGenre() == unGenre) {
				dvdGenre.add(unDvd);
			}
		}
		return dvdGenre;
	}
	
	/**
	 * retourne tous les Dvd appartenant à zone dont on a passé le numéro en paramètre
	 * @param uneZone
	 */
	public ArrayList<Dvd> retourneZoneDvd(int uneZone){
		ArrayList<Dvd> dvdZone;
		dvdZone = new ArrayList<Dvd>();
		
		for(Dvd unDvd : lesDvd){
			if(unDvd.getZone() == uneZone){
				dvdZone.add(unDvd);
			}
		}
		return dvdZone;
	}
	
	/**
	 * retourne une ArrayList contenant tous les DVD présents dans la collection lesDvd
	 * pour lesquels la quantité en stock est inférieure à la quantité minimal
	 */	
	public ArrayList<Dvd> dvdAReapprovisionner(){
		// Collection contenant les dvd dont le stock est insuffisant
		ArrayList<Dvd> dvdStockInsu;
		dvdStockInsu = new ArrayList<Dvd>();
		
		for(Dvd unDvd : lesDvd) {
			if(unDvd.getQteStock() < unDvd.getStockMinimum()){
				dvdStockInsu.add(unDvd);
			}
		}
		return dvdStockInsu;
	}
}

package dvd.modele;


public class Dvd extends Media {

	protected int duree ;
	protected String genre;
	protected int anneeFilm ;
	protected int zone ;

	/**
	* @param num numero 
	 * @param unTitre d
	 * @param unEditeur 
	 * @param uneDateSortie 
	 * @param unQteStock quantite en stock
	 * @param unStockMinimum quantité minimum à avoir en stock
	 * @param unPrixUnitHT prix unitaire hor taxe
	 * @param duree duree du dvd en minutes
	 * @param genre
	 * @param anneeFilm
	 * @param zone numero de zone en fonction du pays (2 pour la France)
	 */
	public Dvd(int unNum, String unTitre, String unEditeur,
			String uneDateSortie, int uneQteStock, int unStockMinimum,
			double unPrixUnitHT, int uneDuree, String unGenre, int uneAnneeFilm,
			int uneZone) {
		super(unNum, unTitre, unEditeur, uneDateSortie, uneQteStock,
				unStockMinimum, unPrixUnitHT);
		this.duree = uneDuree;
		this.genre = unGenre;
		this.anneeFilm = uneAnneeFilm;
		this.zone = uneZone;
	}

	/**
	 * @return Renvoie duree duree du dvd en minutes.
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree  duree du dvd en minutes.
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	/**
	 * @return Renvoie genre du film (policier, science fiction, ...).
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre genre du film (policier, science fiction, ...).
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return Renvoie anneeFilm format chiffre AAAA.
	 */
	public int getAnneeFilm() {
		return anneeFilm;
	}

	/**
	 * @param anneeFilm anneeFilm format chiffre AAAA.
	 */
	public void setAnneeFilm(int anneeFilm) {
		this.anneeFilm = anneeFilm;
	}

	/**
	 * @return Renvoie zone numero de zone en fonction du pays (2 pour la France).
	 */
	public int getZone() {
		return zone;
	}

	/**
	 * @param zone numero de zone en fonction du pays (2 pour la France).
	 */
	public void setZone(int zone) {
		this.zone = zone;
	}	
}
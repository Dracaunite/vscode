package ag56.modele;

public class Voyage {
	// attributs
	protected String codeVoyage, libVoyage, dateDebut, dateFin;
	protected int nbPlaces, nbInscrits;
	protected Pays lePays;
	
	// Constructeurs
	public Voyage() {}
	
	public Voyage(String unCodeVoyage, String unLibVoyage, String uneDateDebut, String uneDateFin, int unNbPlaces, int unNbInscrits, Pays unPays) 
	{
		this.codeVoyage = unCodeVoyage; this.libVoyage = unLibVoyage; this.dateDebut = uneDateDebut; this.dateFin = uneDateFin;
		this.nbPlaces = unNbPlaces; this.nbInscrits = 0;this.lePays = unPays;
	}
	
	// Accesseurs et mutateurs
	public int getNbInscrits() { return nbInscrits; }
	
	public void setNbInscrits(int unNbInscrits) { this.nbInscrits = unNbInscrits; }
	
	public String getCodeVoyage() { return codeVoyage; }
	
	public void setCodeVoyage(String unCodeVoyage) { this.codeVoyage = unCodeVoyage; }
	
	public String getLibVoyage() { return libVoyage; }
	
	public void setLibVoyage(String unLibVoyage) { this.libVoyage = unLibVoyage; }
	
	public String getDateDebut() { return dateDebut; }
	
	public void setDateDebut(String uneDateDebut) { this.dateDebut = uneDateDebut; }
	
	public String getDateFin() { return dateFin; }
	
	public void setDateFin(String uneDateFin) { this.dateFin = uneDateFin; }
	
	public int getNbPlaces() { return nbPlaces; }
	
	public void setNbPlaces(int unNbPlaces) { this.nbPlaces = unNbPlaces; }
	
	public Pays getLePays() { return lePays; }
	
	public void setLePays(Pays unPays) { this.lePays = unPays; }
	
	// On ajoute les nouveaux inscrits en plus sur la liste des inscrits
	public void ajouterInscrits(int nouveauxInscrits) { this.nbInscrits += nouveauxInscrits; }
	
	// On retire les inscrits en moins sur la liste des incrits
	public void retirerInscrits(int inscritsEnMoins) { this.nbInscrits -= inscritsEnMoins; }
}

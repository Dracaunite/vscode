package ag56.modele;

public class Voyage {
		// attributs
	protected String codeVoyage, libVoyage, dateDebut, dateFin;
	protected int nbPlaces, nbInscrits;
	protected Pays lePays;
	protected Guide leGuide;
	
		// constructeur de la classe
	public Voyage(String codeVoyage, String libVoyage, String dateDebut,String dateFin, int nbPlaces,Pays lePays) {
			this.codeVoyage = codeVoyage;
			this.libVoyage = libVoyage;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.nbPlaces = nbPlaces;
			this.nbInscrits = 0;
			this.lePays = lePays;
		}

	// accesseurs et mutateurs
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

	public void setLePays(Pays unPays) {
		this.lePays = unPays;
	}
	
	public Guide getLeGuide() {
		return leGuide;
	}
	
	public void setLeGuide(Guide leGuide) { this.leGuide = leGuide; }
	
	public void ajouterInscrits(int nouveauxInscrits){
		if(nbInscrits > nbPlaces) {
			System.out.println("Nombre de nouveaux inscrits trop grand !");
		}
		
		else {
			nbPlaces = nbPlaces - nouveauxInscrits;
			nbInscrits = nbInscrits + nouveauxInscrits;
		}
	}
	
	public void retirerInscrits(int inscritsEnMoins){
		if(inscritsEnMoins>nbInscrits) {
			System.out.println("Le nombre d'inscrits � retirer est trop grand !");
		}
		
		else	{
			nbPlaces=nbPlaces+inscritsEnMoins;
			nbInscrits= nbInscrits-inscritsEnMoins;
		}
	}
	
	public boolean affecter(Guide unGuide) {
		boolean retour = false;
		
		if(unGuide.getLePays().getCodePays()==lePays.getCodePays()) {
			retour = true;
			setLeGuide(unGuide);
		}
		return retour;
	}
}
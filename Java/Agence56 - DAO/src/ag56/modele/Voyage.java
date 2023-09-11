package ag56.modele;

public class Voyage {
		// attributs
	protected String codeVoyage;
	protected String libVoyage;
	protected String dateDebut;
	protected String dateFin ;
	protected int nbPlaces;
	protected int nbInscrits;
	protected Pays lePays;
	protected Salarie leGuide;
	
	public Voyage() {}

	public Voyage(String codeVoyage, String libVoyage, String dateDebut, String dateFin, int nbPlaces, Pays lePays, Salarie leGuide) {
			this.codeVoyage = codeVoyage;
			this.libVoyage = libVoyage;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.nbPlaces = nbPlaces;
			this.nbInscrits = 0;
			this.lePays = lePays;
			this.leGuide = leGuide;
		}

		// accesseurs et mutateurs
	public int getNbInscrits() {
		return nbInscrits;
	}
	public void setNbInscrits(int unNbInscrits) {
		this.nbInscrits = unNbInscrits;
	}
	
	public String getCodeVoyage() {
		return codeVoyage;
	}

	public void setCodeVoyage(String unCodeVoyage) {
		this.codeVoyage = unCodeVoyage;
	}

	public String getLibVoyage() {
		return libVoyage;
	}

	public void setLibVoyage(String unLibVoyage) {
		this.libVoyage = unLibVoyage;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String uneDateDebut) {
		this.dateDebut = uneDateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String uneDateFin) {
		this.dateFin = uneDateFin;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int unNbPlaces) {
		this.nbPlaces = unNbPlaces;
	}

	public Pays getlePays() {
		return lePays;
	}

	public void setlePays(Pays unPays) {
		this.lePays = unPays;
	}
	
	public Salarie getLeGuide() {
		return leGuide;
	}
	
	public void setLeGuide(Salarie leGuide) {
		this.leGuide = leGuide;
	}
	
	public void ajouterInscrits(int nouveauxInscrits){
		if(nbInscrits + nouveauxInscrits > nbPlaces){
			System.out.println("Nombre de nouveaux inscrits trop grand !");
		}
		
		else
		{
			nbInscrits = nbInscrits + nouveauxInscrits;
		}
	}
	
	public void retirerInscrits(int inscritsEnMoins){
		if(inscritsEnMoins > nbInscrits){
			System.out.println("Le nombre d'inscrits � retirer est trop grand !");
		}
		
		else
		{
			nbInscrits = nbInscrits - inscritsEnMoins;
		}
	}
}


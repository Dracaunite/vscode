package ag56.modele;

public class Salarie extends Personne {
	
	protected String specialites;
	protected double primeJournaliere;
	protected Pays lePays;
	protected int nbVoyagesEncadres;
	
	// constructeurs
	public Salarie() {}
	
	public Salarie(String unCode, String unNom, String unPrenom) {
		super(unCode, unNom, unPrenom);
	}

	public Salarie(String unCode, String unNom, String unPrenom, String uneRue,
			String unCp, String uneVille, String unPays, String unTel, String desSpecialites, Pays lePays, double unePrimeJournaliere) {
		super(unCode, unNom, unPrenom, uneRue, unCp, uneVille, unPays, unTel);
		specialites = desSpecialites;
		primeJournaliere = unePrimeJournaliere;
		this.lePays = lePays;
		nbVoyagesEncadres = 0;
	}
	
	//accesseurs	
	public double getPrimeJournaliere() {
		return primeJournaliere;
	}

	public void setPrimeJournaliere(double unePrimeJournaliere) {
		this.primeJournaliere = unePrimeJournaliere;
	}
	
	public String getSpecialites() {
		return specialites;
	}

	public void setSpecialites(String desSpecialites) {
		this.specialites = desSpecialites;
	}

	public int getNbVoyagesEncadres() {
		return nbVoyagesEncadres;
	}

	public void setNbVoyagesEncadres(int unNbVoyagesEncadres) {
		this.nbVoyagesEncadres = unNbVoyagesEncadres;
	}
	
	public Pays getlePays() {
		return lePays;
	}

	public void setlePays(Pays lePays) {
		this.lePays = lePays;
	}

	public void augmenterPrime(double coefficientMultiplicateur){
		primeJournaliere = primeJournaliere * coefficientMultiplicateur;
	}

	public void ajouterNbVoyagesEncadres(int unNbVoyages){
		nbVoyagesEncadres = nbVoyagesEncadres + unNbVoyages;
	}
}

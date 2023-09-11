package ag56.modele;

public class Guide extends Personne {
	
	protected String specialites;
	protected double primeJournaliere;
	protected Pays lePays;
	protected int nbVoyagesEncadres;
	
	// constructeurs
	public Guide() { }
	
	public Guide(String unCode, String unNom, String unPrenom) {
		super(unCode, unNom, unPrenom);
	}

	public Guide(String unCode, String unNom, String unPrenom, String uneRue,
			String unCp, String uneVille, String unPays, String unTel, String desSpecialites, Pays unePays, double unePrimeJournaliere) {
		super(unCode, unNom, unPrenom, uneRue, unCp, uneVille, unPays, unTel);
		specialites = desSpecialites;
		primeJournaliere = unePrimeJournaliere;
		lePays = unePays;
		nbVoyagesEncadres = 0;
	}
	
	//accesseurs	
	public double getPrimeJournaliere() { return primeJournaliere; }

	public void setPrimeJournaliere(double unePrimeJournaliere) { this.primeJournaliere = unePrimeJournaliere; }
	
	public String getSpecialites() { return specialites; }

	public void setSpecialites(String desSpecialites) { this.specialites = desSpecialites; }

	public int getNbVoyagesEncadres() {
		return nbVoyagesEncadres; }

	public void setNbVoyagesEncadres(int unNbVoyagesEncadres) { this.nbVoyagesEncadres = unNbVoyagesEncadres; }
	
	public Pays getLePays() { return lePays; }

	public void setLePays(Pays lePays) { this.lePays = lePays; }

	public void augmenterPrime(double coefficientMultiplicateur){ primeJournaliere=primeJournaliere*coefficientMultiplicateur; }

	public void ajouterNbVoyagesEncadres(int unNbVoyages){ nbVoyagesEncadres = nbVoyagesEncadres + unNbVoyages; }
	
	public boolean verifier(Voyage unVoyage) {
		boolean retour = false;
		
		if(unVoyage.getLePays().getCodePays()==lePays.getCodePays()) {
			retour = true;
			unVoyage.setLeGuide(this);
		}
		return retour;
	}
}

package ag56.modele;

// Mise en place de la classe fille : Guide
public class Guide extends Personne { // extends permet de signifier un héritage
	protected String specialites;
	protected double primeJournaliere;

	// Constructeurs
	public Guide() {}

	// super() : récupère les données de la superclasse  (attributs)
	public Guide(String unCode, String unNom, String unPrenom) { super(unCode, unNom, unPrenom); }

	public Guide(String unCode, String unNom, String unPrenom, String uneRue, String unCp, String uneVille, String unPays, String unTel, String desSpecialites) {
		super(unCode, unNom, unPrenom, uneRue, unCp, uneVille, unPays, unTel);
		specialites = desSpecialites;
		primeJournaliere = 0;
	}

	// Accesseurs et mutateurs
	public String getSpecialite() { return specialites; }
	
	public void setSpecialite(String desSpecialites) { this.specialites = desSpecialites; }
	
	public double getPrimeJournaliere() { return primeJournaliere; }

	public void setPrimeJournaliere(double unePrimeJournaliere) { this.primeJournaliere = unePrimeJournaliere; }
}

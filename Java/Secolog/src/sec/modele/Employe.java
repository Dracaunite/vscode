package sec.modele;

public class Employe extends Personne {

	protected String matricule;
	protected String dateEmbauche;
	protected String fonction;
	
	/**
	 * @param nom employe
	 * @param prenom employe
	 * @param email employe
	 * @param telephone employe
	 * @param matricule employe
	 * @param dateEmbauche employe
	 * @param fonction employe
	 */
	public Employe(String matricule, String nom, String prenom, String email, String telephone, String dateEmbauche, String fonction) {
		super(nom, prenom, email, telephone);
		this.matricule = matricule;
		this.dateEmbauche = dateEmbauche;
		this.fonction = fonction;
	}
	
	/**
	 * @return Renvoie matricule employe.
	 */
	public String getMatricule() {
		return matricule;
	}
	
	/**
	 * @param matricule : matricule employe.
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	/**
	 * @return Renvoie dateEmbauche employe.
	 */
	public String getDateEmbauche() {
		return dateEmbauche;
	}
	
	/**
	 * @param dateEmbauche : dateEmbauche employer.
	 */
	
	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	/**
	 * @return Renvoie fonction employe
	 */
	public String getFonction() {
		return fonction;
	}
	
	/**
	 * @param fonction : fonction employe
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
}

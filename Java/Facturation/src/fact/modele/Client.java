package fact.modele;

public class Client {

	protected String code;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String cp;
	protected String ville;
	protected String email;
	protected String telephone;
	
	/**
	 * @param code caractères alphanumériques, pas de caractères spéciaux, limité à 6 caractères, non nul
	 * @param nom nom du client non nul
	 * @param prenom prénom du client
	 * @param adresse adresse du client, non nul
	 * @param cp  du client, 5 chiffre le format ne peut être un chiffre, non nul
	 * @param ville du client, non nul
	 * @param email adresse email du client, format d'un email à vérifier, non nul
	 * @param telephone numéro de téléphone portable ou fixe du client, format xx.xx.xx.xx.xx (espace ou - acceptés à la place des .) non nul
	 */
	public Client(String code, String nom, String prenom, String adresse, String cp, String ville, String email,
			String telephone) {
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.email = email;
		this.telephone = telephone;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getCp() {
		return cp;
	}
	
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}

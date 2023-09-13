package sec.modele;

// La classe Client hérite des attributs et méthodes de la classe Personné
public class Client extends Personne{
	
	protected String code;
	protected String adresse;
	protected String cp;
	protected String ville;


	// Constructeur de la classe Client
	public Client(String code, String nom, String prenom, String adresse, String cp, String ville, String telephone, String email) {
		// Récupère les attributs de la classe personne
		super(nom, prenom, telephone, email);
		this.code = code;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	
	// Getters and Setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
}
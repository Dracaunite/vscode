package sec.modele;

abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String email;
	protected String telephone;
	
	public Personne() {
	}

	/**
	 * @param nom : nom de la personne
	 * @param prenom : prenom de la personne
	 * @param email : email de la personne
	 * @param telephone : telephone de la personne
	 * constructeur avec valorisation de tous les attributs
	 */
	
	public Personne(String nom, String prenom, String email, String telephone) {
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setTelephone(telephone);
	}

	/**
	 * @return Renvoie nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : nom de la personne
	 */
	public void setNom(String nom) {
		if (nom == null) {
			throw new IllegalArgumentException(
					"la propri�t� nom ne peut pas �tre null");
		}
		this.nom = nom;
	}

	/**
	 * @return Renvoie prenom telephone de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom : prenom de la personne.
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return Renvoie email de la personne
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email : email de la personne
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Renvoie telephone de la personne
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone : telephone de la personne
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}

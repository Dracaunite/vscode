package ag56.modele;


public class Personne {
	protected String code;
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String cp;
	protected String ville;
	protected String pays;
	protected String tel;
	
	public Personne(){}
		
	/**
	 * @param unCode code de la personne : chaine de 6 caractères
	 * @param unNom nom de la personne
	 * @param unPrenom prenom de la personne
	 */
	public Personne(String unCode, String unNom, String unPrenom){
		code = unCode;
		nom = unNom;
		prenom = unPrenom;
	}
	/**
	 *  @param unCode code de la personne : chaine de 6 caractères
	 * @param unNom nom de la personne
	 * @param unPrenom prenom de la personne
	 * @param uneRue rue de la personne
	 * @param unCp code postal : chaine de 5 caractères
	 * @param uneVille ville de la personne
	 * @param unPays pays de la personne
	 * @param unTel téléphone de la personne
	 */
	public Personne(String unCode, String unNom, String unPrenom, String uneRue, String unCp, String uneVille, String unPays, String unTel){
		code = unCode;
		nom = unNom;
		prenom = unPrenom;
		rue = uneRue;
		cp = unCp;
		ville = uneVille;
		pays = unPays;
		tel = unTel;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String unCode) {
		this.code = unCode;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String unNom) {
		this.nom = unNom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String unPrenom) {
		this.prenom = unPrenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String uneRue) {
		this.rue = uneRue;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String unCp) {
		this.cp = unCp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String uneVille) {
		this.ville = uneVille;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String unPays) {
		this.pays = unPays;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String unTel) {
		this.tel = unTel;
	}
}

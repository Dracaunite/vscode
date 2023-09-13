package sec.modele;

public class Tache {
	protected int numero;
	protected String nom;
	protected String specificationTechnique;
	protected String dateLimiteRealisation;
	protected Employe leDeveloppeur; // Association Employé
	
	// Constructeur
	public Tache(int numero, String nom, String specificationTechnique, String dateLimiteRealisation, Employe leDeveloppeur){
		this.numero = numero;
		this.nom = nom;
		this.specificationTechnique = specificationTechnique;
		this.dateLimiteRealisation = dateLimiteRealisation;
		this.leDeveloppeur = leDeveloppeur;
	}

	// Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecificationTechnique() {
		return specificationTechnique;
	}

	public void setSpecificationTechnique(String specificationTechnique) {
		this.specificationTechnique = specificationTechnique;
	}

	public String getDateLimiteRealisation() {
		return dateLimiteRealisation;
	}

	public void setDateLimiteRealisation(String dateLimiteRealisation) {
		this.dateLimiteRealisation = dateLimiteRealisation;
	}

	public Employe getLeDeveloppeur() {
		return leDeveloppeur;
	}

	public void setLeDeveloppeur(Employe leDeveloppeur) {
		this.leDeveloppeur = leDeveloppeur;
	}
}
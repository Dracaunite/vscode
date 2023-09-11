package zoo.modele;

public class Animal {
	protected String code, nom, alimentation;
	protected Pays origine;

	public Animal(String code, String nom, String alimentation, Pays origine) {
		this.code = code;
		this.nom = nom;
		this.alimentation = alimentation;
		this.origine = origine;
	}

	public String getCode() { return code; }

	public void setCode(String code) { this.code = code; }

	public String getNom() { return nom; }

	public void setNom(String nom) { this.nom = nom; }

	public String getAlimentation() { return alimentation; }

	public void setAlimentation(String alimentation) { this.alimentation = alimentation; }

	public Pays getOrigine() { return origine; }

	public void setOrigine(Pays origine) { this.origine = origine; }
}
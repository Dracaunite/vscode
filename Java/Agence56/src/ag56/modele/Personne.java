package ag56.modele;

public class Personne {
	protected String code, nom, prenom, rue, cp, ville, pays, tel;
	
	// Constructeurs
	public Personne() {}
	
	public Personne(String unCode, String unNom, String unPrenom) { this.code = unCode; this.nom = unNom; this.prenom = unPrenom; }
	
	public Personne(String unCode, String unNom, String unPrenom, String uneRue, String unCp, String uneVille, String unPays, String unTel)
	{
		this.code = unCode; this.nom = unNom; this.prenom = unPrenom; this.rue = uneRue; this.cp = unCp; this.ville = uneVille; 
		this.pays = unPays; this.tel = unTel;
	}
	
	// Accesseurs et mutateurs
	public String getUnCode() { return code; }
	
	public void setUnCode(String unCode) { this.code = unCode; }
	
	public String getUnNom() { return nom; }
	
	public void setUnNom(String unNom) { this.nom = unNom; }
	
	public String getUnPrenom() { return prenom; }
	
	public void setUnPrenom(String unPrenom) { this.prenom = unPrenom; }
	
	public String getUneRue() { return rue; }
	
	public void setUneRue(String uneRue) { this.rue = uneRue; }
	
	public String getUnCp() { return cp; }
	
	public void setUnCp(String unCp) { this.cp = unCp; }
	
	public String getUneVille() { return ville; }
	
	public void setUneVille(String uneVille) { this.ville = uneVille; }
	
	public String getUnPays() { return pays; }
	
	public void setUnPays(String unPays) { this.pays = unPays; }
	
	public String getUnTel() { return tel; }
	
	public void setUnTel(String unTel) { this.tel = unTel; }
}
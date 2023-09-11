package ag56.modele;

public class Personne {
	protected String code, nom, prenom, rue, cp, ville, pays, tel;
	
	public Personne() { }
		
	public Personne(String unCode, String unNom, String unPrenom) { code = unCode; nom = unNom; prenom = unPrenom; }
	
	public Personne(String unCode, String unNom, String unPrenom, String uneRue, String unCp, String uneVille, String unPays, String unTel){
		code = unCode; nom = unNom; prenom = unPrenom; rue = uneRue; cp = unCp; ville = uneVille; pays = unPays; tel = unTel; }

	public String getCode() { return code; }

	public void setCode(String unCode) { this.code = unCode; }

	public String getNom() { return nom; }

	public void setNom(String unNom) { this.nom = unNom; }

	public String getPrenom() { return prenom; }

	public void setPrenom(String unPrenom) { this.prenom = unPrenom; }

	public String getRue() { return rue; }

	public void setRue(String uneRue) { this.rue = uneRue; }

	public String getCp() { return cp; }

	public void setCp(String unCp) { this.cp = unCp; }

	public String getVille() { return ville; }

	public void setVille(String uneVille) { this.ville = uneVille; }

	public String getPays() { return pays; }

	public void setPays(String unPays) { this.pays = unPays; }

	public String getTel() { return tel; }

	public void setTel(String unTel) { this.tel = unTel; }
}
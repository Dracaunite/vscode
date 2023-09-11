/*
 * Cr�� le 29 d�c. 2011
 * Auteur Thieblemont Isabelle
 * Modifi� le 24 jan.2012
 */
package ag56.modele; // package dans lequel est inclu la classe

public class Pays {
	// attributs
	protected String codePays, libPays, formalites, vaccins, conseils;
	
	//m�thodes : constructeurs
	public Pays(){
		//constructeur --> ne valorise pas les attributs de la classe, simple instanciation de l'objet
	}
	public Pays(String unCodePays,String unLibPays, String desFormalites, String desVaccins, String desConseils){
		//constructeur --> valorise les attributs de la classe
		this.codePays = unCodePays;
		this.libPays = unLibPays;
		this.formalites = desFormalites;
		this.vaccins = desVaccins;
		this.conseils = desConseils;
	}
	
	// m�thodes : accesseurs --> peuvent �tre g�n�r�s automatiquement
	public String getCodePays() { return codePays; }

	public void setCodePays(String CodePays) { this.codePays = CodePays; }

	public String getLibPays() { return libPays; }

	public void setLibPays(String unLibPays) { this.libPays = unLibPays; }
	
	public String getFormalites() { return formalites; }
	
	public void setFormalites(String desFormalites) { this.formalites = desFormalites; }
	
	public String getVaccins() { return vaccins; }
	
	public void setVaccins(String desVaccins) { this.vaccins = desVaccins; }
	
	public String getConseils() { return conseils; }
	
	public void setConseils(String desConseils) { this.conseils = desConseils; }
}

package ag56.modele;

public class Pays {
	// attributs
	protected String codePays, libPays, formalites, vaccins, conseils;
	
	// Constructeur
	public Pays() {}
	
	public Pays(String unCodePays, String unLibPays, String desFormalites, String desVaccins, String desConseils) {
		this.codePays = unCodePays; this.libPays = unLibPays; this.formalites = desFormalites; this.vaccins = desVaccins; this.conseils = desConseils;
	}
	
	// Accesseurs et mutateurs
	public String getCodePays() { return codePays; }
	
	public void setCodePays(String unCodePays) { this.codePays = unCodePays; }
	
	public String getLibPays() { return libPays; }
	
	public void setLibPays(String unLibPays) { this.libPays = unLibPays; }
	
	public String getFormalites() { return formalites; }
	
	public void setFormalites(String desFormalites) { this.formalites = desFormalites; }
	
	public String getVaccins() { return vaccins; }
	
	public void setVaccins(String desVaccins) {
		this.vaccins = desVaccins;
	}
	
	public String getConseils() { return conseils; }
	
	public void setConseils(String desConseils) { this.conseils = desConseils; }
}

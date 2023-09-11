package pers.modele;

public class Notation {
	// Attributs
	protected double note;
	protected String matiere;
	protected Prof prof;
	
	public Notation(double uneNote, String uneMatiere, Prof leProf) {
		this.note = uneNote; this.matiere = uneMatiere; this.prof = leProf;
	}
	
	// Accesseurs
	public double getUneNote() { return note; }
	
	public void setUneNote(double uneNote) { this.note = uneNote; }
	
	public String getUneMatiere() { return matiere; }
	
	public void setUneMatiere(String uneMatiere) { this.matiere = uneMatiere; }
}

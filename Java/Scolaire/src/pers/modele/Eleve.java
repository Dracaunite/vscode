package pers.modele;

/*Titre :        Eleve
  Description :  Classe Eleve*/


public class Eleve extends Personne {
	// Attributs
	protected String section;
    protected int joursAbs, nbNotations = 0;
    protected Notation tabNotations [] = new Notation [20]; // Association (Eleve / Notation) => tableau de 20 valeurs
    
    public Eleve(String unNom, String unPrenom, int unAge, String uneSection) {
    	/* super va chercher le constructeur de la super classe*/
    	super(unNom, unPrenom, unAge);
    	this.section = uneSection; this.joursAbs = 0;
    }
    
    // Accesseurs
    public String getSection() {return section; }

    public void setSection(String uneSection) { this.section = uneSection; }

    public int getJoursAbs() { return joursAbs; }

    public void setJoursAbs(int joursAbs) { this.joursAbs = joursAbs; }
    
    // Méthodes
    public void ajouterNotation(Notation uneNotation) {
    	// Ajoute une note dans le tableau
    	if(nbNotations < 20) {
    		tabNotations[nbNotations] = uneNotation;
    		nbNotations++;
    	}
    }
    
    public void incAbsences(int unNombreDeJours) { joursAbs = joursAbs + unNombreDeJours; }
    
    public double calculMoyenneMatiere(String uneMatiere) {
    	// On parcourt le tableau pour additionner les valeurs pour calculer la moyenne par la suite
    	double moyenne = 0;
    	
    	for (int i = 0; i < nbNotations; i++) {
    		moyenne += tabNotations[i].getUneNote();
    	}
    	
    	moyenne /= nbNotations; // moyenne = moyenne / nbNotations => valeur totale des notes divisée par le nombre de notes
    	
    	return moyenne;
    }
}
package pers.modele;

/*Titre :        Prof
  Description :  Classe Prof*/


public class Prof extends Personne
{   /* herite des proprietes de la classe dont elle herite */
    protected String matiere;
    
    public Prof(String unNom, String unPrenom, int unAge, String uneMatiere) {
    	super(unNom, unPrenom, unAge);
    	this.matiere = uneMatiere;
    }
    
    // Accesseurs
    public String getMatiere() { return matiere;}
    
    public void setMatiere(String uneMatiere) { this.matiere = uneMatiere; }
}
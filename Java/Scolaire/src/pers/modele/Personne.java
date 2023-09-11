package pers.modele;

/*Titre :        Personne
  Description :  classe Personne*/


public class Personne {
	protected String nom, prenom;
	protected int age;

	public Personne(String unNom, String unPrenom, int unAge)
	{
		this.nom = unNom;
        this.prenom = unPrenom;
        this.age = unAge;
	}
  
  	// Accesseurs
	public String getNom() { return nom; }
	
	public void setNom(String unNom) { this.nom = unNom; }
	
	public String getPrenom() { return prenom; }
	
	public void setPrenom(String unPrenom) { this.prenom = unPrenom; }
	
	public int getAge() { return age; }
	
	public void setAge(int unAge) { this.age = unAge; }

}
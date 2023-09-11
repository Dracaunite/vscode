package ag56.modele;

import java.util.ArrayList; // Importation des collections

public class Randonnee extends Voyage {
	protected int niveau;
	protected ArrayList<Randonneur> colRand; // Création d'une collection

	public Randonnee(String codeVoyage, String libVoyage, String dateDebut,
			String dateFin, int nbPlaces, Pays lePays, Randonneur leRandonneur, int niveau) {
		super(codeVoyage, libVoyage, dateDebut, dateFin, nbPlaces, lePays);
		this.niveau = niveau;
	}

	public int getNiveau() { return niveau; }

	public void setNiveau(int unNiveau) { this.niveau = unNiveau; }

	public ArrayList<Randonneur> getColRand() { return colRand;}

	public void setColRand(ArrayList<Randonneur> uneColRand) { this.colRand = uneColRand; }
	
	// Ajouter un randonneur dans une collection
	public void ajouterRandonneur(Randonneur unRandonneur) { colRand.add(unRandonneur); }
	
	public int retourneIndexRandonneur(String unCodeRandonneur){
		int indexRand = 0;
		
		for (int i = 0; i < colRand.size(); i++) {
			// Cas où le code de la personne correspond à celui du randonneur recherché
			if (colRand.get(i).getCode() == unCodeRandonneur) {
				indexRand = i;
			}
		}
		return indexRand;
	  }
	
	public void supprimerRandonneur(String unCodeRandonneur){
		// On verifie l'index de la collection (en dehors de la collection ou pas)
		if (retourneIndexRandonneur(unCodeRandonneur) != -1){
			colRand.remove(retourneIndexRandonneur(unCodeRandonneur));
		}
	}
		
	public ArrayList<Randonneur> donnerRandonneursSansNiveau() {
		// Il faut retourner la ListArray des Randonneur dont le niveau est inférieur à l’attribut « niveau »
		ArrayList<Randonneur> randonneursSansNiveau = new ArrayList<Randonneur> ();
		
		// Parcourir une ArrayList (collection)
		for(Randonneur unRand : colRand) {
			if (unRand.donnerNiveau() < niveau) {
				randonneursSansNiveau.add(unRand);
			}
		}
		return randonneursSansNiveau;
	}
	
	public boolean inscrire(Randonneur unRand) {
		boolean retour = false;
		if (unRand.donnerNiveau() >= niveau && (nbPlaces - nbInscrits) > 0) {
			nbInscrits++;
			retour = true;
		}
		return retour;
	}
}

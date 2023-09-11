package ski.modele;


public class Skieur {
	protected int noSkieur;
	protected String nomSkieur;
	protected Station laStation;
	protected int noClassement;
	
	/**
	 * @param pNoSkieur numero du skieur
	 * @param pNomSkieur nom du skieur
	 * @param pUneStat station de ski à laquelle est rataché le skieur
	 * remarque : l'attribut noClassement --> numero de classement n'est pas valorisé lors de l'instanciation
	 * il le sera à partir de la methode setClassement
	 */
	public Skieur(int pNoSkieur, String pNomSkieur, Station pUneStat){
		noSkieur = pNoSkieur;
		nomSkieur = pNomSkieur;
		laStation = pUneStat;
	}

	public int getNoSkieur() {
		return noSkieur;
	}

	public void setNoSkieur(int noSkieur) {
		this.noSkieur = noSkieur;
	}

	public String getNomSkieur() {
		return nomSkieur;
	}

	public void setNomSkieur(String nomSkieur) {
		this.nomSkieur = nomSkieur;
	}

	public Station getLaStation() {
		return laStation;
	}

	public void setLaStation(Station laStation) {
		this.laStation = laStation;
	}

	public int getNoClassement() {
		return noClassement;
	}

	public void setNoClassement(int noClassement) {
		this.noClassement = noClassement;
	}
}

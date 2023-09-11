package ski.modele;

import java.util.ArrayList;


public class Competition {
	protected int noComp;				 
	protected String typeComp; 			 
	protected String dateComp;			
	protected Station laStation;		
	protected ArrayList<Skieur> lesSkieurs;
	
	/**
	 * @param noComp Numéro de compétition
	 * @param typeComp Type de la compétition
	 * @param dateComp Date de la compétition
	 * @param laStation Station où se déroule la compétition
	 * instanciation de la collection lesSkieurs : skieurs participants à la compétition
	 */
	
	public Competition(int noComp, String typeComp, String dateComp, Station laStation) {
		this.noComp = noComp;
		this.typeComp = typeComp;
		this.dateComp = dateComp;
		this.laStation = laStation;
		lesSkieurs = new ArrayList <Skieur>();
	}
	
	/**
	 * @return Renvoie noComp.
	 */
	public int getNoComp() {
		return noComp;
	}

	/**
	 * @param noComp 
	 */
	public void setNoComp(int noComp) {
		this.noComp = noComp;
	}

	/**
	 * @return Renvoie typeComp.
	 */
	public String getTypeComp() {
		return typeComp;
	}

	/**
	 * @param typeComp 
	 */
	public void setTypeComp(String typeComp) {
		this.typeComp = typeComp;
	}

	/**
	 * @return Renvoie dateComp.
	 */
	public String getDateComp() {
		return dateComp;
	}

	/**
	 * @param dateComp 
	 */
	public void setDateComp(String dateComp) {
		this.dateComp = dateComp;
	}

	/**
	 * @return Renvoie laStation Station où se déroule la compétition
	 */
	public Station getLaStation() {
		return laStation;
	}

	/**
	 * @param laStation Station où se déroule la compétition
	 */
	public void setLaStation(Station laStation) {
		this.laStation = laStation;
	}

	/**
	 * @return Renvoie lesSkieurs.
	 */
	public ArrayList<Skieur> getLesSkieurs() {
		return lesSkieurs;
	}

	/**
	 * @param lesSkieurs 
	 */
	public void setLesSkieurs(ArrayList<Skieur> lesSkieurs) {
		this.lesSkieurs = lesSkieurs;
	}

	/**
	 * @param unSkieur
	 */
	public void ajoutSkieur(Skieur unSkieur){
		lesSkieurs.add(unSkieur);
	}
	
	/**
	 * @param unClassement classement du skieur dont le numero est passé en paramètre
	 * @param unNoSkieur numero du skieur dont on veut memoriser le classement
	 * méthode qui permet d'affecter un classement (sa place dans la compétition) à un skieur de la collection lesSkieurs
	 */
	public void classer(int unClassement, int unNoSkieur){
		lesSkieurs.get(unNoSkieur).setNoClassement(unClassement);
	}
	
	/**
	 * @param unNoSkieur
	 * @return le classement concernant le skieur dont le numéro est passé en paramètre
	 */
	public int retourneClassement(int unNoSkieur){
		return lesSkieurs.get(unNoSkieur).getNoClassement();
	}
	
	/**
	 * @param unNoSkieur : numero du skieur que l'on veut supprimer de la collection lesSkieurs
	 */
	public void supprimerSkieur(int unNoSkieur){
		lesSkieurs.remove(unNoSkieur);
	}
	
	/**
	 * @param unNoSkieur : numero du skieur dont on veut connaitre l'index dans la collection lesSkieurs
	 * @return index du skieur dans la collection lesSkieurs, -1 si non trouvé
	 */
	public int retourneIndexSkieur(int unNoSkieur){
		int indexSkieur = -1;
		int arret = 0;
		int i = 0;
		while ((arret == 0) && (i < lesSkieurs.size()))	{
			if (((Skieur)lesSkieurs.get(i)).getNoSkieur() == unNoSkieur){
				indexSkieur = i;
				arret = 1;
			}
			i++;
		}
		return indexSkieur;
	}
	
		/**
	 * @return une ArrayList de Skieur qui contient tous les skieurs dont le classement est inférieur à 4
	 */
	public ArrayList<Skieur> retournerPodium() {
		ArrayList<Skieur> lesSkieursClassement;
		lesSkieursClassement = new ArrayList<Skieur>();
		
		for(Skieur unSkieur : lesSkieurs) {
			if(unSkieur.getNoClassement() < 4) {
				lesSkieursClassement.add(unSkieur);
			}
		}
		return lesSkieursClassement;
	}	
}

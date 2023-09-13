
package sec.modele;

import java.util.ArrayList;

public class Affaire {
	protected int numero;
	protected String nom;
	protected String dateAffaire;
	protected String codeEtat;
	protected Client clientAffaire;
	protected Employe chefDeProjet;
	protected ArrayList<Tache> lesTaches;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateAffaire() {
		return dateAffaire;
	}

	public void setDateAffaire(String dateAffaire) {
		this.dateAffaire = dateAffaire;
	}

	public String getCodeEtat() {
		return codeEtat;
	}

	public void setCodeEtat(String codeEtat) {
		this.codeEtat = codeEtat;
	}

	public Client getClientAffaire() {
		return clientAffaire;
	}

	public void setClientAffaire(Client clientAffaire) {
		this.clientAffaire = clientAffaire;
	}

	public Employe getChefDeProjet() {
		return chefDeProjet;
	}

	public void setChefDeProjet(Employe chefDeProjet) {
		this.chefDeProjet = chefDeProjet;
	}

	/**
	 * @param numero
	 * @param nom
	 * @param descriptif
	 * @param dateAffaire : format jj/mm/aaaa
	 * @param codeEtat : "en étude", "en cours de réalisation", "en attente de règlement", "terminée", "abandonnée", … 
	 * @param clientAffaire
	 * @param chefDeProjet
	 * instanciation du collection lesTaches
	 */
	
	public Affaire(int numero, String nom, String dateAffaire, String codeEtat, Client clientAffaire, Employe chefDeProjet) {
		this.numero = numero;
		this.nom = nom;
		this.dateAffaire = dateAffaire;
		this.codeEtat = codeEtat;
		this.clientAffaire = clientAffaire;
		this.chefDeProjet = chefDeProjet;
		lesTaches = new ArrayList<Tache>();
	}
	
	/**
	 * @return Renvoie lesTaches : collection de Tache.
	 */
	public ArrayList<Tache> getLesTaches() {
		return lesTaches;
	}
	
	/**
	 * @param lesTaches : lesTaches collection de Tache.
	 */
	public void setLesTaches(ArrayList<Tache> lesTaches) {
		this.lesTaches = lesTaches;
	}
	
	/**
	 * @param uneTache à ajouter au collection lesTaches
	 */
	public void ajouterTache(Tache uneTache) {
		lesTaches.add(uneTache);
	}
	
	/**
	 * @param numeroTache : numéro de la tache à rechercher dans le collection lesTaches
	 * @return : le numéro d'index de la tache cherchées dans le collection lesTaches, -1 sinon
	 */
	public int retournerIndexTache(int numeroTache) {
		int indexTache = -1;
		int trouver = 0;
		int i = 0;
		while ((trouver == 0) && (i < lesTaches.size()))	{
			if (lesTaches.get(i).getNumero() == numeroTache){
				indexTache = i;
				trouver = 1;
			}
			i++;
		}
		return indexTache;
	}
	
	/**
	 * @param numeroTache : numéro de la tache à supprimer dans le collection lesTaches
	 * un parcours du collection lesTaches est nécessaire pour trouver la Tache à supprimer
	 * retourne 1 si la suppression s'est bien déroulée, 0 sinon
	 */
	public int supprimerTache(int numeroTache) {
		int trouver = 0;
		int i = 0;
		while ((trouver == 0) && (i < lesTaches.size())){
			if (lesTaches.get(i).getNumero() == numeroTache){
				lesTaches.remove(i);
				trouver = 1;
			}
			i++;
		}
		return trouver;
	}
	
	/**
	 * @param numeroTache : numero de la tache à rechercher dans le collection lesTaches
	 * @return la Tache correspondant au numéro passé en paramètre
	 * un parcours du collection lesTaches est nécessaire pour trouver la Tache correspondant au numéro passé en paramètre
	 */
	public Tache retournerTache(int numeroTache) {
		 Tache uneTache = null;
		 int index = retournerIndexTache(numeroTache);
		 
		 if(index != -1) {
			 uneTache = lesTaches.get(index);
		 }
		 
		 else {
			 System.out.println("Le numéro de tâche : " + numeroTache + " n'existe pas.");
		 }
		 return uneTache;
	}
}

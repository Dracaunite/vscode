package ag56.modele;

public class Client extends Personne {

	protected int nbVoyages;
	
	/**
	 * @param unCode code du client : Chaine de 6 caract�res
	 * @param unNom nom du client : chaine de caract�res
	 * @param unPrenom  pr�nom du client : chaine de caract�re
	 * @param uneRue  rue o� habite le client : chaine de caract�re
	 * @param unCp  code postal du client : chaine de 5 caract�res
	 * @param uneVille ville o� habite le client : chaine de caract�re
	 * @param unPays pays du client
	 * @param unTel t�l�phone du client : chaine de caract�re
	 * nbVoyages est initialis� � 0
	 */
	public Client(String unCode, String unNom, String unPrenom, String uneRue,
			String unCp, String uneVille, String unPays, String unTel) {
		super(unCode, unNom, unPrenom, uneRue, unCp, uneVille, unPays, unTel);
		nbVoyages=0;
	}
	
	/**
	 * @return Renvoie nombre de voyages auquels s'est inscrit le Client.
	 */
	public int getNbVoyages() { return nbVoyages; }

	/**
	 * @param nbVoyages nombre de voyages auquels s'est inscrit le Client.
	 */
	public void setNbVoyages(int nbVoyages) { this.nbVoyages = nbVoyages; }
	
	public void incrementerNbVoyages(){ nbVoyages++; }
}

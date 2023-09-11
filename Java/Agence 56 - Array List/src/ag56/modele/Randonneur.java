package ag56.modele;

public class Randonneur extends Client {
	protected int denivelePositiveParJour;
	protected int nbHeureMarcheMoyenParJour;
	protected int nbKmMoyenParJour;
	
	/**
	 * @param unCode code du randonneur : Chaine de 6 caract�res
	 * @param unNom nom du randonneur : chaine de caract�res
	 * @param unPrenom  pr�nom du randonneur : chaine de caract�re
	 * @param uneRue  rue o� habite le randonneur : chaine de caract�re
	 * @param unCp  code postal du randonneur : chaine de 5 caract�res
	 * @param uneVille ville o� habite le randonneur : chaine de caract�re
	 * @param unPays pays du randonneur
	 * @param unTel t�l�phone du randonneur : chaine de caract�re
	 */
	public Randonneur(String unCode, String unNom, String unPrenom,
			String uneRue, String unCp, String uneVille, String unPays,
			String unTel) {
		super(unCode, unNom, unPrenom, uneRue, unCp, uneVille, unPays, unTel);
	}
	
	public int getDenivelePositiveParJour() { return denivelePositiveParJour; }

	public void setDenivelePositiveParJour(int unDenivelePositiveParJour) { this.denivelePositiveParJour = unDenivelePositiveParJour; }

	public int getNbHeureMarcheMoyenParJour() { return nbHeureMarcheMoyenParJour; }

	public void setNbHeureMarcheMoyenParJour(int unNbHeureMarcheMoyenParJour) { this.nbHeureMarcheMoyenParJour = unNbHeureMarcheMoyenParJour; }

	public int getNbKmMoyenParJour() { return nbKmMoyenParJour; }

	public void setNbKmMoyenParJour(int unNbKmMoyenParJour) { this.nbKmMoyenParJour = unNbKmMoyenParJour; }
	
	/**
	 * @return retourne le niveau d'un randonneur en fonction de nbHeureMarcheMoyenParJour, denivelePositiveParJour et nbKmMoyenParJour
	 */
	public int donnerNiveau(){
		int niveau1, niveau2, niveau3;
		
		if (nbHeureMarcheMoyenParJour < 2) {
			niveau1 = 1;
			}
			else {if (nbHeureMarcheMoyenParJour < 4){
				niveau1 = 2;
			}
			else {if (nbHeureMarcheMoyenParJour < 6){
				niveau1 = 3;
				}
				else{
					niveau1 = 5;
				} 
			}
		}
		
		if (denivelePositiveParJour<300){//if (1)
			niveau2=2;
			}
			else {if (denivelePositiveParJour<600){//if (2)
				niveau2=3;
			}
			else {if (denivelePositiveParJour<800){//if (3)
				niveau2=4;
				}
				else{
					niveau2=5;
				} // end if (3)
			}// end if (2)
		}// end if (1)
		
		if (nbKmMoyenParJour<5){//if (1)
			niveau3=1;
			}
			else {if (nbKmMoyenParJour<10){//if (2)
				niveau3=2;
			}
			else {if (nbKmMoyenParJour<15){//if (3)
				niveau3=3;
				}
				else{if (nbKmMoyenParJour<20){//if (4)
					niveau3=4;
					}
					else {
						niveau3=5;
					}// end if (4)
				} // end if (3)
			}// end if (2)
		}// end if (1)
		return Math.min(niveau3, Math.min(niveau1, niveau2));
	}

}

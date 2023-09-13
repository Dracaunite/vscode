package fact.modele;

import java.util.ArrayList;


public class Facture {
	
	protected String Code;
	protected String dateFact;
	protected Client acheteur;
	protected ArrayList<LigneCde> lesLignes;
	
	/**
	 * @param code caractères alphanumériques, pas de caractères spéciaux, limité à 20 caractères, non nul
	 * @param dateFact date de la facture, format JJ/MM/AAA, non nul
	 * @param acheteur client auquel sera adressée la facture, non nul
	 */
	public Facture(String code, String dateFact, Client acheteur) {
		this.Code = code;
		this.dateFact = dateFact;
		this.acheteur = acheteur;
		lesLignes = new ArrayList<LigneCde>();
	}
	
	public String getCode() {
		return Code;
	}
	
	public void setCode(String code) {
		Code = code;
	}
	
	public String getDateFact() {
		return dateFact;
	}
	
	public void setDateFact(String dateFact) {
		this.dateFact = dateFact;
	}
	
	public Client getAcheteur() {
		return acheteur;
	}
	
	public void setAcheteur(Client acheteur) {
		this.acheteur = acheteur;
	}
	
	public ArrayList<LigneCde> getLesLignes() {
		return lesLignes;
	}
	
	public void setLesLignes(ArrayList<LigneCde> lesLignes) {
		this.lesLignes = lesLignes;
	}

	public void ajouterLigneCde(LigneCde uneLigne) {
		lesLignes.add(uneLigne);
	}
	
	public int totalPoidsCommande() {
		// Cumul du poids total de la commande (somme du total poids de chaque ligne (poids article*quantite))
		int poids = 0;
		
		for(LigneCde uneLigne : lesLignes) {
			poids = uneLigne.getQuantite() * uneLigne.getArticleCommande().getPoids();
		}
		
		return poids;
	}
	
	public int nbArticles() {
		// nombre d'articles commandés (somme des quantités commandées pour chaque ligne)
		int sommeQte = 0;
		
		for(LigneCde uneLigne : lesLignes) {
			sommeQte = sommeQte + uneLigne.getQuantite() ;
		}
		
		return sommeQte;
	}

	public double totalPrixHt() {
		// total prix HT de la commande (somme du prix HT de chaque ligne commande)
		double sommeHt = 0;
		
		for(LigneCde uneLigne : lesLignes) {
			sommeHt = sommeHt + uneLigne.getArticleCommande().getPrixHt();
		}
		
		return sommeHt;
	}
	
	public double totalTva() {
		// Total prix TVA de la commande (somme du prix TVA de chaque ligne commande)
		// rq : il est possible de créer une méthode Prix TVA dans la classe LigneCde pour vous faciliter le travail
		double sommeTva = 0;
		
		for(LigneCde uneLigne : lesLignes) {
			sommeTva = sommeTva + uneLigne.getArticleCommande().getTva();
		}
		
		return sommeTva;
	}
	
	public double totalPrixTtc() {
		// Total prix TTC de la commande TOTAL HT + TOTAL TVA
		double prixTtc = 0;
		prixTtc = totalPrixHt() + totalTva();
		return prixTtc;
	}
	
	/**
	 * @return le prix du port en  fonction du poids total de la commande
	 * si le poids est < 5 kg alors le prix sera de 5 euros
	 * si le poids est compris entre 5 kg et 10 kg alors le prix sera de 10 euros
	 * au delà de 10kg on ajoute 10 euros chaque fois qu'on dépasse une dizaine de kg (exemple 35 --> 40 euros, 42 --> 50 euros, 60 --> 60 euros)
	 */
	public int calculPrixPort() {
		// Calcul du prix du port en fonction du poids total de la commande
		int prixPort = 0;
		
		if(totalPoidsCommande() < 5) {
			prixPort = 5;
		}
		
		else if((5 <= totalPoidsCommande()) && (totalPoidsCommande() <= 10)){
			prixPort = 10;
		}
		
		else {
			// Calcule le prix du port selon le poids de la commande
			for(int i = 0; i < totalPoidsCommande() ; i++) {
				prixPort += 10;
			}
			// Si le chiffre des unités est supérieur à 0, on augmente le prix du port de 10€.
			if(totalPoidsCommande()%10 > 0) {
				prixPort += 10;
			}
		}
		
		return prixPort;
	}
}

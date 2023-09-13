package fact.tests;

import fact.modele.Article;
import fact.modele.Client;
import fact.modele.Facture;
import fact.modele.LigneCde;

public class FactureTest {

	public static void main(String[] args) {
		// instancier une client
		// String code, String nom, String prenom, String adresse, String cp, String ville, String email, String telephone
		Client unClient = new Client("CodeCli", "NomCli", "adresseCli", "adrese rue client","56100", "Lorient", "client@gmail.com", "06 77 44 33 22");
		// instancier au moins 2 ligneCde --> instancier au moins 2 articles pour cr�ert les ligneCde
		Article unArticle1 = new Article("code1", "libelle1", 20, 20.4, 0.200);
		LigneCde uneLigne1 = new LigneCde(unArticle1, 10);
		Article unArticle2 = new Article("code2", "libelle2", 31, 10.5, 0.200);
		LigneCde uneLigne2 = new LigneCde(unArticle2, 8);
		
		// instancier une facture
		Facture uneFacture = new Facture("CodeFacture", "13/09/2021", unClient);

		// tester la méthode ajouterLigneCde(LigneCde uneLigne) --> ajouter les 2 ligneCde instanciées préalablement
		uneFacture.ajouterLigneCde(uneLigne1);
		uneFacture.ajouterLigneCde(uneLigne2);
				
		// tester la méthode totalPoidsCommande()
		System.out.println("Total du poids de la commande : " + uneFacture.totalPoidsCommande() + "kg.");
		
		// tester la méthode nbArticles()
		System.out.println("Nombre d'articles présents dans la commande : " + uneFacture.nbArticles());

		// tester la méthode totalPrixHt() {
		System.out.println("Prix HT de la commande  : " + uneFacture.totalPrixHt() + " euros.");
		
		// tester la méthode totalTva() {
		System.out.println("Total de la TVA de la commande : " + uneFacture.totalTva() + " euros.");
		
		// tester la méthode totalTtc() {
		System.out.println("Prix TTC de la commande : " + uneFacture.totalPrixTtc() + " euros.");
		
		// Bonus : test de la méthode calculPrixPort()
		System.out.println("Prix port de la commande : " + uneFacture.calculPrixPort() + " euros.");
	}
}
package sec.utils;

import sec.modele.*;

public class AffichageModele {
	
	public static void afficherClient(Client unClient) {
		System.out.println("Code client : " + unClient.getCode());
		System.out.println("Nom client : " + unClient.getNom());
		System.out.println("Prenom client : "+ unClient.getPrenom());
		System.out.println("Adresse rue : " + unClient.getAdresse());
		System.out.println("Ville : " + unClient.getCp()+ " " + unClient.getVille());
		System.out.println("Tel: " + unClient.getTelephone());
		System.out.println("Email : " + unClient.getEmail());
	}
	
	public static void afficherEmploye(Employe unEmploye) {
		System.out.println("Matricule employé : " + unEmploye.getMatricule());
		System.out.println("Nom employé : " + unEmploye.getNom());
		System.out.println("Prenom employé : "+ unEmploye.getPrenom());
		System.out.println("Email : " + unEmploye.getEmail());
		System.out.println("Tel : " + unEmploye.getTelephone());
		System.out.println("Date d'embauche : " + unEmploye.getDateEmbauche());
		System.out.println("Fonction : " + unEmploye.getFonction());
	}
	
	public static void afficherTache(Tache uneTache) {
		System.out.println("Numéro de la tâche: " + uneTache.getNumero());
		System.out.println("Nom tâche : " + uneTache.getNom());
		System.out.println("Spécification technique : "+ uneTache.getSpecificationTechnique());
		System.out.println("Date limite : " + uneTache.getDateLimiteRealisation());
		System.out.println("Développeur en charge de la mission : " + uneTache.getLeDeveloppeur());
	}
	
	public static void afficherAffaire(Affaire uneAffaire) {
		System.out.println("Numéro affaire : " + uneAffaire.getNumero());
		System.out.println("Nom affaire : " + uneAffaire.getNom());
		System.out.println("Date affaire : " + uneAffaire.getDateAffaire());
		System.out.println("Code état : " + uneAffaire.getCodeEtat());
		System.out.println("Client : " + uneAffaire.getClientAffaire());
		System.out.println("Chef de projet : " + uneAffaire.getChefDeProjet());
	}
}

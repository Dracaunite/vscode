package pers.utils;

import pers.modele.*;

public class AffichageModele {

	public static void afficherPersonne(Personne unePersonne) {
		System.out.println("Nom : " + unePersonne.getNom() + " | Prénom : " + unePersonne.getPrenom() + " | Âge : " + unePersonne.getAge());
	}
	
	public static void afficherProf(Prof unProf) {
		afficherPersonne(unProf);
		System.out.println("Matière : " + unProf.getMatiere());
	}

	public static void afficherEleve(Eleve unEleve) {   
		afficherPersonne(unEleve);
		System.out.println("Section : " + unEleve.getSection());
	}
	
	public static void afficherNotation(Notation uneNotation){
		System.out.println("Note : " + uneNotation.getUneNote());
		System.out.println("Matière : " + uneNotation.getUneMatiere());
	}
}

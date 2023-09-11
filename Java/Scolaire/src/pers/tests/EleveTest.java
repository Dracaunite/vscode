package pers.tests;

import pers.modele.*;
import pers.utils.*;

public class EleveTest {

	public static void main(String[] args) {
		Eleve e1 = new Eleve("Boulard", "Thierry", 25, "2 BTS SIO ");
		Eleve e2 = new Eleve("Dupuis", "Julie", 20, "2 BTS SIO ");
		e2.incAbsences(2);
		e2.incAbsences(1);
		
		AffichageModele.afficherEleve(e1);
		AffichageModele.afficherEleve(e2);
		
		Prof p1 = new Prof("Tournesol", "Triphon", 32, "Math");
		Prof p2 = new Prof("Lettre", "Amina", 58, "Français");
		Prof p3 = new Prof("Telor", "Gladys", 43, "Anglais");
		
		AffichageModele.afficherProf(p1);
		AffichageModele.afficherProf(p2);
		AffichageModele.afficherProf(p3);
		
		e1.ajouterNotation(new Notation(5, "Math", p1));
		e1.ajouterNotation(new Notation(10, "Français", p2));
		e1.ajouterNotation(new Notation(15, "Anglais", p3));
		e1.ajouterNotation(new Notation(10, "Math", p1));
		e1.ajouterNotation(new Notation(15, "Math", p1));
		e1.ajouterNotation(new Notation(12, "Français", p2));
		e1.ajouterNotation(new Notation(3, "Math", p1));
		e1.ajouterNotation(new Notation(8, "Français", p2));
		e1.ajouterNotation(new Notation(13, "Anglais", p3));
		e1.ajouterNotation(new Notation(14, "Anglais", p3));
		e2.ajouterNotation(new Notation(11, "Math", p1));
		e2.ajouterNotation(new Notation(10, "Français", p2));
		e2.ajouterNotation(new Notation(15, "Anglais", p3));
		e2.ajouterNotation(new Notation(17, "Math", p1));
		e2.ajouterNotation(new Notation(15, "Math", p1));
		e2.ajouterNotation(new Notation(12, "Français", p2));
		e2.ajouterNotation(new Notation(5, "Math", p1));
		e2.ajouterNotation(new Notation(8," Français", p2));
		e2.ajouterNotation(new Notation(13, "Anglais", p3));
		e2.ajouterNotation(new Notation(15, "Anglais", p3));
	}
}

package sec.tests;

import sec.modele.Employe;
import sec.utils.*;

public class EmployeTest {

	public static void main(String[] args) {
		Employe unEmploye = new Employe("matricule", "nom", "prenom", "email", "telephone", "dateEmbauche", "fonction");
		AffichageModele.afficherEmploye(unEmploye);
	}
}

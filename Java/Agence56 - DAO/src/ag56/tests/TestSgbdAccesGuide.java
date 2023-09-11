package ag56.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSgbdAccesGuide {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.179.1.12:3306/Agence56";
		try {
			System.out.println("Chargement du driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Récupération de la connexion");
			Connection con = DriverManager.getConnection(url,"admindb","password");
			System.out.println("Création d'un statement");
			Statement requete = con.createStatement();
			System.out.println("Exécution d'une requête");
			ResultSet resultat = requete.executeQuery("select * from Guide");
			while (resultat.next()) {
				System.out.println(resultat.getString(1)+"  "+resultat.getString(2));
				}; // fin while
			} // fin try
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			} // fin catch
	}
}

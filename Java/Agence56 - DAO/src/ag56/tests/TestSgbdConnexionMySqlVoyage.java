package ag56.tests;

import ag56.modele.dao.*;
import java.sql.ResultSet;

public class TestSgbdConnexionMySqlVoyage {

	public static void main(String[] args) {
		// test avec curseur
				ResultSet curseurVoyage = ConnexionMySql.execReqSelection("select * from Voyage");
				try {
					while (curseurVoyage.next()) {
						System.out.println(curseurVoyage.getString(1) + "  " + curseurVoyage.getString(2));
						}; // fin while
					} // fin try
				catch(Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
				} 
	}
}

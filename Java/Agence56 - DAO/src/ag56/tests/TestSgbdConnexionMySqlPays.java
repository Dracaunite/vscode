package ag56.tests;

import ag56.modele.dao.*;
import java.sql.ResultSet;

public class TestSgbdConnexionMySqlPays {

	public static void main(String[] args) {
		// test avec curseur
				ResultSet curseurPays= ConnexionMySql.execReqSelection("select * from Pays");
				try {
					while (curseurPays.next()) {
						System.out.println(curseurPays.getString(1)+"  "+curseurPays.getString(2));
						};// fin while
					} // fin try
				catch(Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
				} 

	}

}

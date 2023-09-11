package ihm.vues;

// Importation des librairies nécessaires pour créer une IHM
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class PremiereFenetre extends JFrame {
	private static final long serialVersionUID = 1L;

	public PremiereFenetre(String titre) throws HeadlessException {
		super(titre); // Instanciation d'une fenêtre avec un titre en paramètre
		this.setLocation(200, 200); // Endroit où la fenetre apparaîtra à l'écran
		this.setVisible(true); // La fenêtre devient visible
		this.setSize(800, 600); // Dimension de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fermer la fenêtre
	}
}

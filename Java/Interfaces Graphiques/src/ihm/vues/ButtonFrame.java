package ihm.vues;

// Importation des librairies nécessaires pour créer une IHM

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;


public class ButtonFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	// Déclarations des composants de la fenêtre
	private JPanel p;
	private JButton boutonJaune;
	private JButton boutonBleu;
	private JButton boutonRouge;
	private JButton boutonVert;
	GridLayout gl; // Divise le panneau en colonnes et lignes
	
	public ButtonFrame() {
		// Instanciation des composants de la fenêtre (penser à importer les images)
		ImageIcon imgJaune = new ImageIcon(this.getClass().getResource("jaune.gif"));
		boutonJaune = new JButton("Jaune", imgJaune);
		
		ImageIcon imgBleu = new ImageIcon(this.getClass().getResource("bleu.gif"));
		boutonBleu = new JButton("Bleu", imgBleu);
		
		ImageIcon imgRouge = new ImageIcon(this.getClass().getResource("rouge.gif"));
		boutonRouge = new JButton("Rouge", imgRouge);
		
		ImageIcon imgVert = new ImageIcon(this.getClass().getResource("vert.gif"));
		boutonVert = new JButton("Vert", imgVert);
		
		// Instancie le panneau
		p = new JPanel();
		
		gl = new GridLayout(3, 1);
		p.setLayout(gl);
		
		// On ajoute les composants dans le panneau
		p.add(boutonJaune);
		p.add(boutonBleu);
		p.add(boutonRouge);
		p.add(boutonVert);
		
		// On ajoute le panneau et ses composants dans la fenêtre
		this.getContentPane().add(p);
		this.setTitle("ButtonTest");
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

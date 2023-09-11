package ihm.vues;

// Importation des librairies nécessaires pour créer une IHM

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonFrameEvt extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	// Déclarations des composants de la fenêtre
	private JPanel p;
	private JButton boutonJaune;
	private JButton boutonBleu;
	private JButton boutonRouge;
	private JButton boutonVert;
	//GridLayout gl; // Divise le panneau en colonnes et lignes
	
	public ButtonFrameEvt() {
		// Instanciation des composants de la fenêtre (penser à importer les images)
		ImageIcon imgJaune = new ImageIcon(this.getClass().getResource("jaune.gif"));
		boutonJaune = new JButton("Jaune", imgJaune);
		
		ImageIcon imgBleu = new ImageIcon(this.getClass().getResource("bleu.gif"));
		boutonBleu = new JButton("Bleu", imgBleu);
		
		ImageIcon imgRouge = new ImageIcon(this.getClass().getResource("rouge.gif"));
		boutonRouge = new JButton("Rouge", imgRouge);
		
		ImageIcon imgVert = new ImageIcon(this.getClass().getResource("vert.gif"));
		boutonVert = new JButton("Vert", imgVert);
		
		// Déclaration des sources d'évènements
		boutonJaune.addActionListener(this);
		boutonBleu.addActionListener(this);
		boutonRouge.addActionListener(this);
		boutonVert.addActionListener(this);
		
		// Instancie le panneau
		p = new JPanel();
		
		/*gl = new GridLayout(3, 1);
		p.setLayout(gl);*/
		
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

	// Gestion des évènements
	public void actionPerformed(ActionEvent evt) {
		// Déclaration et instanciation d'un objet pour gérer la couleur
		Object source = evt.getSource();
		Color color = getBackground();
		
		// Change le fond du panneau en fonction du bouton cliqué
		if (source == boutonJaune) color = Color.yellow;
		else if (source == boutonBleu) color = Color.blue;
		else if (source == boutonRouge) color = Color.red;
		else if (source == boutonVert) color = Color.green;
		
		p.setBackground(color);
		p.repaint();
	}
}

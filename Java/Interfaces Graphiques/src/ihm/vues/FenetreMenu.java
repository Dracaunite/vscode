package ihm.vues;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class FenetreMenu extends JFrame implements ActionListener {
	// Permet d'affecter un numéro de version à la classe (Swing)
	private static final long serialVersionUID = 1L;
	
	JPanel panel;
	JMenuBar mbar;
	JMenu m1;
	JMenu m2;
	
	public FenetreMenu(){
		this.setTitle("Fenêtre avec un menu");
		this.setSize(300, 200);
		this.setVisible(true);
		
		panel = new JPanel();
		
		Container contentPane = getContentPane();
		panel.setBackground(Color.blue);
		contentPane.add(panel);
		// Ajput d'une barre de menu à la fenêtre
		mbar = new JMenuBar();
		
		// Gestion du menu "Couleur fond"
		m1 = new JMenu("Couleur fond");
		JMenuItem m11 = new JMenuItem("Jaune");
		m11.addActionListener(this);
		m1.add(m11);
		
		JMenuItem m12 = new JMenuItem("Rouge");
		m12.addActionListener(this);
		m1.add(m12);
		
		JMenuItem m13 = new JMenuItem("Cyan");
		m13.addActionListener(this);
		m1.add(m13);
		
		// Gestion du menu "Couleur Menu"
		m2 = new JMenu("Couleur fond");
		JMenuItem m21 = new JMenuItem("Bleu");
		m21.addActionListener(this);
		m2.add(m21);
		
		JMenuItem m22 = new JMenuItem("Vert");
		m22.addActionListener(this);
		m2.add(m22);
		
		mbar.add(m1);
		mbar.add(m2);
		setJMenuBar(mbar);
		
		this.getContentPane().add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() instanceof JMenuItem) {
			String ChoixOption = evt.getActionCommand();
			
			if (ChoixOption.equals("Jaune")) panel.setBackground(Color.yellow);
			
			else if (ChoixOption.equals("Rouge")) panel.setBackground(Color.red);
			
			else if (ChoixOption.equals("Cyan")) panel.setBackground(Color.cyan);
			
			else if (ChoixOption.equals("Bleu")) {
				mbar.setBackground(Color.blue);
				m1.setBackground(Color.blue);
				m2.setBackground(Color.blue);
			}
			
			else if (ChoixOption.equals("Vert")) {
				mbar.setBackground(Color.green);
				m1.setBackground(Color.green);
				m2.setBackground(Color.green);
			}
		}
	}
}

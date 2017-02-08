package vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controleur.Controleur;

/**
 * 	creation de la fenetre Calculatrice
 * 
 * @author Camille Samain
 *
 */

public class Fenetre extends JFrame {
	private Boutons bouton; 
	private ZonesTexte zones; 
		
	private final int heightf = 700;
	private final int widthf= 500;
	
	private Controleur controleur;
	
	/**
	 *initialisation fenetre
	 */	
	public Fenetre(Controleur controleur){	
		
		//lien avec le controleur
		this.controleur=controleur;
		this.bouton= new Boutons(controleur);
		this.zones = new ZonesTexte(controleur);
		
		//recuperation panel zones texte
		JPanel panz=zones.getPanz();
		
		//recuperation panel boutons
		JPanel panb=bouton.getPanb();
		
		// creation barre de menu
		JMenuBar maBarre = new JMenuBar();

		// creation menu ? et ses sous menus
		JMenu Aide = new JMenu("?");
		JMenuItem Quitter = new JMenuItem("Quitter", KeyEvent.VK_Q);
		JMenuItem Apropos = new JMenuItem("A propos de la calculatrice");
		maBarre.add(Aide);
		Aide.add(Apropos);
		Aide.add(Quitter);
		
		//ajout d'un titre a la fenetre
		this.setTitle("Calculatrice");
		
		//Empecher de redimensionner la fenetre
		this.setResizable(false);

		//Definition de la taille de la fenetre
		this.setPreferredSize(new Dimension(widthf,heightf));
		
		//ferme fenetre avec croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//parametrage panel fenetre
		this.getContentPane().setBackground(Color.GRAY);

		GridLayout glf = new GridLayout(2,1);
		this.getContentPane().setLayout(glf);		//ajout d'un layout sur le panel de la fenetre
		this.setJMenuBar(maBarre);	//mise en place de la barre de menu
		this.getContentPane().add(panz);		//mise en place des zones de texte
		this.getContentPane().add(panb);		//mise en place des boutons
	
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);				//affichage fenetre
	}

	//GETTERS AND SETTERS
	public Boutons getBouton() {
		return bouton;
	}

	public void setBouton(Boutons bouton) {
		this.bouton = bouton;
	}

	public ZonesTexte getZones() {
		return zones;
	}

	public void setZones(ZonesTexte zones) {
		this.zones = zones;
	}

}

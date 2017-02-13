package vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controleur.ControleurCalc;
import controleur.ControleurPoly;

/**
 * creation de la fenetre Calculatrice
 * 
 * @author Camille Samain
 *
 */

public class Fenetre extends JFrame implements ActionListener {

	private Boutons bouton;
	private ZonesTexte zones;
	private APropos aPropos;
	private PolyTexteVue polynomesTexte;
	private PolyCalcVue polynomesCalcul;
	private final int heightf = 700;
	private final int widthf = 500;

	private ControleurCalc controleurc;
	private ControleurPoly controleurp;

	/**
	 * initialisation fenetre
	 */
	public Fenetre(ControleurCalc controleurc, ControleurPoly controleurp) {

		// lien avec le controleur
		this.controleurc = controleurc;
		this.controleurp = controleurp;
		this.bouton = new Boutons(controleurc);
		this.zones = new ZonesTexte(controleurc);

		ImageIcon image = new ImageIcon("asset/maths2.jpg");
		this.aPropos = new APropos();
		this.polynomesTexte = new PolyTexteVue(controleurp);
		this.polynomesCalcul = new PolyCalcVue(controleurp);

		// ajout d'un titre et d'une icone a la fenetre
		this.setTitle("Calculatrice");
		this.setIconImage(image.getImage());

		// Empecher de redimensionner la fenetre
		this.setResizable(false);

		// Definition de la taille de la fenetre
		this.setPreferredSize(new Dimension(widthf, heightf));

		// ferme fenetre avec croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// parametrage panel fenetre
		this.getContentPane().setBackground(Color.LIGHT_GRAY);

		// ajout d'un layout sur le panel de la fenetre
		GridLayout glf = new GridLayout(2, 1);
		this.getContentPane().setLayout(glf);

		// creation barre de menu
		JMenuBar maBarre = new JMenuBar();

		// creation menu Vues et ses sous menus
		JMenu vues = new JMenu("Vues");
		JMenuItem calculatrice = new JMenuItem("Calculatrice");
		calculatrice.addActionListener(this);
		JMenuItem calculDePolynomes = new JMenuItem("Calcul de polynomes");
		calculDePolynomes.addActionListener(this);
		maBarre.add(vues);
		vues.add(calculatrice);
		vues.add(calculDePolynomes);

		// creation menu ? et ses sous menus
		JMenu Aide = new JMenu("?");
		JMenuItem Quitter = new JMenuItem("Quitter");
		Quitter.addActionListener(this);
		JMenuItem Apropos = new JMenuItem("A propos");
		Apropos.addActionListener(this);
		maBarre.add(Aide);
		Aide.add(Apropos);
		Aide.add(Quitter);

		// mise en place barre de menu
		this.setJMenuBar(maBarre);

		// recuperation panel zones texte
		JPanel panz = zones.getPanz();

		// recuperation panel boutons
		JPanel panb = bouton.getPanb();

		this.getContentPane().add(panz); // zones de texte
		this.getContentPane().add(panb); // boutons

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true); // affichage fenetre
	}

	// GETTERS AND SETTERS
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
	
	public PolyCalcVue getPolynomesCalcul() {
		return polynomesCalcul;
	}

	public void setPolynomesCalcul(PolyCalcVue polynomesCalcul) {
		this.polynomesCalcul = polynomesCalcul;
	}

	/* LISTENERS */


	@Override
	public void actionPerformed(ActionEvent e) {
		String boutonSelect = new String();
		boutonSelect = e.getActionCommand();

		if ("Quitter".equals(boutonSelect)) {
			System.exit(0);

		} else if ("Calculatrice".equals(boutonSelect)) {
			this.setVisible(false);
			this.getContentPane().removeAll(); // on vide la fenetre
			JPanel panz = zones.getPanz(); // recuperation panel zones texte
			JPanel panb = bouton.getPanb(); // recuperation panel boutons
			this.getContentPane().add(panz); // mise en place zones de texte
			this.getContentPane().add(panb); // boutons
			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);

		} else if ("Calcul de polynomes".equals(boutonSelect)) {
			this.setVisible(false);
			this.getContentPane().removeAll(); // on vide la fenetre
			JPanel panpt = polynomesTexte.getPanpt(); // recuperation panel
														// Polynomes Texte
			this.getContentPane().add(panpt); // mise en place panel
			JPanel panpc = polynomesCalcul.getPanpc(); // recuperation panel
														// Polynomes Calcul
			this.getContentPane().add(panpc); // mise en place panel
			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);

		} else if ("A propos".equals(boutonSelect)) {
			this.setVisible(false);
			this.getContentPane().removeAll(); // on vide la fenetre
			JPanel panap = aPropos.getPanap(); // recuperation panel Apropos
			this.getContentPane().add(panap); // mise en place panel
			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	}

}

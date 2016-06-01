package vues;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * creation, positionnement des differents boutons de la calculatrice - partie
 * visuelle
 * 
 * @author Camille
 *
 */
public class Bouton {
	// creation panel sur lequel on placera les boutons
	private static JPanel panb = new JPanel();

	public Bouton() {
		/**
		 * cree les boutons et les places sur le panel
		 */
		// creation boutons numeriques
		JButton bouton0 = new JButton("0");
		JButton bouton1 = new JButton("1");
		JButton bouton2 = new JButton("2");
		JButton bouton3 = new JButton("3");
		JButton bouton4 = new JButton("4");
		JButton bouton5 = new JButton("5");
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		JButton bouton9 = new JButton("9");

		// creation autres boutons
		JButton boutonClear = new JButton("C");
		JButton boutonDiviser = new JButton("/");
		JButton boutonMultiplier = new JButton("*");
		JButton boutonDel = new JButton("del");
		JButton boutonMoins = new JButton("-");
		JButton boutonPlus = new JButton("+");
		JButton boutonParentheses = new JButton("()"); // 2 parentheses ou separer ?
		JButton boutonPlusMoins = new JButton("+/-");
		JButton boutonPoint = new JButton(".");
		JButton boutonEgal = new JButton("=");
		
		//placement boutons
		placement(bouton0,0,0);
		placement(bouton1,100,0);
		placement(bouton2,0,100);
		placement(bouton3,200,0);
		placement(bouton4,300,0);
		placement(bouton5,0,200);
		placement(bouton6,0,300);
		placement(bouton7,0,400);
		placement(bouton8,0,500);
		placement(bouton9,0,600);
	}

	public void placement(JButton bouton, int x, int y) {
		/**
		 * positionne les boutons
		 */

		panb.add(bouton);
		bouton.setLocation(x, y);
		
	}

	// CardLayout cl = new CardLayout ();
	// JPanel content = new JPanel();
	//String [] listcontent = {"panf", "panb"};
	//int indice = 0;


	/*
	 * Pense que cette classe ne connait pas ton autre classe Fenetre. pk ????
	 * 
	 * Dans ce panel tu ajoutes tes boutons. comment ??
	 * 
	 * Et tu fais une méthode pour récupérer ce panel. est-ce suffisant ?
	 * 
	 * Après avec cette métohde dans ta classe fenetre tu l'utilise pour
	 * récupérer le panel que tu ajoute au panel principal de ta fenêtre.
	 */
;

	public static JPanel getPanel() {
		return panb;
	}

	public void setPanel(JPanel panel) {
		this.panb = panel;
	}

}
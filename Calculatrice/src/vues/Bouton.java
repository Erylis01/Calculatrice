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
		
		//parametrage panel bouton avec ajout layout pour placer boutons
		panb.setBackground(Color.GRAY);
		GridLayout gl = new GridLayout (5,4);
		gl.setHgap(2);
		gl.setVgap(2);
		panb.setLayout(gl);
		
		
		// creation boutons
		String [] tab_caract = {"0", ".", "+/-", "=" , "1", "2", "3", "+", "4", "5", "6", "-",  "7", "8", "9", "del",  "C",  "/", "*"};	//a reorganiser
		JButton[] tab_boutons = new JButton[tab_caract.length];		//ligne pas comprise...
		
		for (int i=0 ; i<tab_caract.length ; i++){
			JButton boutoni = new JButton(tab_caract[i]);		//est ce que ca nomme bien mon bouton ?
			tab_boutons[i]=boutoni;								//pas compris non plus
			panb.add(boutoni);									//ajout boutons au panel
		}
		panb.setVisible(true);	
	}


	/*
	 * Pense que cette classe ne connait pas ton autre classe Fenetre. pk ????
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
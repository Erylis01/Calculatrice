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
	private JPanel panb = new JPanel();

	public Bouton() {
		/**
		 * cree les boutons et les places sur le panel
		 */

		// parametrage panel bouton avec ajout layout pour placer boutons
		panb.setBackground(Color.GRAY);
		GridLayout gl = new GridLayout(5, 4);
		gl.setHgap(2);
		gl.setVgap(2);
		panb.setLayout(gl);

		// creation boutons
		String[] tab_caract = { "+", "-", "*", "/", "7", "8", "9", "C", "4", "5", "6", "del", "1", "2", "3", "=", "0", ".", "+/-" };
		JButton[] tab_boutons = new JButton[tab_caract.length];

		for (int i = 0; i < tab_caract.length; i++) {
			tab_boutons[i] = new JButton(tab_caract[i]); // creation boutons pour chaque caractere de tab_caract
			panb.add(tab_boutons[i]); // ajout boutons au panel
		}
		panb.setVisible(true);
	}

	public JPanel getPanb() {
		return panb;
	}

	public void setPanel(JPanel panel) {
		this.panb = panel;
	}

}
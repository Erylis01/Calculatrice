package vues;

import javax.swing.JButton;
import java.awt.GridLayout;

public class Bouton {

	
	public Bouton(){
		GridLayout gl = new GridLayout(5,4);
		gl.setHgap(5);
		gl.setVgap(5);
		
		/* Pense que cette classe ne connait pas ton autre classe Fenetre.
		 * Ici Tu devrais cr�er un panel et que tu mets en private comme pour l'autre.
		 * Dans ce panel tu ajoutes tes boutons. Et tu fais une m�thode pour r�cup�rer ce panel.
		 * (Aide : clic droit sur la classe puis source puis generate getters/setters)
		 * Apr�s avec cette m�tohde dans ta classe fenetre tu l'utilise pour r�cup�rer le panel
		 * que tu ajoute au panel principal de ta fen�tre.
		 */
		Fenetre.fenetre.setLayout(gl);
		Fenetre.fenetre.getContentPane().add(new JButton ("C"));
		Fenetre.fenetre.getContentPane().add(new JButton ("/"));
		Fenetre.fenetre.getContentPane().add(new JButton ("*"));
		Fenetre.fenetre.getContentPane().add(new JButton ("Del"));
		Fenetre.fenetre.getContentPane().add(new JButton ("7"));
		Fenetre.fenetre.getContentPane().add(new JButton ("8"));
		Fenetre.fenetre.getContentPane().add(new JButton ("9"));
		Fenetre.fenetre.getContentPane().add(new JButton ("-"));
		Fenetre.fenetre.getContentPane().add(new JButton ("4"));
		Fenetre.fenetre.getContentPane().add(new JButton ("5"));
		Fenetre.fenetre.getContentPane().add(new JButton ("6"));
		Fenetre.fenetre.getContentPane().add(new JButton ("+"));
		Fenetre.fenetre.getContentPane().add(new JButton ("1"));
		Fenetre.fenetre.getContentPane().add(new JButton ("2"));
		Fenetre.fenetre.getContentPane().add(new JButton ("3"));
		Fenetre.fenetre.getContentPane().add(new JButton ("()"));
		Fenetre.fenetre.getContentPane().add(new JButton ("0"));
		Fenetre.fenetre.getContentPane().add(new JButton ("."));
		Fenetre.fenetre.getContentPane().add(new JButton ("+/-"));
		Fenetre.fenetre.getContentPane().add(new JButton ("="));
	}

}
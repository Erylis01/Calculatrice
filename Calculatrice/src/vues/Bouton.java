package vues;

import javax.swing.JButton;
import java.awt.GridLayout;

public class Bouton {

	
	public Bouton(){
		GridLayout gl = new GridLayout(5,4);
		gl.setHgap(5);
		gl.setVgap(5);
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
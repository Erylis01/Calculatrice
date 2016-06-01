package vues;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Fenetre {
	private JPanel pan = new JPanel ();
	
	public Fenetre(){								//initialisation de la fenetre
		JFrame fenetre = new JFrame();			//creation fenetre
		pan.setBackground(Color.LIGHT_GRAY);	//couleur fond panel
		fenetre.setTitle("Caclculatrice");		//ajout d'un titre
		fenetre.setSize(500, 700);				//taille large haut
		fenetre.setLocationRelativeTo(null);	//place la fenetre au milieu
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//ferme fenetre avec croix rouge
		
		//GridLayout gl = new GridLayout(5,4);
		//gl.setHgap(5);
		//gl.setVgap(5);
		//fenetre.setLayout(gl);			//def layout a utiliser sur content pane 5L*4C
		
		/*fenetre.getContentPane().add(new JButton ("C"));
		fenetre.getContentPane().add(new JButton ("/"));
		fenetre.getContentPane().add(new JButton ("*"));
		fenetre.getContentPane().add(new JButton ("Del"));
		fenetre.getContentPane().add(new JButton ("7"));
		fenetre.getContentPane().add(new JButton ("8"));
		fenetre.getContentPane().add(new JButton ("9"));
		fenetre.getContentPane().add(new JButton ("-"));
		fenetre.getContentPane().add(new JButton ("4"));
		fenetre.getContentPane().add(new JButton ("5"));
		fenetre.getContentPane().add(new JButton ("6"));
		fenetre.getContentPane().add(new JButton ("+"));
		fenetre.getContentPane().add(new JButton ("1"));
		fenetre.getContentPane().add(new JButton ("2"));
		fenetre.getContentPane().add(new JButton ("3"));
		fenetre.getContentPane().add(new JButton ("()"));
		fenetre.getContentPane().add(new JButton ("0"));
		fenetre.getContentPane().add(new JButton ("."));
		fenetre.getContentPane().add(new JButton ("+/-"));
		fenetre.getContentPane().add(new JButton ("="));*/
		
		fenetre.setVisible(true);				//affichage fenetre
		fenetre.setContentPane(pan);
		pan.setVisible(true);					//affichage panel
	}
}

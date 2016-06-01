package vues;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 * 	creation de la fenetre Calculatrice
 * 
 * @author Camille Samain
 *
 */

public class Fenetre {
	private JPanel panf = new JPanel ();
		
	public Fenetre(){	
		/**
		 *initialisation fenetre
		 */
		panf.setBackground(Color.LIGHT_GRAY);
		JFrame fenetre = new JFrame();			//creation fenetre
		fenetre.setTitle("Caclculatrice");		//ajout d'un titre
		fenetre.setSize(500, 700);				//taille large haut
		fenetre.setLocationRelativeTo(null);	//place la fenetre au milieu
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//ferme fenetre avec croix rouge
		
		Bouton.Bouton();						//comment recup mes boutons ?
		panf=Bouton.getPanel();					//recuperation du panel cree dans Bouton
		panf.setBackground(Color.ORANGE);
		
		fenetre.setVisible(true);				//affichage fenetre
		fenetre.setContentPane(panf);
		fenetre.getContentPane().add(comp)		//comment ajouter mes boutons ??
		
		panf.setVisible(true);					//affichage panel
	}
}

package vues;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
		
		// recuperation panel bouton
		JPanel panb=Bouton.getPanel();
		
		//parametrage initial fenetre
		JFrame fenetre = new JFrame();			//creation fenetre
		fenetre.setTitle("Caclculatrice");		//ajout d'un titre
		fenetre.setSize(600, 800);				//taille large haut
		fenetre.setLocationRelativeTo(null);	//place la fenetre au milieu
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//ferme fenetre avec croix rouge
		
		//parametrage panel fenetre
		panf.setBackground(Color.GRAY);
		panf.setPreferredSize(new Dimension(600,350));
		fenetre.setLayout(new BorderLayout());						//ajout d'un layout sur le panel de la fenetre
		fenetre.getContentPane().add(panb,BorderLayout.CENTER);		//ajout du panel boutons au centre du panel fenetre
		fenetre.getContentPane().add(panf,BorderLayout.NORTH);		//ajout panel fenetre en haut
		
		//fenetre.setContentPane(panf);
			
		fenetre.setVisible(true);				//affichage fenetre

	}
}

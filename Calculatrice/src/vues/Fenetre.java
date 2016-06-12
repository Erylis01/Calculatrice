package vues;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 	creation de la fenetre Calculatrice
 * 
 * @author Camille Samain
 *
 */

public class Fenetre {
	private JPanel panf = new JPanel ();
	Bouton bouton = new Bouton();
	Case cases = new Case();
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int height = (int)dimension.getHeight();
	int width =(int)dimension.getWidth();
	int heightf = (int)1/4*height;		// ????
	int widthf= (int)1*width;
	
	public Fenetre(){	
		/**
		 *initialisation fenetre
		 */	
		
		//recuperation panel case
		JPanel pancc=cases.getPanc();
		//recuperation panel bouton
		JPanel panb=bouton.getPanb();
		
		//parametrage initial fenetre
		JFrame fenetre = new JFrame();			//creation fenetre
		fenetre.setTitle("Calculatrice");		//ajout d'un titre
		
		fenetre.setSize(600, 800);				//taille large haut
		fenetre.setLocationRelativeTo(null);	//place la fenetre au milieu
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//ferme fenetre avec croix rouge
		
		//parametrage panel fenetre
		panf.setBackground(Color.PINK);
		panf.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GRAY));		//bordure panf
		fenetre.setContentPane(panf);			//panf devient le panel de la fenetre

		//panf.setPreferredSize(new Dimension(300,350));				//definition taille panel
		panf.setLayout(new BorderLayout());						//ajout d'un layout sur le panel de la fenetre
		panf.add(panb,BorderLayout.CENTER);		//ajout du panel boutons au centre du panel fenetre
		panf.add(pancc,BorderLayout.NORTH);		//ajout panel fenetre en haut

		fenetre.setVisible(true);				//affichage fenetre

	}
	


}

package vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controleur.Controleur;

/**
 * creation, positionnement des zones de lecture du texte sur la calculatrice - partie visuelle
 * 
 * @author Camille
 *
 */
public class ZonesTexte extends JPanel {
	
	// creation panel sur lequel on placera les zones de texte
	private JPanel panz = new JPanel();
	
	private Controleur controleur;
	
	private Font police = new Font("Arial", Font.BOLD,40);

	//creation zones de texte vides
	private JLabel zone1 = new JLabel();
	private JLabel zone2 = new JLabel();
	private JLabel zone3 = new JLabel();
	private JLabel zone4 = new JLabel();
	private JLabel zone5 = new JLabel();
	private JLabel zone6 = new JLabel();
	
	public ZonesTexte(Controleur controleur){
		this.controleur=controleur;
		
		//parametrage panel panz avec ajout layout
		panz.setBackground(Color.WHITE);
		GridLayout glz = new GridLayout(6,1);
		panz.setLayout(glz);
		
		//parametrage de chaque zone
		zone1.setPreferredSize(new Dimension(70, 70));
		zone1.setForeground(Color.DARK_GRAY);
		zone1.setHorizontalAlignment(SwingConstants.TRAILING);
		zone1.setFont(police);
		
		zone2.setPreferredSize(new Dimension(70, 70));
		zone2.setForeground(Color.DARK_GRAY);
		zone2.setHorizontalAlignment(SwingConstants.TRAILING);
		zone2.setFont(police);
		
		zone3.setPreferredSize(new Dimension(70, 70));
		zone3.setForeground(Color.DARK_GRAY);
		zone3.setHorizontalAlignment(SwingConstants.TRAILING);
		zone3.setFont(police);
		
		zone4.setPreferredSize(new Dimension(70, 70));
		zone4.setForeground(Color.DARK_GRAY);
		zone4.setHorizontalAlignment(SwingConstants.TRAILING);
		zone4.setFont(police);
		
		zone5.setPreferredSize(new Dimension(70, 70));
		zone5.setForeground(Color.DARK_GRAY);
		zone5.setHorizontalAlignment(SwingConstants.TRAILING);
		zone5.setFont(police);
		
		zone6.setPreferredSize(new Dimension(70, 70));
		zone6.setForeground(Color.DARK_GRAY);
		zone6.setHorizontalAlignment(SwingConstants.TRAILING);
		zone6.setFont(police);
		
		//bordure pour chaque zone
		zone1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone2.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone3.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone4.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone5.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone6.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
				
		//mise en place des zones de texte
		panz.add(zone6);
		panz.add(zone5);
		panz.add(zone4);
		panz.add(zone3);
		panz.add(zone2);
		panz.add(zone1);
	}

	/* GETTERS AND SETTERS*/

	public JPanel getPanz() {
		return panz;
	}

	public void setPanz(JPanel panz) {
		this.panz = panz;
	}
	public JLabel getZone1() {
		return zone1;
	}

	public void setZone1(JLabel zone1) {
		this.zone1 = zone1;
	}

	public JLabel getZone2() {
		return zone2;
	}

	public void setZone2(JLabel zone2) {
		this.zone2 = zone2;
	}

	public JLabel getZone3() {
		return zone3;
	}

	public void setZone3(JLabel zone3) {
		this.zone3 = zone3;
	}

	public JLabel getZone4() {
		return zone4;
	}

	public void setZone4(JLabel zone4) {
		this.zone4 = zone4;
	}

	public JLabel getZone5() {
		return zone5;
	}

	public void setZone5(JLabel zone5) {
		this.zone5 = zone5;
	}

	public JLabel getZone6() {
		return zone6;
	}

	public void setZone6(JLabel zone6) {
		this.zone6 = zone6;
	}
}
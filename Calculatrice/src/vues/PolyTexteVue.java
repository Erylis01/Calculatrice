package vues;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import controleur.ControleurPoly;

public class PolyTexteVue {
	private JPanel panpt = new JPanel();
	private Font policetitre = new Font("Arial", Font.BOLD, 30);
	private Font police = new Font("Arial", Font.PLAIN, 20);
	private ControleurPoly controleur;

	private JTextPane zoneTexteIntro = new JTextPane();
	private JTextPane zoneTexteDegre = new JTextPane();
	private JTextPane zoneTexteCoeff = new JTextPane();
	private JTextPane zoneTexteX = new JTextPane();

	public PolyTexteVue(ControleurPoly controleur) {
		this.controleur = controleur;

		// parametrage panel avec ajout layout pour placer zones de texte
		// consignes
		panpt.setBackground(Color.LIGHT_GRAY);
		GridLayout glpt = new GridLayout(4, 1);
		panpt.setLayout(glpt);

		// mise en place du texte dans le JTextPane Intro
		zoneTexteIntro.setText("CALCUL DE POLYNOMES");
		zoneTexteIntro.setEditable(false);

		// mise en forme JTextPane Intro
		StyledDocument doc = zoneTexteIntro.getStyledDocument();
		MutableAttributeSet centrer = new SimpleAttributeSet();
		StyleConstants.setAlignment(centrer, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, 0, centrer, false);
		zoneTexteIntro.setBackground(Color.LIGHT_GRAY);
		zoneTexteIntro.setForeground(Color.BLACK);
		zoneTexteIntro.setFont(policetitre);

		// ajout du JtextPane Intro dans le panel
		panpt.add(zoneTexteIntro);

		// mise en place du texte dans le JTextPane zoneTexteDegre
		zoneTexteDegre.setText("\n1) Entrez le degré du polynome à évaluer\n");
		zoneTexteDegre.setEditable(false);

		// mise en forme JTextPane zoneTexteDegre
		zoneTexteDegre.setBackground(Color.LIGHT_GRAY);
		zoneTexteDegre.setForeground(Color.BLACK);
		zoneTexteDegre.setFont(police);

		// ajout du JtextPane zoneTexteDegre dans le panel
		panpt.add(zoneTexteDegre);

		// mise en place du texte dans le JTextPane zoneTexteCoeff
		zoneTexteCoeff.setText("2) Entrez tous les coefficients, ordre décroissant, séparateur ; (ex : ax²+bx+c -> a;b;c -> -3;0;5) ");
		zoneTexteCoeff.setEditable(false);

		// mise en forme JTextPane zoneTexteCoeff
		zoneTexteCoeff.setBackground(Color.LIGHT_GRAY);
		zoneTexteCoeff.setForeground(Color.BLACK);
		zoneTexteCoeff.setFont(police);

		// ajout du JtextPane zoneTexteCoeff dans le panel
		panpt.add(zoneTexteCoeff);

		// mise en place du texte dans le JTextPane X
		zoneTexteX.setText("3) Entrez x pour lequel vous voulez calculer le polynome");
		zoneTexteX.setEditable(false);

		// mise en forme JTextPane X
		zoneTexteX.setBackground(Color.LIGHT_GRAY);
		zoneTexteX.setForeground(Color.BLACK);
		zoneTexteX.setFont(police);

		// ajout du JtextPane X dans le panel
		panpt.add(zoneTexteX);
	}

	/* GETTERS AND SETTERS */

	public JPanel getPanpt() {
		return panpt;
	}

	public void setPanpt(JPanel panpt) {
		this.panpt = panpt;
	}

	public JTextPane getZoneTexteIntro() {
		return zoneTexteIntro;
	}

	public void setZoneTexteIntro(JTextPane zoneTexteIntro) {
		this.zoneTexteIntro = zoneTexteIntro;
	}

	public JTextPane getZoneTexteDegre() {
		return zoneTexteDegre;
	}

	public void setZoneTexteDegre(JTextPane zoneTexteDegre) {
		this.zoneTexteDegre = zoneTexteDegre;
	}

	public JTextPane getZoneTexteCoeff() {
		return zoneTexteCoeff;
	}

	public void setZoneTexteCoeff(JTextPane zoneTexteCoeff) {
		this.zoneTexteCoeff = zoneTexteCoeff;
	}

	public JTextPane getZoneTexteX() {
		return zoneTexteX;
	}

	public void setZoneTexteX(JTextPane zoneTexteX) {
		this.zoneTexteX = zoneTexteX;
	}
}

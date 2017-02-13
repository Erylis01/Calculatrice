package vues;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.ControleurCalc;
import controleur.ControleurPoly;

public class PolyCalcVue implements MouseListener, ActionListener{
	private JPanel panpc = new JPanel();
	private Font police = new Font("Arial", Font.BOLD, 30);
	private Font policebis = new Font("Arial", Font.PLAIN, 20);
	private ControleurPoly controleurp;

	private JTextField zoneTexteD = new JTextField();
	private JTextField zoneDegre = new JTextField();
	private JTextField zoneTexteXx = new JTextField();
	private JTextField zoneX = new JTextField();
	private JTextField zoneTexteC = new JTextField();
	private JTextField zoneCoeff = new JTextField();
	private JButton calculer = new JButton();
	private JTextField zoneResultat = new JTextField();

	public PolyCalcVue(ControleurPoly controleurp) {
		this.controleurp = controleurp;

		// parametrage panel avec ajout layout pour placer zones de texte calcul
		// et bouton
		panpc.setBackground(Color.LIGHT_GRAY);
		GridLayout glpc = new GridLayout(4, 2);
		panpc.setLayout(glpc);
		panpc.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

		// mise en place du texte dans le JTextField zoneTexteD
		zoneTexteD.setText("\nDegré = ");
		zoneTexteD.setEditable(false);

		// mise en forme JTextField zoneTexteD
		zoneTexteD.setHorizontalAlignment(JTextField.CENTER);
		zoneTexteD.setBackground(Color.LIGHT_GRAY);
		zoneTexteD.setForeground(Color.DARK_GRAY);
		zoneTexteD.setFont(police);
		zoneTexteD.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));

		// ajout du JTextField Fonction dans le panel
		panpc.add(zoneTexteD);

		// mise en forme JTextField zoneDegre
		zoneDegre.setHorizontalAlignment(JTextField.CENTER);
		zoneDegre.setBackground(Color.WHITE);
		zoneDegre.setForeground(Color.DARK_GRAY);
		zoneDegre.setFont(policebis);
		zoneDegre.setBorder(BorderFactory.createMatteBorder(20, 0, 20, 0, Color.LIGHT_GRAY));

		// ajout du JTextField zoneDegre dans le panel
		panpc.add(zoneDegre);

		// mise en place du texte dans le JTextField zoneTexteC
		zoneTexteC.setText("\nCoefficients = ");
		zoneTexteC.setEditable(false);

		// mise en forme JTextField zoneTexteC
		zoneTexteC.setHorizontalAlignment(JTextField.CENTER);
		zoneTexteC.setBackground(Color.LIGHT_GRAY);
		zoneTexteC.setForeground(Color.DARK_GRAY);
		zoneTexteC.setFont(police);
		zoneTexteC.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));

		// ajout du JTextField zoneTexteC dans le panel
		panpc.add(zoneTexteC);

		// mise en forme JTextField zoneCoeff
		zoneCoeff.setHorizontalAlignment(JTextField.CENTER);
		zoneCoeff.setBackground(Color.WHITE);
		zoneCoeff.setForeground(Color.DARK_GRAY);
		zoneCoeff.setFont(policebis);
		zoneCoeff.setBorder(BorderFactory.createMatteBorder(20, 0, 20, 0, Color.LIGHT_GRAY));

		// ajout du JTextField zoneCoeff dans le panel
		panpc.add(zoneCoeff);
		
		// mise en place du texte dans le JTextField X
		zoneTexteXx.setText("\nx = ");
		zoneTexteXx.setEditable(false);

		// mise en forme JTextField X
		zoneTexteXx.setHorizontalAlignment(JTextField.CENTER);
		zoneTexteXx.setBackground(Color.LIGHT_GRAY);
		zoneTexteXx.setForeground(Color.DARK_GRAY);
		zoneTexteXx.setFont(police);
		zoneTexteXx.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));

		// ajout du JTextField X dans le panel
		panpc.add(zoneTexteXx);

		// mise en forme JTextField zoneX
		zoneX.setHorizontalAlignment(JTextField.CENTER);
		zoneX.setBackground(Color.WHITE);
		zoneX.setForeground(Color.DARK_GRAY);
		zoneX.setFont(policebis);
		zoneX.setBorder(BorderFactory.createMatteBorder(20, 0, 20, 0, Color.LIGHT_GRAY));

		// ajout du JTextField Fonction dans le panel
		panpc.add(zoneX);

		// mise en forme du bouton calculer
		calculer.setText("Calculer");
		calculer.setBackground(Color.DARK_GRAY);
		calculer.setForeground(Color.WHITE);
		calculer.setFont(police);
		calculer.addMouseListener(this);
		calculer.addActionListener(this);

		// ajout du JButton Calculer dans le panel
		panpc.add(calculer);

		// mise en place du texte dans le JTextField resultat
		zoneResultat.setEditable(false);

		// mise en forme JTextField resultat
		zoneResultat.setHorizontalAlignment(JTextField.CENTER);
		zoneResultat.setBackground(Color.WHITE);
		zoneResultat.setForeground(Color.DARK_GRAY);
		zoneResultat.setFont(police);
		zoneResultat.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.DARK_GRAY));

		// ajout du JTextField resultat dans le panel
		panpc.add(zoneResultat);

	}

	/* GETTERS AND SETTERS */

	public JPanel getPanpc() {
		return panpc;
	}

	public void setPanpc(JPanel panpc) {
		this.panpc = panpc;
	}

	public JTextField getZoneTexteD() {
		return zoneTexteD;
	}

	public void setZoneTexteD(JTextField zoneTexteD) {
		this.zoneTexteD = zoneTexteD;
	}

	public JTextField getZoneDegre() {
		return zoneDegre;
	}

	public void setZoneDegre(JTextField zoneDegre) {
		this.zoneDegre = zoneDegre;
	}

	public JTextField getZoneTexteXx() {
		return zoneTexteXx;
	}

	public void setZoneTexteXx(JTextField zoneTexteXx) {
		this.zoneTexteXx = zoneTexteXx;
	}

	public JTextField getZoneX() {
		return zoneX;
	}

	public void setZoneX(JTextField zoneX) {
		this.zoneX = zoneX;
	}

	public JTextField getZoneTexteC() {
		return zoneTexteC;
	}

	public void setZoneTexteC(JTextField zoneTexteC) {
		this.zoneTexteC = zoneTexteC;
	}

	public JTextField getZoneCoeff() {
		return zoneCoeff;
	}

	public void setZoneCoeff(JTextField zoneCoeff) {
		this.zoneCoeff = zoneCoeff;
	}

	public JButton getCalculer() {
		return calculer;
	}

	public void setCalculer(JButton calculer) {
		this.calculer = calculer;
	}

	public JTextField getZoneResultat() {
		return zoneResultat;
	}

	public void setZoneResultat(JTextField zoneResultat) {
		this.zoneResultat = zoneResultat;
	}

	
	/* LISTENERS */
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol = (JButton) e.getSource();
		boutonSurvol.setBackground(Color.CYAN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol = (JButton) e.getSource();
		boutonSurvol.setBackground(Color.DARK_GRAY);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String boutonSelect = new String();
		boutonSelect = e.getActionCommand();
		if (boutonSelect=="Calculer"){
			this.controleurp.writeResult();
		}
	}

}

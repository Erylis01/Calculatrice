package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Case {
	
	// creation panel sur lequel on placera les cases
	private JPanel panc = new JPanel();
	//creation panel au centre duquel on placera panc
	private JPanel pancc = new JPanel();
	
	Font police = new Font("Arial", Font.BOLD,30);

	//creation zones de texte vides
	private JLabel zone1 = new JLabel();
	private JLabel zone2 = new JLabel();
	private JLabel zone3 = new JLabel();
	private JLabel zone4 = new JLabel();
	private JLabel zone5 = new JLabel();
	
	public Case(){
		
		//parametrage panel pancc avec ajout layout
		pancc.setBackground(Color.RED);
		BorderLayout bl = new BorderLayout();
		pancc.setLayout(bl);
		
		//parametrage de chaque case
		zone1.setPreferredSize(new Dimension(70, 70));
		zone1.setForeground(Color.BLUE);
		zone1.setFont(police);
		zone2.setPreferredSize(new Dimension(70, 70));
		zone2.setForeground(Color.BLUE);
		zone2.setFont(police);
		zone3.setPreferredSize(new Dimension(70, 70));
		zone3.setForeground(Color.BLUE);
		zone3.setFont(police);
		zone4.setPreferredSize(new Dimension(70, 70));
		zone4.setForeground(Color.BLUE);
		zone4.setFont(police);
		zone5.setPreferredSize(new Dimension(70, 70));
		zone5.setForeground(Color.BLUE);
		zone5.setFont(police);
		
		//bordure pour chaque case
		zone1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone2.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone3.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone4.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.GRAY));
		zone5.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.GRAY));
		
		//organisation des cases
		GridLayout gl = new GridLayout (5,1);
		panc.setLayout(gl);
		
		panc.add(zone1);
		panc.add(zone2);
		panc.add(zone3);
		panc.add(zone4);
		panc.add(zone5);
		
		pancc.add(panc, BorderLayout.CENTER);
	
	}

	public JPanel getPancc() {
		return pancc;
	}

	public void setPancc(JPanel pancc) {
		this.pancc = pancc;
	}

	public JPanel getPanc() {
		return panc;
	}

	public void setPanc(JPanel panc) {
		this.panc = panc;
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

}

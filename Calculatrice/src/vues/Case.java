package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Case {
	
	// creation panel sur lequel on placera les cases
	private JPanel panc = new JPanel();
	//creation panel au centre duquel on placera panc
	private JPanel pancc = new JPanel();

	//creation zones de texte vides
	private JTextField zone1 = new JTextField(null);
	private JTextField zone2 = new JTextField(null);
	private JTextField zone3 = new JTextField(null);
	private JTextField zone4 = new JTextField(null);
	private JTextField zone5 = new JTextField(null);
	
	public Case(){
		
		//parametrage panel pancc avec ajout layout
		pancc.setBackground(Color.RED);
		BorderLayout bl = new BorderLayout();
		pancc.setLayout(bl);
		
		//parametrage de chaque case
		zone1.setPreferredSize(new Dimension(50, 50));
		zone1.setForeground(Color.BLUE);
		zone2.setPreferredSize(new Dimension(50, 50));
		zone2.setForeground(Color.BLUE);
		zone3.setPreferredSize(new Dimension(50, 50));
		zone3.setForeground(Color.BLUE);
		zone4.setPreferredSize(new Dimension(50, 50));
		zone4.setForeground(Color.BLUE);
		zone5.setPreferredSize(new Dimension(50, 50));
		zone5.setForeground(Color.BLUE);
		
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

	public JTextField getZone1() {
		return zone1;
	}

	public void setZone1(JTextField zone1) {
		this.zone1 = zone1;
	}

	public JTextField getZone2() {
		return zone2;
	}

	public void setZone2(JTextField zone2) {
		this.zone2 = zone2;
	}

	public JTextField getZone3() {
		return zone3;
	}

	public void setZone3(JTextField zone3) {
		this.zone3 = zone3;
	}

	public JTextField getZone4() {
		return zone4;
	}

	public void setZone4(JTextField zone4) {
		this.zone4 = zone4;
	}

	public JTextField getZone5() {
		return zone5;
	}

	public void setZone5(JTextField zone5) {
		this.zone5 = zone5;
	}

}

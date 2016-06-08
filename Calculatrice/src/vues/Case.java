package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Case {
	// creation panel sur lequel on placera les cases
	private static JPanel panc = new JPanel();
	//creation zone de texte vide
	private JTextField jtf = new JTextField(null);
	//creation nom zone de texte
	private JLabel label = new JLabel("Resultat");
	
	public Case(){
		
		//parametrage panel case avec ajout layout
		panc.setBackground(Color.GREEN);
		BorderLayout bl = new BorderLayout();
		panc.setLayout(bl);
		
		jtf.setPreferredSize(new Dimension(200, 100));
		jtf.setForeground(Color.BLUE);
		panc.add(label, BorderLayout.WEST);
		panc.add(jtf, BorderLayout.CENTER);
		
	}
	
	public static JPanel getPanc() {
		return panc;
	}

	public static void setPanc(JPanel panc) {
		Case.panc = panc;
	}

	public JTextField getJtf() {
		return jtf;
	}

	public void setJtf(JTextField jtf) {
		this.jtf = jtf;
	}
}

package vues;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class APropos {
	private JPanel panap = new JPanel();
	private Font police = new Font("Arial", Font.PLAIN, 32);
	private JTextPane zoneAPropos = new JTextPane();

	/**
	 * Vue presentant la calculatrice
	 */
	public APropos() {
		panap.setBackground(Color.LIGHT_GRAY);

		// mise en forme du texte dans le JTextPane
		StyledDocument doc = zoneAPropos.getStyledDocument();
		MutableAttributeSet centrer = new SimpleAttributeSet();
		StyleConstants.setAlignment(centrer, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, 0, centrer, false);

		// mise en place du texte dans le JTextPane
		zoneAPropos.setText("Calculatrice en NPI réalisée par :\n \nCamille SAMAIN\nEMACS 166\nEcole des Mines d'Alès");
		zoneAPropos.setEditable(false);

		// mise en forme JTextPane
		zoneAPropos.setBackground(Color.LIGHT_GRAY);
		zoneAPropos.setForeground(Color.DARK_GRAY);
		zoneAPropos.setFont(police);

		// ajout du JtextPane dans le panel
		panap.add(zoneAPropos);
	}

	/* GETTERS AND SETTERS */

	/**
	 * @return
	 */
	public JTextPane getZoneAPropos() {
		return zoneAPropos;
	}

	public void setZoneAPropos(JTextPane zoneAPropos) {
		this.zoneAPropos = zoneAPropos;
	}

	public JPanel getPanap() {
		return panap;
	}

	public void setPanap(JPanel panap) {
		this.panap = panap;
	}

}

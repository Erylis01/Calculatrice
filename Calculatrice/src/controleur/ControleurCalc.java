package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;

import modele.Accumulateur;
import modele.Polynome;
import vues.Fenetre;

public class ControleurCalc implements PropertyChangeListener {
	
	private Accumulateur accu;
	private Fenetre fenetre;
	private ControleurPoly controleurp;
	private JButton[] tab_boutons;

	public ControleurCalc (Accumulateur accu) {
		this.accu = accu;
		Polynome poly = new Polynome();
		this.controleurp = new ControleurPoly(this,poly);
		this.fenetre=controleurp.getFenetre();
	}

	/**
	 * @param s
	 * ecrit dans la 1ere zone = zone de saisie
	 */
	public void writeTextZ1(String s) {
		String texteexistant = this.fenetre.getZones().getZone1().getText();
		this.fenetre.getZones().getZone1().setText(texteexistant + s);
	}

	/**
	 * @param texte
	 * permet l'affichage du texte dans les zones correspondantes.
	 *  S'occupe du decalage de zone en zone
	 */
	public void displayText(String texte) {
		String textetampon;
		textetampon = this.fenetre.getZones().getZone5().getText();
		this.fenetre.getZones().getZone6().setText(textetampon);
		textetampon = this.fenetre.getZones().getZone4().getText();
		this.fenetre.getZones().getZone5().setText(textetampon);
		textetampon = this.fenetre.getZones().getZone3().getText();
		this.fenetre.getZones().getZone4().setText(textetampon);
		textetampon = this.fenetre.getZones().getZone2().getText();
		this.fenetre.getZones().getZone3().setText(textetampon);
		this.fenetre.getZones().getZone2().setText(texte);
		this.fenetre.getZones().getZone1().setText("");
	}

	/**
	 * rajoute l'element ecrit dans la pile et l'affiche
	 */
	public void exe() {
		String textenbre = this.fenetre.getZones().getZone1().getText();
		Double nbreajouter;
		nbreajouter = Double.parseDouble(textenbre);
		accu.push(nbreajouter);
		this.displayText(textenbre);
	}

	/**
	 * donne le negatif du nbre ecrit et l'affiche
	 */
	public void neg() {
		double nbreneg = accu.neg();
		String texteneg;
		if (nbreneg == Double.NEGATIVE_INFINITY) {
			texteneg = "Error ! Please clear";
		} else {
			texteneg = Double.toString(nbreneg);
		}
		this.displayText(texteneg);
	}

	/**
	 * additionne les 2 derniers elements de la pile et l'affiche
	 */
	public void add() {
		double nbreadd = accu.add();
		String texteadd;
		if (nbreadd == Double.POSITIVE_INFINITY) {
			texteadd = "Error ! Please clear";
		} else {
			texteadd = Double.toString(nbreadd);
		}
		this.displayText(texteadd);
	}

	/**
	 * soustrait les 2 derniers elements de la pile et affiche
	 */
	public void sub() {
		double nbresub = accu.sub();
		String textesub;
		if (nbresub == Double.NEGATIVE_INFINITY) {
			textesub = "Error ! Please clear";
		} else {
			textesub = Double.toString(nbresub);
		}
		this.displayText(textesub);
	}

	/**
	 * multiplie les 2 derniers elements de la pile et affiche
	 */
	public void mult() {
		double nbremult= accu.mult();
		String textemult;
		if (nbremult == Double.POSITIVE_INFINITY) {
			textemult = "Error ! Please clear";
		} else {
			textemult = Double.toString(nbremult);
		}
		this.displayText(textemult);
	}

	/**
	 * divise les 2 derniers elements de la pile et affiche
	 */
	public void div() {
		double nbrediv = accu.div();
		String textediv;
		if (nbrediv == Double.POSITIVE_INFINITY) {
			textediv = "Error ! Please clear";
		} else {
			textediv = Double.toString(nbrediv);
		}
		this.displayText(textediv);
	}

	/**
	 * vide totalement la pile et la calcu
	 */
	public void clearall() {
		accu.clear();
		this.fenetre.getZones().getZone1().setText("");
		this.fenetre.getZones().getZone2().setText("");
		this.fenetre.getZones().getZone3().setText("");
		this.fenetre.getZones().getZone4().setText("");
		this.fenetre.getZones().getZone5().setText("");
		this.fenetre.getZones().getZone6().setText("");
	}

	/**
	 * efface la zone Zone1 de saisie
	 */
	public void delete() {
		this.fenetre.getZones().getZone1().setText("");
	}

	/*LISTENERS*/
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		evt.getNewValue();
		
		switch (evt.getPropertyName()) {
		case "push" :
			
		}
			
	}

	
}

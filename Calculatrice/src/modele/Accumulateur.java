package modele;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

/**
 * Represente une memoire qui contient le resultat du calcul en cours
 * 
 * @author Camille
 *
 */

public class Accumulateur {

	/**
	 * Methode constructeur
	 */
	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private Pile pile;
	private Pile pileinit;

	public Accumulateur() {
		this.pile = new Pile();
		this.pileinit = this.pile; // on stocke la pile avant de la modifier
	}

	/**
	 * @param nbreajouter
	 * ajoute un element a la pile
	 */
	public void push(double nbreajouter) {
		this.pile.push(nbreajouter);
		this.pile.display();
		this.pcs.firePropertyChange("push", this.pileinit, this.pile);
	}

	/**
	 * enleve le dernier element de la pile
	 */
	public void drop() {
		this.pile.drop();
		this.pile.display();
		this.pcs.firePropertyChange("drop", this.pileinit, this.pile);
	}

	/**
	 * vide la pile
	 */
	public void clear() {
		this.pile.clear();
		this.pile.display();
		this.pcs.firePropertyChange("clear", this.pileinit, this.pile);
	}

	/**
	 * echange l'ordre des 2 dernieres operandes
	 */
	public void swap() {
		if (this.pile.size() < 2) {
			System.out.println("Il n'y a pas assez d'elements : pas d'echange possible");
		} else {
			double element1;
			double element2;
			element1 = this.pile.pop();
			element2 = this.pile.pop();
			this.pile.push(element1);
			this.pile.push(element2);
			this.pile.display();
			this.pcs.firePropertyChange("swap", this.pileinit, this.pile);
		}
	}

	/**
	 * additionne les 2 derniers elements de la pile et les reinsere dans la
	 * pile
	 */
	public double add() {
		double addition;
		if (this.pile.size()<2){
			System.out.println("Il n'y a pas assez d'elements : pas d'addition possible");
			addition=Double.POSITIVE_INFINITY;
		}
		else{
			double element1;
			double element2;
			element1 = this.pile.pop();
			element2 = this.pile.pop();
			addition = element1 + element2;
			this.pile.push(addition);
			this.pile.display();
			this.pcs.firePropertyChange("add", this.pileinit, this.pile);
		}
		return addition;
	}

	/**
	 * soustrait les 2 derniers elements de la pile
	 */
	public double sub() {
		double soustraction;
		if (this.pile.size() < 2) {
			System.out.println("Il n'y a pas assez d'elements : pas de soustraction possible");
			soustraction=Double.NEGATIVE_INFINITY;
		} else {
			double element1;
			double element2;
			element1 = this.pile.pop();
			element2 = this.pile.pop();
			soustraction = element2 - element1;
			this.pile.push(soustraction);
			this.pile.display();
			this.pcs.firePropertyChange("sub", this.pileinit, this.pile);
		}
		return soustraction;
	}

	/**
	 * multiplie les 2 derniers elements de la pile
	 */
	public double mult() {
		double multiplication;
		if (this.pile.size() < 2) {
			System.out.println("Il n'y a pas assez d'elements : pas de multiplication possible");
			multiplication=Double.POSITIVE_INFINITY;
		} else {
			double element1;
			double element2;
			element1 = this.pile.pop();
			element2 = this.pile.pop();
			multiplication = element1 * element2;
			this.pile.push(multiplication);
			this.pile.display();
			this.pcs.firePropertyChange("mult", this.pileinit, this.pile);
		}
		return multiplication;
	}

	/**
	 * divise les 2 derniers elements de la pile
	 */
	public double div() {
		double division;
		if (this.pile.size() < 2) {
			System.out.println("Il n'y a pas assez d'elements : pas de division possible");
			division=Double.POSITIVE_INFINITY;
		} else {
			double element1;
			double element2;
			element1 = this.pile.pop();
			element2 = this.pile.pop();
			if (element1 == 0) {
				System.out.println("Erreur : division par 0");
				division=Double.POSITIVE_INFINITY;
			} else {
				division = element2 / element1;
				this.pile.push(division);
				this.pile.display();
				this.pcs.firePropertyChange("div", this.pileinit, this.pile);
			}
		}
		return division;
	}

	/**
	 * transforme un nbre positif en negatif et reciproquement
	 */
	public double neg() {
		double element;
		if (this.pile.size() == 0) {
			System.out.println("Erreur : la pile est vide");
			element=Double.NEGATIVE_INFINITY;
		} else {
			element = this.pile.pop();
			element = -element;
			this.pile.push(element);
			this.pile.display();
			this.pcs.firePropertyChange("neg", this.pileinit, this.pile);
		}
		return element;
	}
}

package modele;

/**
 * 
 * 
 * @author Camille
 *
 */

import java.util.Stack;

public class Pile {
	Stack<Double> pile; // creation d une nouvelle pile

	public Pile() {
		this.pile = new Stack<>(); //la nouvelle pile est definie comme vide
	}

	/**
	 * @param entierajouter
	 * ajoute un double a la pile
	 */
	public void push(double nbreajouter) {
		this.pile.push(nbreajouter);
	}

	/**
	 * Retourne le dernier element de la pile (le plus haut) et le retire
	 */
	public double pop() {
		double dernierelement;
		if (this.size() == 0) {
			System.out.println("La pile est vide");
			dernierelement=0;
		} else {
			dernierelement = this.pile.pop();
		}
		return dernierelement;
	}

	/**
	 * enleve le dernier element de la pile
	 */
	public void drop() {
		if (this.size() == 0) {
			System.out.println("La pile est vide");
		} else {
			this.pile.remove(this.size() - 1);
		}
	}

	/**
	 * vide la pile
	 */
	public void clear() {
		this.pile.clear();
	}
	
	/**
	 * affiche la pile
	 */
	public void display(){
		System.out.println(this.pile);
	}
	
	/**
	 * @return la taille de la pile
	 */
	public int size(){
		return this.pile.size();
	}

}

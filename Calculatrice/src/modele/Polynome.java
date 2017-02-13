package modele;

import java.util.ArrayList;
import java.util.List;

public class Polynome {
	private int degre;
	private double x;

	public Polynome() {
	}

	public double calculPoly(int degre, double[] coeff, double x) {
		this.degre = degre;
		this.x = x;
		double resultat=0;
		if (degre + 1 != coeff.length) {
			System.out.println("Erreur : nombre de coefficients incorrect");
			resultat = Double.NEGATIVE_INFINITY;
		} else {
			for (int i = degre; i >= 0; i--) {
				resultat = resultat + coeff[degre - i] * Math.pow(x, i);
				System.out.println(resultat);
			}
		}
		return resultat;
	}
	
	
}

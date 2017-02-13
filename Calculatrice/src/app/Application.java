package app;

import controleur.ControleurCalc;
import controleur.ControleurPoly;
import modele.Accumulateur;
import modele.Polynome;
import vues.Fenetre;

public class Application {

	public static void main(String[] args) {
		
		Accumulateur accu = new Accumulateur();
		ControleurCalc contc = new ControleurCalc(accu);
	}
	

}


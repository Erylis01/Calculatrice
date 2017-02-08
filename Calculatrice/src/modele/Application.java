package modele;

import controleur.Controleur;
import vues.Fenetre;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accumulateur accu = new Accumulateur();
	    Controleur cont = new Controleur(accu);
	
	}
	

}


package controleur;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import modele.Polynome;
import vues.Fenetre;

public class ControleurPoly implements PropertyChangeListener {

	private Polynome poly;
	private Fenetre fenetre;
	private ControleurCalc controleurc;
	
	public ControleurPoly(ControleurCalc controleurCalc, Polynome poly){
		this.poly=poly;
		this.controleurc=controleurCalc;
		this.fenetre=new Fenetre(controleurc, this);		
	}
	
	public void writeResult(){
		String degretexte = this.fenetre.getPolynomesCalcul().getZoneDegre().getText();
		int degre=Integer.parseInt(degretexte);
		String coefftexte =this.fenetre.getPolynomesCalcul().getZoneCoeff().getText();
		String [] morceauxcoeff = coefftexte.split(";");
		double [] coeff = new double [morceauxcoeff.length];
		for (int k=0 ; k<morceauxcoeff.length; k++){
			coeff[k]=Double.parseDouble(morceauxcoeff[k]);
		}
		String xtexte=this.fenetre.getPolynomesCalcul().getZoneX().getText();
		double x= Double.parseDouble(xtexte);
		double resultat = poly.calculPoly(degre, coeff, x);
		String resultattexte = Double.toString(resultat);
		this.fenetre.getPolynomesCalcul().getZoneResultat().setText(resultattexte);
	}

	/*LISTENERS*/
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

	public Fenetre getFenetre() {
		return fenetre;
	}

	public void setFenetre(Fenetre fenetre) {
		this.fenetre = fenetre;
	}
}

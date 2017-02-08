package controleur;

import modele.Accumulateur;
import vues.Fenetre;

public class Controleur {

	private Accumulateur accu;
	private Fenetre fenetre;
	
	public Controleur(Accumulateur accu){
		this.accu=accu;
		this.fenetre = new Fenetre(this);
		
	}
	
	/**
	 * @param s
	 * ecrit dans la 1ere zone = zone de saisie
	 */
	public void writeTextZ1(String s){
		String texteexistant;
		texteexistant = this.fenetre.getZones().getZone1().getText();
		this.fenetre.getZones().getZone1().setText(texteexistant+s);
	}
	
	/**
	 * @param texte
	 * permet l'affichage du texte dans les zones correspondantes. S'occupe du decalage de zone en zone
	 */
	public void displayText(String texte){
		String textetampon;
		textetampon=this.fenetre.getZones().getZone5().getText();
		this.fenetre.getZones().getZone6().setText(textetampon);
		textetampon=this.fenetre.getZones().getZone4().getText();
		this.fenetre.getZones().getZone5().setText(textetampon);
		textetampon=this.fenetre.getZones().getZone3().getText();
		this.fenetre.getZones().getZone4().setText(textetampon);
		textetampon=this.fenetre.getZones().getZone2().getText();
		this.fenetre.getZones().getZone3().setText(textetampon);
		this.fenetre.getZones().getZone2().setText(texte);
		this.fenetre.getZones().getZone1().setText("");
	}
	
	/**
	 * rajoute l'element ecrit dans la pile et l'affiche
	 */
	public void exe(){
		String textenbre;
		textenbre=this.fenetre.getZones().getZone1().getText();
		Double nbreajouter;
		nbreajouter=Double.parseDouble(textenbre);
		accu.push(nbreajouter);
		this.displayText(textenbre);
	}
	
	/**
	 * donne le negatif du nbre ecrit et l'affiche
	 */
	public void neg(){
		double nbreneg;
		String texteneg;
		nbreneg=accu.neg();
		if (nbreneg==Double.NEGATIVE_INFINITY){
			texteneg="Error ! Please clear";
		}else{
			texteneg=Double.toString(nbreneg);
		}
		this.displayText(texteneg);
	}
	
	/**
	 * additionne les 2 derniers elements de la pile et l'affiche
	 */
	public void add(){
		double nbreadd;
		String texteadd;
		nbreadd=accu.add();
		if (nbreadd==Double.POSITIVE_INFINITY){
			texteadd ="Error ! Please clear";
		}
		else{
			texteadd=Double.toString(nbreadd);
		}
		this.displayText(texteadd);		
	}
	
	/**
	 * soustrait les 2 derniers elements de la pile et affiche
	 */
	public void sub(){
		double nbresub;
		String textesub;
		nbresub=accu.sub();
		if (nbresub==Double.NEGATIVE_INFINITY){
			textesub ="Error ! Please clear";
		}
		else{
			textesub=Double.toString(nbresub);
		}
		this.displayText(textesub);
	}
	
	/**
	 * multiplie les 2 derniers elements de la pile et affiche
	 */
	public void mult(){
		double nbremult;
		String textemult;
		nbremult=accu.mult();
		if (nbremult==Double.POSITIVE_INFINITY){
			textemult ="Error ! Please clear";
		}
		else{
			textemult=Double.toString(nbremult);
		}
		this.displayText(textemult);	
	}
	
	/**
	 * divise les 2 derniers elements de la pile et affiche
	 */
	public void div(){
		double nbrediv;
		String textediv;
		nbrediv=accu.div();
		if (nbrediv==Double.POSITIVE_INFINITY){
			textediv ="Error ! Please clear";
		}
		else{
			textediv=Double.toString(nbrediv);
		}
		this.displayText(textediv);	
	}
	
	/**
	 * vide totalement la pile et la calcu
	 */
	public void clearall(){
		accu.clear();
		this.fenetre.getZones().getZone1().setText("");
		this.fenetre.getZones().getZone2().setText("");
		this.fenetre.getZones().getZone3().setText("");
		this.fenetre.getZones().getZone4().setText("");
		this.fenetre.getZones().getZone5().setText("");
		this.fenetre.getZones().getZone6().setText("");
	}
	
	/**
	 * efface la derniere saisie
	 */
	public void delete(){
		accu.drop();
		this.fenetre.getZones().getZone2().setText("");
	}
}

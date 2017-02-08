package vues;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controleur.Controleur;

/**
 * creation, positionnement des differents boutons de la calculatrice - partie
 * visuelle
 * 
 * @author Camille
 *
 */
public class Boutons extends JButton implements ActionListener, MouseListener, KeyListener {
	// creation panel sur lequel on placera les boutons
	private JPanel panb = new JPanel();
	private Font police = new Font("Arial", Font.BOLD, 40);
	private Controleur controleur;

	/**
	 * cree les boutons et les place sur le panel
	 */
	public Boutons(Controleur controleur) {

		this.controleur=controleur;
		
		// parametrage panel bouton avec ajout layout pour placer boutons
		panb.setBackground(Color.GRAY);
		GridLayout glb = new GridLayout(5, 4);
		glb.setHgap(2);
		glb.setVgap(2);
		panb.setLayout(glb);

		// creation boutons
		String[] tab_caract = { "CE", "C", "EXE", "+", "7", "8", "9", "-", "4", "5", "6", "*", "1", "2", "3", "/", "0",
				".", "+/-", "" };
		JButton[] tab_boutons = new JButton[tab_caract.length];

		for (int i = 0; i < tab_caract.length; i++) {
			tab_boutons[i] = new JButton(tab_caract[i]); // creation boutons pour chaque caractere de tab_caract
			tab_boutons[i].setBackground(Color.DARK_GRAY); // couleur boutons
			tab_boutons[i].setForeground(Color.WHITE); // couleur police boutons
			tab_boutons[i].setFont(police);
			tab_boutons[i].addActionListener(this);
			tab_boutons[i].addMouseListener(this);
			tab_boutons[i].addKeyListener(this);
			panb.add(tab_boutons[i]); // ajout boutons au panel
		}
		panb.setVisible(true);
	}

	public JPanel getPanb() {
		return panb;
	}

	public void setPanel(JPanel panel) {
		this.panb = panel;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 * differentes actions selon le bouton selectionne
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String boutonSelect = new String();
		boutonSelect=e.getActionCommand();
		switch (boutonSelect){
			case "CE":
				this.controleur.delete();
				break;
			case "C":
				this.controleur.clearall();
				break;
			case "EXE":
				this.controleur.exe();
				break;
			case "+/-":
				this.controleur.neg();
				break;
			case ".":
				this.controleur.writeTextZ1(boutonSelect);
				break;
			case "+":
				this.controleur.add();
				break;
			case "-":
				this.controleur.sub();
				break;
			case "*":
				this.controleur.mult();
				break;
			case "/":
				this.controleur.div();
				break;
			default :
				this.controleur.writeTextZ1(boutonSelect);
				break;
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 * colore le bouton au survol
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol=(JButton) e.getSource();
		boutonSurvol.setBackground(Color.CYAN);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 * colore le bouton en quittant le bouton
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol=(JButton) e.getSource();
		boutonSurvol.setBackground(Color.DARK_GRAY);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 * differentes actions selon la touche du clavier selectionee
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		String charact;
		charact=Character.toString(e.getKeyChar());
		System.out.println(e.getKeyChar());
		//System.out.println("debut"+charact+"fin");
		switch (charact){
//		case "":
//			this.controleur.delete();
//			break;
//		case "C":
//			this.controleur.clearall();
//			break;
		case "":
			this.controleur.exe();
			break;
//		case "+/-":
//			this.controleur.neg();
//			break;
		case ".":
			this.controleur.writeTextZ1(charact);
			break;
		case "+":
			this.controleur.add();
			break;
		case "-":
			this.controleur.sub();
			break;
		case "*":
			this.controleur.mult();
			break;
		case "/":
			this.controleur.div();
			break;
		default :
			this.controleur.writeTextZ1(charact);
			break;
	}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

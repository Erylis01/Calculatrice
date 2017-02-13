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

import controleur.ControleurCalc;

/**
 * creation, positionnement des differents boutons de la calculatrice - partie
 * visuelle
 * 
 * @author Camille
 *
 */
public class Boutons extends JButton implements MouseListener, KeyListener, ActionListener {
	// creation panel sur lequel on placera les boutons
	private JPanel panb = new JPanel();
	private Font police = new Font("Arial", Font.BOLD, 40);
	private ControleurCalc controleurc;

	/**
	 * cree les boutons et les place sur le panel
	 */
	public Boutons(ControleurCalc controleurc) {

		this.controleurc = controleurc;

		// parametrage panel bouton avec ajout layout pour placer boutons
		panb.setBackground(Color.LIGHT_GRAY);
		GridLayout glb = new GridLayout(5, 4);
		glb.setHgap(2);
		glb.setVgap(2);
		panb.setLayout(glb);

		// creation boutons
		String[] tab_caract = { "", "CE", "C", "+", "7", "8", "9", "-", "4", "5", "6", "*", "1", "2", "3", "/", "0",
				".", "+/-", "EXE" };
		JButton [] tab_boutons = new JButton[tab_caract.length];
		
		for (int i = 0; i < tab_caract.length; i++) {
			// creation boutons sur chaque caractere de tab_caract
			tab_boutons[i] = new JButton(tab_caract[i]); 
			if (i > 0) {
				tab_boutons[i].setBackground(Color.DARK_GRAY); 
				tab_boutons[i].setForeground(Color.WHITE); 
				tab_boutons[i].setFont(police);
				tab_boutons[i].addActionListener(this);
				tab_boutons[i].addMouseListener(this);
				tab_boutons[i].addKeyListener(this);
			}else{
				tab_boutons[i].setBackground(Color.LIGHT_GRAY);
				tab_boutons[i].setEnabled(false);
			}
			// ajout boutons au panel
			panb.add(tab_boutons[i]); 
		}
		panb.setVisible(true);
	}

	/* GETTERS AND SETTERS */

	public JPanel getPanb() {
		return panb;
	}

	public void setPanel(JPanel panel) {
		this.panb = panel;
	}


	/* LISTENERS */

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 * colore le bouton au survol
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol = (JButton) e.getSource();
		boutonSurvol.setBackground(Color.CYAN);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 * colore le bouton en quittant le bouton
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		JButton boutonSurvol = new JButton();
		boutonSurvol = (JButton) e.getSource();
		boutonSurvol.setBackground(Color.DARK_GRAY);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String boutonSelect = new String();
		boutonSelect = e.getActionCommand();
		switch (boutonSelect) {
		case "CE":
			this.controleurc.delete();
			break;
		case "C":
			this.controleurc.clearall();
			break;
		case "EXE":
			this.controleurc.exe();
			break;
		case "+/-":
			this.controleurc.neg();
			break;
		case ".":
			this.controleurc.writeTextZ1(boutonSelect);
			break;
		case "+":
			this.controleurc.add();
			break;
		case "-":
			this.controleurc.sub();
			break;
		case "*":
			this.controleurc.mult();
			break;
		case "/":
			this.controleurc.div();
			break;
		default:
			this.controleurc.writeTextZ1(boutonSelect);
			break;
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent) lien
	 * clavier controleur : differentes actions selon la touche du clavier
	 * selectionee
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		String charact;
		charact = Character.toString(e.getKeyChar());
		switch (charact) {
		case ".":
			this.controleurc.writeTextZ1(charact);
			break;
		case "0":
			this.controleurc.writeTextZ1(charact);
			break;
		case "1":
			this.controleurc.writeTextZ1(charact);
			break;
		case "2":
			this.controleurc.writeTextZ1(charact);
			break;
		case "3":
			this.controleurc.writeTextZ1(charact);
			break;
		case "4":
			this.controleurc.writeTextZ1(charact);
			break;
		case "5":
			this.controleurc.writeTextZ1(charact);
			break;
		case "6":
			this.controleurc.writeTextZ1(charact);
			break;
		case "7":
			this.controleurc.writeTextZ1(charact);
			break;
		case "8":
			this.controleurc.writeTextZ1(charact);
			break;
		case "9":
			this.controleurc.writeTextZ1(charact);
			break;
		case "+":
			this.controleurc.add();
			break;
		case "-":
			this.controleurc.sub();
			break;
		case "*":
			this.controleurc.mult();
			break;
		case "/":
			this.controleurc.div();
			break;
		default:
			break;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent) lien
	 * clavier controleur pour les touches speciales
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			this.controleurc.exe();
		} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			this.controleurc.delete();
			;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
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
}
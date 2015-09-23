package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Oiseau extends JPanel {

	/* Variables */

	// Coordonnee de la balle
	private int posX, posY;


	// Vitesse de deplacement de l
	private int speed = 1;

	//LA couleur de la balle
	private Color c = Color.BLACK;
        
        private int x;
        private int y;
	
	/* Constructeur */

	public Oiseau(int x, int y) {
		this.x = x;
                this.y = y;
	}

	/* Fonction */

	/**
	 * Fonction qui repositionne l'oiseau à sa position initiale et orienté vers
	 * le haut avec une vitesse de 1.
	 */
	public void resetBalle() {
		posX = 150;
		posY = 400;
	}

	/**
	 * Fonctionne qui met àà jour la position de l'oiseau suivant sa vitesse 
	 */
	public void bougerBalle() {
		posX += (speed);
		posY += (speed);
	}

	/**
	 * Fonction qui dessine l'oiseau sur l ecran
	 * 
	 * @param g
	 *            le moteur graphique
	 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		//g2d.fillRect(posX, posY, 8, 8);
		g.fillOval(this.x, this.y, 25, 25);
		g.setColor(Color.BLACK);
		g.fillArc(this.x+20,this.y-5,20,35,170,20);  /*Fonction du fillArc (position X, position Y, */
	}
}
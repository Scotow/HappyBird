package HappyBird.Object.Element;

import java.awt.Color;
import java.awt.Polygon;

import HappyBird.Object.Config.Constante;
import HappyBird.Object.Config.Coordonnee;

/**
 * Correspond au bec de l'oiseau Created by Benjamin on 04/11/15.
 */
public class Bec {

	private Coordonnee coordonnee;
	private Color color = Color.BLACK;
	private Polygon bec;

	public Bec(Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
		this.bec = new Polygon();
	}

	/**
	 * Fabrique le bec de l'oiseau
	 * 
	 */
	public void setPolygon() {
		bec = new Polygon(
				new int[] { (int) (coordonnee.getX() + Constante.BIRD_BODY_RADIUS / 2 * Math.cos(22)),
						(int) coordonnee.getX() + Constante.BIRD_BODY_RADIUS / 2 + 10,
						(int) (coordonnee.getX() - Constante.BIRD_BODY_RADIUS / 2 * Math.cos(22)) },
				new int[] { (int) (coordonnee.getY() + Constante.BIRD_BODY_RADIUS / 2 * Math.sin(25)),
						(int) coordonnee.getY() + Constante.BIRD_BODY_RADIUS / 2 + 10,
						(int) (coordonnee.getY() - Constante.BIRD_BODY_RADIUS / 2 * Math.sin(25)) },
				3);
	}

	public Polygon getBec() {
		return bec;
	}

	public Coordonnee getCoordonnee() {
		return coordonnee;
	}

	public void setPosition(double x, double y) {
		this.coordonnee = new Coordonnee(x, y);
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
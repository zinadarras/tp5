package tp6;

import java.time.LocalDate;

public class Cuillere extends Ustensile{
	private double longueur;
	public Cuillere(LocalDate d,double longueur) {
		super(d);
		this.setLongueur(longueur);
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
}

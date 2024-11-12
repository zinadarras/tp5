package tp6;

import java.time.LocalDate;

public class Collection {
	public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		LocalDate d1 = LocalDate.of(1926, 2, 4);
        LocalDate d2 = LocalDate.of(1881, 5, 7);
        LocalDate d3 = LocalDate.of(1935, 7, 20);
        LocalDate d4 = LocalDate.of(1917, 1, 8);
        LocalDate d5 = LocalDate.of(1926, 2, 4);
		us[0] = new AssietteRonde(d1, 8.4);
		us[1] = new Cuillere(d2, 7.3);
		us[2] = new AssietteCarree(d3, 5.6);
		us[3] = new Cuillere(d4, 8.8);
		us[4] = new AssietteRonde(d5, 5.4);

		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		}
	static void afficherCuilleres(Ustensile[] us) { 
		int nbCuilleres = 0;
		for (int i = 0; i < us.length; i++) {
			if (us[i] instanceof Cuillere)
				nbCuilleres++;
		}
	System.out.println("Il y a " + nbCuilleres + " cuillères.");
}
	static void afficherSurfaceAssiettes(Ustensile[] us) {
		double som=0;
		for (int i = 0; i < us.length; i++) {
			if (us[i] instanceof Assiette) {
				som=som+((Assiette)us[i]).calculSurface();
			}
		}
		System.out.println(som);
	}
	static void afficherValeurTotale(Ustensile[] us) {
		double som=0;
		for (int i = 0; i < us.length; i++) {
				som=som+us[i].calculVal();
		}
		System.out.println(som);
	}
}

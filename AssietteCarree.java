package tp6;

import java.time.LocalDate;

public class AssietteCarree extends Assiette {
	private double cote;

	public AssietteCarree(LocalDate d,double cote) {
		super(d);
		this.cote=cote;
	}
	public double calculSurface() {
		return cote*cote;
	}
	public double calculVal() {
		double x=super.calculVal();
		return 5*x;
	}
}

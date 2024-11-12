package tp6;

import java.time.LocalDate;

public class AssietteRonde extends Assiette{
	private double rayon;
	public AssietteRonde(LocalDate date,double rayon) {
		super(date);
		this.rayon=rayon;
	}
	public double calculSurface() {
		return 3.14*rayon*rayon;
	}
}

package tp6;

import java.time.LocalDate;

public abstract class Assiette extends Ustensile {
	
	public Assiette(LocalDate date) {
		super(date);
	}
	public abstract double calculSurface(); 
}

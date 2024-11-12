package tp6;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Ustensile {
    protected LocalDate date;

    public Ustensile(LocalDate date) {
        this.date=date;}
    public double calculVal() {
        LocalDate today=LocalDate.now();
        long y= ChronoUnit.DAYS.between(date,today);
        if (y<18250) return 0;
        else return y/365.0;
    }
}
